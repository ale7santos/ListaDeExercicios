package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Professor digite de 1 a 26 para corrigir o meu trabalho de POO final:");
		int op = leia.nextInt();

		switch (op) {
		case 1:
		/*	Algoritmo01 alg1 = new Algoritmo01();
			String m = alg1.imprimirMensagem();
			System.out.println(m);*/
			
			/*Algoritmo01 alg1 = new Algoritmo01();
			System.out.println(alg1.imprimirMensagem());*/
			
			System.out.println(new Algoritmo01().imprimirMensagem());

		}

		leia.close();

	}

}
