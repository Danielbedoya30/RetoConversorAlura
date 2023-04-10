package ConversorMonedas;

import javax.swing.JOptionPane;

public class MenuOpciones {

	ConvertidorMonedas convertidor = new ConvertidorMonedas();

	public void ConvertirMonedas(double valor) {
		String opcion = (String) (JOptionPane.showInputDialog(null, "Selecciona una opcion a convertir",
				"A que moneda quieres convertir", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De pesos a Dolares", "De pesos a Libras Esterlinas", "De pesos a Yen Japones",
						"De pesos a Won", "De Dolares a pesos", "De Libras Esterlinas a Pesos", "De Yen a Pesos",
						"De Won a pesos" },
				"Seleccione")).toString();
		switch (opcion) {
		case "De pesos a Dolares":
			convertidor.ConvertidorPesosDolares(valor);
			break;
		case "De pesos a Libras Esterlinas":
			convertidor.ConvertidorPesosLibras(valor);
			break;
			
		case "De pesos a Yen Japones":
			convertidor.ConvertidorPesosYen(valor);
			break;
		case "De pesos a Won":
			convertidor.ConvertidorPesosWon(valor);
			break;	
			
		case "De Dolares a pesos":
			convertidor.ConvertidorDolaresPesos(valor);
			break;
		case "De Libras Esterlinas a Pesos":
			convertidor.ConvertidorLibrasPesos(valor);
			break;
		case "De Yen a Pesos":
			convertidor.ConvertidorYenPesos(valor);;
			break;		
		}
	
		
		
	}
}