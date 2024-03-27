package desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		// Variaveis
		Scanner ler = new Scanner(System.in);
		int num;

		// intercalar classes
		System.out.println("Digite seu número: ");
		num = ler.nextInt();

		// Entrada de dadas
		if (num % 2 == 1) {
			System.out.println("O número é impar");
		} else {
			System.out.println("O némero é par");
		}

		ler.close();

	}

}