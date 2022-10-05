package br.com.voeairlines.treinamentopoo08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite seu endereço: ");
		endereco = leia.next();
		
		System.out.println("Informe seu telefone: ");
		telefone = leia.next();
		
		System.out.println("O seu nome é " + nome + ", o endereço é " + endereco + " e o telefone é " + telefone);
		
				
		leia.close();
	}

}
