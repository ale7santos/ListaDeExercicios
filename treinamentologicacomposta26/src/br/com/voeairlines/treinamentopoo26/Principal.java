package br.com.voeairlines.treinamentopoo26;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor da prestação: ");
		double valor = sc.nextDouble();
		System.out.print("Informe a taxa de encargos: ");
		double taxa = sc.nextDouble();
		System.out.print("Informe o tempo de atraso: ");
		double tempo = sc.nextDouble();
		double prestacao = valor + (valor * (taxa / 100) * tempo);

		System.out.printf("O valor da prestação é R$: %.2f", prestacao);

		sc.close();

	}

}
