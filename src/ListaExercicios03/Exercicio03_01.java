package ListaExercicios03;

import java.util.Scanner;

public class Exercicio03_01 {

	public static void main(String[] args) {
		// Ler um número de 1 a 7 e retornar o dia da semana correspondente
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe (DIAS DA SEMANA) um número entre 1 e 7: ");		
		int numero = input.nextInt();
		switch(numero) {
		   case 1:
			   System.out.println("Domingo");
			   break;
		   case 2:
			   System.out.println("Segunda-Feira");
			   break;
		   case 3:
			   System.out.println("Terça-Feira");
			   break;
		   case 4:
			   System.out.println("Quarta-Feira");
			   break;
		   case 5:
			   System.out.println("Quinta-Feira");
			   break;
		   case 6:
			   System.out.println("Sexta-Feira");
			   break;
		   case 7:
			   System.out.println("Sábado");
			   break;
		   default:
	            System.out.println("Número inválido. Por favor, digite um número de 1 a 7.\n");
	            break;
		}
		
		input.close();
		
	}
}