package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_02 {

	public static void main(String[] args) {
		// Ler dois número inteiros e exibir qual o maior, o menor ou se são iguais!

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro número INTEIRO: ");
		int priNumero = entrada.nextInt();
		System.out.print("Informe o segundo número INTEIRO: ");
		int segNumero = entrada.nextInt();

		if (priNumero < segNumero) {
			System.out.println("Primeiro número menor segundo!");
		} else if (priNumero > segNumero) {
			System.out.println("Segundo número menor que o primeiro!");
		} else {
			System.out.println("Os número informados são IGUAIS!");
		}
		entrada.close();

	}
}