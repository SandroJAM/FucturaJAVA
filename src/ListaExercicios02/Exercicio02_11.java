package ListaExercicios02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio02_11 {

	public static void main(String[] args) {
		// Ler o ano de nascimento de uma pessoa e exibir se a mesma é maior de idade ou não,
		// baseando-se pelo ano atual!
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu ano de nascimento: ");
		var dataNascimento = entrada.nextLine();
	    var dataHoje = LocalDate.now();
	    
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy");
	    var anoHoje = dataHoje.format(formato);
	    
	    int anoNascimento = Integer.valueOf(dataNascimento); 
	    int anoAtual = Integer.valueOf(anoHoje); 
	    int suaIdade = anoAtual - anoNascimento;
	    System.out.println("\nA sua IDADE é: " + suaIdade);
	    
	    if (suaIdade < 18) {
	       System.out.println("Você é MENOR de IDADE!"); 	
	    } else {
	       System.out.println("Você é MAIOR de IDADE!"); 	
	    }
		entrada.close();
	}
}