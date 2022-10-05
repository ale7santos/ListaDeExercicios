package br.com.voeairlines.treinamentopoo06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x = 0;
		int y = 0;

		System.out.println("Professor, digite qualquer número, desde que seja inteiro: ");
		x = leia.nextInt();

		System.out.println("Professor, digite qualquer outro número, desde que seja inteiro: ");
		y = leia.nextInt();

		System.out.println("O primeiro número digitado foi: " + x);
		System.out.println("O segundo número digitado foi: " + y);

		leia.close();

	}

}
