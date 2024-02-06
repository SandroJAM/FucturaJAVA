package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_12 {

	public static void main(String[] args) {
		// Ler PSEO e Altura de uma pessoa e calcular o seu índice de massa corporal IMC!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe o seu PESO: ");
		double seuPeso = entrada.nextDouble();
		System.out.printf("Inorme a sua Altura:");
		double suaAltura = entrada.nextDouble();

		double seuIMC = seuPeso / (suaAltura * suaAltura);
		
		if (seuIMC < 18.5) {
			System.out.println("Classificação: Abaixo do PESO!");
		} else if (seuIMC >= 18.5 && seuIMC <= 24.9) {
			System.out.println("Classificação: PESO Normal!");
		} else if (seuIMC >= 25 && seuIMC <= 29.9) {
			System.out.println("Classificação: SOBREPESO!");
		} else if (seuIMC >= 30 && seuIMC <= 34.9) {
			System.out.println("Classificação: Obesidade Grau I!");
		} else if (seuIMC >= 35 && seuIMC <= 39.9) {
			System.out.println("Classificação: Obesidade Grau II!");
		} else if (seuIMC > 40) {
			System.out.println("Classificação: Obesidade Grau III!");
		}
		entrada.close();
	}
}