package br.com.voeairlines.treinamentopoo18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Double raio, perimetro, area, pi;

		raio = Double.parseDouble(JOptionPane.showInputDialog("Entre com o raio do círculo: ")); 
		pi = 3.1415;
		perimetro = 2 * pi * raio;
		area = pi * Math.pow(raio, raio);

		System.out.println("Valor raio = " + raio);
		System.out.println("Perímetro raio = " + perimetro);
		System.out.println("Área raio= " + area);
	}

}
