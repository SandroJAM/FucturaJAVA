package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_13A {

	public static void main(String[] args) {
		// Ler um número inteiro entre 1 e 7 e mostrar o dia da semana correspondente,
		// e se o número não estiver nesse intervalo, exiba uma mensagem de erro.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe um número INTEIRO entre (1 e 7): ");
		
		int numInteiro = entrada.nextInt();
		
		if (numInteiro == 7) {
			System.out.println("Domingo");
		} else if (numInteiro == 6) {
			System.out.println("Segunda-Feira");
		} else if (numInteiro == 5) {
			System.out.println("Terça-Feira");
		} else if (numInteiro == 4) {
			System.out.println("Quarta_Feira");
		} else if (numInteiro == 3) {
			System.out.println("Quinta-Feira");
		} else if (numInteiro == 2) {
			System.out.println("Sexta-Feira");
		} else if (numInteiro == 1) {
			System.out.println("Sábado");
		} else {
			System.out.println("Opção Inválida!");
		}
		entrada.close();
	}
}