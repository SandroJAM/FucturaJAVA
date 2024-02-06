package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_07 {

	public static void main(String[] args) {
		// Ler dois números e um operador e realize a operação correspondente!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		System.out.println("Digite a OPERADOR para realizar (+,-,* ou /): ");
		String operador = entrada.next();
		
		System.out.println("O operador informado foi: ( " + operador + " )");
		
		if (operador == "+"){
			System.out.println("A soma dos números é: " + (numero1 + numero2));
		} else if (operador == "-"){
			System.out.println("A subtração dos números é: " + (numero1 - numero2));
		} else if (operador == "*"){
			System.out.println("A multiplicação dos números é " + (numero1 * numero2));
		} else if (operador == "/"){
			System.out.println("A divisão dos números é " + (numero1 / numero2));
		} else {
			System.out.println("Operador inválido!");
		}
		entrada.close();
	}
}