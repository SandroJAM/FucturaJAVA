package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_03 {

	public static void main(String[] args) {
		// Ler três notas de uma aluno e calcular a média!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a primeira NOTA: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Qual a segunda NOTA: ");
		double nota2 = entrada.nextDouble();
		System.out.println("Qual a terceira NOTA: ");
		double nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.println("O aluno foi APROVADO!");
		} else if (media >= 4 && media <= 7){
			System.out.println(" O aluno deverá fazer PROVA FINAL!");
		} else {
			System.out.println("O aluno foi REPROVADO!");
		}
		entrada.close();
	}
}