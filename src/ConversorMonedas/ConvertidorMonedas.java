package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertidorMonedas {
	

	public void ConvertidorPesosDolares(double valor) {

		double valorDolar = valor / 4677.63;
		valorDolar = Math.round(valorDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorDolar + " Dolares");

	}
	

	public void ConvertidorPesosEuros(double valor) {

		double valorEuros = valor / 5052.46;
		valorEuros = Math.round(valorEuros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes € " + valorEuros + " Euros");

	}
	
	
	public void ConvertidorPesosLibras(double valor) {

		double valorLibras = valor / 5749.22;
		valorLibras = Math.round(valorLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes £ " + valorLibras + " Libras");

	}
	
	public void ConvertidorPesosYen(double valor) {

		double valorYen = valor / 35.56;
		valorYen = Math.round(valorYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ¥ " + valorYen + " Yen Japanes");

	}
	
	public void ConvertidorPesosWon(double valor) {

		double valorWon = valor / 3.60;
		valorWon= Math.round(valorWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes ₩ " + valorWon + " Won SurCoreano");

	}
	
	public void ConvertidorDolaresPesos(double valor) {

		double valorPesos = valor * 4677.63;
		valorPesos = Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorPesos + " Pesos Colombianos");

	}
	

	public void ConvertidorEurosPesos(double valor) {

		double valorPesos = valor * 5052.46;
		valorPesos = Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorPesos + " Pesos Colombianos");

	}
	
	public void ConvertidorLibrasPesos(double valor) {

		double valorPesos = valor * 5749.22;
		valorPesos = Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorPesos + " Pesos Colombianos");

	}
	

	public void ConvertidorYenPesos(double valor) {

		double valorPesos = valor * 35.56;
		valorPesos = Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorPesos + " Pesos Colombianos");

	}
	

	public void ConvertidorWonPesos(double valor) {

		double valorPesos = valor * 3.60;
		valorPesos = Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorPesos + " Pesos Colombianos");

	}
	

}
