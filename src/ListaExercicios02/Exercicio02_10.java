package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_10 {

	public static void main(String[] args) {
		// Ler um salário e aplicar um aumento de acordo com a table aplicada!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o SAlÁRIO do FUNCIONÁRIO: ");
		double salario = entrada.nextDouble();
		
		if (salario <= 1500.00) {
			salario = salario + (salario * 15 / 100);
     		System.out.printf("O NOVO SALÁRIO com o aumento aplicado é: %.2f", salario);	
		} else if (salario >= 1500.01 && salario <= 2500.00) {
			salario = salario + (salario * 10 / 100);
			System.out.printf("O NOVO SALÁRIO com o aumento aplicado é: %.2f", salario);	
			
		} else {
			salario = salario + (salario * 5 / 100);
			System.out.printf("O NOVO SALÁRIO com o aumento aplicado é: 5.2f", salario);	
		}
		entrada.close();
	}
}