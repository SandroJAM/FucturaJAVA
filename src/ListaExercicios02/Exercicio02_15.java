package ListaExercicios02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio02_15 {

	public static void main(String[] args) {
		// Ler a hota atual no formato 24 horas e exibir uma saudação de acordo com o período do dia!
		Scanner entrada = new Scanner (System.in);
		
		//Obtém LocalDateTime de agora
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime hora = LocalDateTime.now();
        System.out.println("LocalDateTime antes de formatar: " + hora);
        formatter = DateTimeFormatter.ofPattern("HH");
        String horaFormatado = hora.format(formatter);
        System.out.println("LocalDateTime depois de formatar: " + horaFormatado);		

        System.out.println("Digite a HORA: ");
		double horaAtual = entrada.nextDouble();
		
		if (horaAtual >= 6 && horaAtual <= 12) {
			System.out.println("Bom Ddiaaaaaaaaa!");
		} else if (horaAtual > 12 && horaAtual <= 18) {
			System.out.println("Boa Tardeeeeeeee!");
		} else if (horaAtual > 18 && horaAtual  <= 24){
			System.out.println("Boa Noiteeeeeeee!");
		} else {
			System.out.println("Deve ser Madrugada!");
		}
		entrada.close();
	}
}