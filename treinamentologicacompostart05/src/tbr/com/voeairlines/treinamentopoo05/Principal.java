package tbr.com.voeairlines.treinamentopoo05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Professor, digite qualquer número, desde que seja inteiro:");
		n = leia.nextInt();

		System.out.println("O número digitado é o: " + n);

		leia.close();
	}
}
