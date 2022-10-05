package br.com.voeairlines.treinamentopoo22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a primeira medida: ");
		double medida1 = sc.nextDouble();
		System.out.println("Entre com a segunda medida: ");
		double medida2 = sc.nextDouble();

		double area = medida1 * medida2 / 2;
	
		System.out.printf("A área do losango é: %.2f", area);

		sc.close();

	}

}
