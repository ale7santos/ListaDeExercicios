package br.com.voeairlines.treinamentopoo14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double saldo;

		saldo = Double.parseDouble(JOptionPane.showInputDialog("ENTRE COM O SALDO"));

		saldo = saldo + (saldo * 0.01);

		System.out.println("O SALDO ATUAL É DE: " + saldo);

	}

}
