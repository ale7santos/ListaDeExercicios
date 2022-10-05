package br.com.voeairlines.treinamentopoo25;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a altura da lata: ");
		double altura = sc.nextDouble();
		System.out.println("Informe o raio da lata: ");
		double raio = sc.nextDouble();

		double volume = 3.14159 * Math.pow(raio, 2) * altura;

		System.out.printf("O volume da lata é: %.3f", volume);

		sc.close();

	}

}
