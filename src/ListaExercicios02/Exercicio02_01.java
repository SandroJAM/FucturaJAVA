package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_01 {

	public static void main(String[] args) {
		// Ler um número inteiro e exibir se o mesmo é PAR ou ÍMPAR

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número INTEIRO: ");
		int numInteiro = entrada.nextInt();

		if (numInteiro % 2 == 0) {
			System.out.println("O número informado é PAR!");
		} else {
			System.out.println("O número informado é ÍMPAR!");
		}
		entrada.close();
	}
}