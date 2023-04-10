package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConvertidorCelsiusFahrenheit(double valor){
		double cFahrenheit = (valor*1.8)+ 32;
		cFahrenheit = (double)Math.round(cFahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + cFahrenheit + " Fahrenheit");
	}
	
	public void ConvertidorCelsiusKelvin(double valor) {
		double cKelvin = valor + 273.15;
		cKelvin = (double)Math.round(cKelvin*100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + cKelvin + " Kelvin");
	}
	
	public void ConvertidorCelsiusRankine(double valor) {
		double cRankine = (valor*1.8)+ 491.67;
		cRankine = (double)Math.round(cRankine*100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + cRankine + " Rankine");
	}
	
	public void ConvertidorFahrenheitCelsius(double valor) {
		double fCelsius = (valor -32)*(0.556);
		fCelsius = (double)Math.round(fCelsius*100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + fCelsius + " Celsius");
	}
	
	public void ConvertidorKelvinCelsius(double valor) {
		double kCelsius = (valor - 273.15);
		kCelsius = (double)Math.round(kCelsius*100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + kCelsius + " Celsius");
	}
	
	public void ConvertidorRankineCelsius(double valor) {
		double rCelsius = (valor - 491.67) * (0.556);
		rCelsius = (double)Math.round(rCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + rCelsius + " Celsius");
	}
	
	public void ConvertidorFahrenheitKelvin(double valor) {
		double fKelvin = (valor + 459.67)*(0.556);
		fKelvin = (double)Math.round(fKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + fKelvin + " Kelvin");
	}
	
	public void ConvertidorFahrenheitRankine(double valor) {
		double fRankine = valor + 459.67;
		fRankine = (double)Math.round(fRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + fRankine + " Rankine");
	}
	
	public void ConvertidorRankineFahrenheit(double valor) {
		double rFahrenhit = valor - 459.67;
		rFahrenhit = (double)Math.round(rFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + rFahrenhit + " Fahrenheit");
	}

}
