package br.com.voeairlines.treinamentopoo13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		double n4;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o número 1: "));

		n2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a número 2: "));
		
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a número 3:"));
		
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a número 4:"));

		double media = (n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4) / 4;
		System.out.println("MÉDIA PONDERADA: " + media);

	}



	}

