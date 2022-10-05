package br.com.voeairlines.treinamentopoo24;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informa a temperatura em graus Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.printf("A temperatura convertida para graus Fahrenheit é: %.1fºF", fahrenheit);

		sc.close();
	}

}
