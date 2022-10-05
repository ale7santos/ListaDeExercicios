package br.com.voeairlines.treinamentopoo10;

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

		int produto = x * y;
		
		System.out.println("O resultado é: " + produto);

		leia.close();

	}



	}


