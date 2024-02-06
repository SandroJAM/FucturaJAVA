package ListaExercicios03;

import java.util.Scanner;

public class Exercicio03_03 {

	public static void main(String[] args) {
		// Implementar um sistema de semáforo usando switch case!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ação do SEMÁFORO (1 = VERDE; 2 = AMARELO e 3 = VERMELHO: ");
		int acao = input.nextInt();
		
		switch(acao) {
		case 1:
			System.out.println("Passe, SINAL VERDE!");
			break;
		case 2:
			System.out.println("Alerta, SINAL AMARELO!");
			break;
		case 3:
			System.out.println("Pare, SINAL VERMELHO");
			break;
		}
		input.close();
	}
}