package br.com.voeairlines.treinamentopoo12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double n1;
		double n2;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 1"));

		n2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 2"));

		double media = (n1 + n2) / 2;
		System.out.println("MÉDIA: " + media);

	}

}
