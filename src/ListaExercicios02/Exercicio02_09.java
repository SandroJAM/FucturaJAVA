package ListaExercicios02;

import java.util.Scanner;

public class Exercicio02_09 {

	public static void main(String[] args) {
		// Escreva um programa que leia a temperatura em graus Celsius e converta para graus Fahrenheit
		// ou Kelvin, de acordo com a escolha do usuário. 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a TEMPERATURA em Celsius: ");
		double celcius = entrada.nextDouble();
		
		System.out.println("Deseja converter para FAHRENHEIT ou KELVIN? ");
		String converterPara = entrada.next();
		
		if (converterPara.equalsIgnoreCase("F")) {
			double fahrenheit = (celcius * 9/5)+ 32;
			System.out.println("A temperatura CELCIUS: " + celcius + " convertita para FAHRENHEIT é: " + fahrenheit);
		} else if (converterPara.equalsIgnoreCase("K")){
			double kelvin = celcius + 273.15;
			System.out.println("A temperatura CELCIUS: " + celcius + " convertita para KELVIN é: " + kelvin);
		} else {
			System.out.println("Seleção Inválida!!!");
		}
		entrada.close();
	}
}