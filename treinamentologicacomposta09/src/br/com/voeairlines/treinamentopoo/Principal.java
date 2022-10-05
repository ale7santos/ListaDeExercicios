package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int x = 0;
		int y = 0;
		

		System.out.println("Digite um número inteiro: ");
		x = leia.nextInt();

		System.out.println("Digite outro número inteiro: ");
		y = leia.nextInt();

		int soma = x + y;
		
		System.out.println("SOMA: " + soma);

		leia.close();

	}

}
