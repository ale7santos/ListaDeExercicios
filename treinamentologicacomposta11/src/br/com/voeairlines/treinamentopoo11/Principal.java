package br.com.voeairlines.treinamentopoo11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Double n;
		double tercaParte;

		
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe o Número"));
		tercaParte = n / 3;
		System.out.println("1/3 de: " + n + " é " + tercaParte);
	}
}
