package br.com.voeairlines.treinamentopoo17;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		// diagonal == altura2 + base2

		Float base, altura, area, perimetro, diagonal;

		base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do rêtangulo"));

		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do rêtangulo"));
		
		perimetro = (2 * base) + (2 * altura);
		area = base * altura;
		diagonal = (float) Math.sqrt(altura* altura + perimetro*perimetro);

		System.out.println("Um retângulo com as seguintes medidas :" + "\n" + "altura: " + altura +
				"\n" + "base: " + base + "\n" + "Possui o perímetro de "
				+ perimetro + " a área " + area + " e a sua diagonal é " + diagonal);
				
	}

}

