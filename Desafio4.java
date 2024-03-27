package desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double la1, la2, la3;

		System.out.println("Qual é o primeiro lado? ");
		la1 = ler.nextDouble();
		System.out.println("Qual é o segundo lado? ");
		la2 = ler.nextDouble();
		System.out.println("Qual é o terceiro lado? ");
		la3 = ler.nextDouble();

		if (la1 == la2 && la2 == la3 ) {
			System.out.println("Esse é o Triângulo Equilátero.");
		} else if (la1 == la2 || la2 == la3 || la3 == la1) {
			System.out.println("Esse é o Triângulo Isóceles.");
		} else {
			System.out.println("Esse é o Triângulo Escaleno");
		}

		ler.close();

	}

}
