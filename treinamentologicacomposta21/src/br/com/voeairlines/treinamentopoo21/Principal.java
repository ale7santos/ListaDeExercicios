package br.com.voeairlines.treinamentopoo21;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a base do triângulo: ");
		double base = sc.nextDouble();
		System.out.print("Entre com a Altura do triângulo: ");
		double altura = sc.nextDouble();

		double area = (base * altura) / 2;

		System.out.printf("A área do triângulo é: %.2f", area);

		sc.close();

	}

}
