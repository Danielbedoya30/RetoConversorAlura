package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {
	
	ConversorTemperatura conversorT = new ConversorTemperatura();
	
	
	public void CovertirTemperaturas(double valor) {
		
		String opcion = (String) (JOptionPane.showInputDialog(null, "Selecciona una opcion para convertir","Que unidades quieres convertir",
				JOptionPane.PLAIN_MESSAGE,null, new Object[] {
						"De Celsius a Fahrenhit","De Celsius a Kelvin","De Celsius a Rankine","De Fahrenhit a Celsius","De Kelvin a Celsius",
						"De Rankine a Celsius","De Fahrenhit a Kelvin","De Fahrenhit a Rankine","De Rankine Fahrenhit"
				},"Selecccion")).toString();
		
		switch(opcion) {
		case"De Celsius a Fahrenhit":
			conversorT.ConvertidorCelsiusFahrenheit(valor);
			break;
		case"De Celsius a Kelvin":
			conversorT.ConvertidorCelsiusKelvin(valor);
			break;
		case"De Celsius a Rankine":
			conversorT.ConvertidorCelsiusRankine(valor);
			break;
		case"De Fahrenhit a Celsius":
			conversorT.ConvertidorFahrenheitCelsius(valor);
			break;
		case"De Kelvin a Celsius":
			conversorT.ConvertidorKelvinCelsius(valor);
			break;
		case"De Rankine a Celsius":
			conversorT.ConvertidorRankineCelsius(valor);
			break;
		case"De Fahrenhit a Kelvin":
			conversorT.ConvertidorFahrenheitKelvin(valor);
			break;
		case"De Fahrenhit a Rankine":
			conversorT.ConvertidorFahrenheitRankine(valor);
			break;
		case"De Rankine Fahrenhit":
			conversorT.ConvertidorRankineFahrenheit(valor);
			break;
		}
	}

}
