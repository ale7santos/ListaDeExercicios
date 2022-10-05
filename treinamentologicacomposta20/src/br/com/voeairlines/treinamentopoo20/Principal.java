package br.com.voeairlines.treinamentopoo20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o lado A: ");
		double ladoA = sc.nextDouble();
		System.out.print("Entre com o lado B: ");
		double ladoB = sc.nextDouble();
		System.out.print("Entre com o lado C: ");
		double ladoC = sc.nextDouble();

		double teoremaP = Math.pow(ladoA, 2) + Math.pow(ladoB, 2) + Math.pow(ladoC, 2);
		double diagonal = Math.sqrt(teoremaP);

		
		
		System.out.printf("O resultado da Diagonal é: %.2f", diagonal);

		sc.close();

	}
}
