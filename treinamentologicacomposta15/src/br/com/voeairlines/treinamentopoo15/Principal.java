package br.com.voeairlines.treinamentopoo15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float salario = 0;
		float watts = 0;
		float dispesa = 0;

		System.out.printf("Digite valor do salário mínimo: ");
		salario = leia.nextFloat();

		System.out.printf("Digite o valor de kw: ");
		watts = leia.nextFloat();

		float calculoWatts = (salario / 7) / 100;

		System.out.printf("1Kw custa %.2f reais \n", calculoWatts);

		System.out.printf("O valor pago é de %.2f reais \n", calculoWatts * watts);

		System.out.printf("Aplicando o desconto de 10 por cento, o preço corrigido é %2.f reais",
				calculoWatts * watts / 10 * 9);

		leia.close();

	}

}
