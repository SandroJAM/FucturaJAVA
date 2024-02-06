package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_14 {

	public static void main(String[] args) {
		// Leio um ano e exiba se o mesmo é bissexto ou não!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite uma ANO para saber se ele é BISSEXTO: ");
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("O ANO " + ano + " é BISSEXTO!");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ANO " + ano + " é BISSEXTO!");
		} else {
			System.out.println("O ANO " + ano + " NÃO é BISSEXTO!");
		}
		
		entrada.close();
	}
}