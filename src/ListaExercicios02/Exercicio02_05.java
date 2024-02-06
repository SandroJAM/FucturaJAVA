package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_05 {

	public static void main(String[] args) {
		// Ler o mês do ano em número (1 -12) e exibir quantos dias o mês tem.
		// Considreando que o ano não é bissexto!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número correspondente a um MÊS: ");
		int numMes = entrada.nextInt();
		
		if (numMes == 1 || numMes == 3 || numMes == 5 || numMes == 7 || numMes == 8 || numMes == 10
				|| numMes == 12){
			System.out.println("Esse mês possui 31 dias!");
		} else if (numMes == 4 || numMes == 6 || numMes == 9 || numMes == 11) {
			System.out.println("Esse mês possi 30 dias!");
		} else {
			System.out.println("Esse mês possui 28 dias!");
		}
		entrada.close();
	}
}