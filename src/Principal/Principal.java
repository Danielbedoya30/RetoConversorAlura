package Principal;

import javax.swing.JOptionPane;

import ConversorMonedas.MenuOpciones;
import ConversorTemperaturas.OpcionesTemperatura;

public class Principal {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		MenuOpciones conversion = new MenuOpciones();
		OpcionesTemperatura conversorT = new OpcionesTemperatura();
		
		while(flag) {
			
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión","Menu", JOptionPane.PLAIN_MESSAGE,null,
					new Object[] {"Conversor de Monedas","Conversor de temperatura"},"Elegir").toString();
			switch(opciones) {
			
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null,"Ingrese valor a convertir");
				  if (validarNumero(input))	{
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Entra");
					}else {
						flag =false;
						JOptionPane.showMessageDialog(null, "Programa Finalizado");
						
					}break;
				  }else {
						JOptionPane.showMessageDialog(null, "Valor invalido");
				  }
			  case"Conversor de temperatura":
				 String input2 = JOptionPane.showInputDialog(null,"Ingrese la temperatura a convertir");
				 if(validarNumero(input2)) {
					 double valorRecibidoT = Double.parseDouble(input2);
					 conversorT.CovertirTemperaturas(valorRecibidoT);
					 
					 
					 int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión");
					 if(JOptionPane.OK_OPTION == respuestaT) {
						 System.out.println("Entra"); 
					 }else {
						 flag=false;
						 JOptionPane.showMessageDialog(null, "Programa Finalizado");
						
					 }break;
				 }else {
					 JOptionPane.showMessageDialog(null, "Valor invalido");
				 }

			}
		}
		
		
		
	}
	
	public static boolean validarNumero(String input) {
		try {
			double x= Double.parseDouble(input);
			if(x>=0 || x<0);
			 return true;
			
		}catch(NumberFormatException e){
			return false;
		}
		
	}

}
