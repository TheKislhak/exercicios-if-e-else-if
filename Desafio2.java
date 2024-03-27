package desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um valor: ");
		num = ler.nextDouble();
		
		if (num == 0) {
			System.out.println("O número é 0");
		} else if (num >= 1) {
			System.out.println("O número é positivo");
		} else if (num <= -1) {
			System.out.println("O número é negativo");
		}
		
		ler.close();
	}

}
