package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_04 {

	public static void main(String[] args) {
		// Ler a idade de uma pessoa e exibir se a mesma pode votar ou não nas eleições!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua IDADE: ");
		int idade = entrada.nextInt();
		
		if (idade >= 16 && idade < 18 || idade >= 70) {
			System.out.println("Para essa idade o VOTO é facultativo!");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("Para essa idade o VOTO é obrigatório!");
		} else {
			System.out.println("Essa idade não pode VOTAR!");
		}
		entrada.close();
	}
}