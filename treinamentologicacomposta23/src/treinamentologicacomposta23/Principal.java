package treinamentologicacomposta23;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		System.out.print("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");

		sc.close();

	}

}
