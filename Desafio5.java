package desafios;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String cpf, cpf2, sen, sen1;
		double sal, sal1, sacar;

		cpf2 = "462.983.248-36";
		sen1 = "980";
		sal = 100000.00;

		System.out.println("Digite o seu CPF: ");
		cpf = ler.nextLine();

		if (cpf.equals(cpf2)) {
			System.out.println("Agora digete sua senha");
			sen = ler.nextLine();

			if (sen.equals(sen1)) {
				System.out.println("Seu saldo é de R$"+ sal);
				System.out.println("Quanto deseja retirar? ");
				sacar = ler.nextDouble();

				if (sacar <= sal) {
					sal1 = sal - sacar;
					System.out.println("Você agora tem: R$" + sal1);
				} else {
					System.out.println("Saldo insuficiente");
				}

			} else {
				System.out.println("Senha errada.");
			}
		} else {
			System.out.println("CPF errado.");
		}

		ler.close();
	}

}
