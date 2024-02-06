package ListaExercicios02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_08 {

	public static void main(String[] args) {
		// Ler o preço de um produto e a forma de pagamento e mostrar o valor final da compra!
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o VALOR do PRODUTO: ");
		double valorProduto = entrada.nextDouble();
		System.out.println("(1 - à vista, 2 - no cartão de crédito, 3 - no cartão de débito)");
		System.out.print("Informe a FORMA de PAGAMENTO ");
		int formaPagamento = entrada.nextInt();
		
		if (formaPagamento == 1 || formaPagamento == 3){
			double desconto = valorProduto * 0.1; // 10% do Valor do Produto!
			double valorComDesconto = valorProduto - desconto; // Valor com desconto!
			System.out.printf("O VALOR da sua COMPRA com DESCONTO é: %2.f", valorComDesconto);
		} else {
			System.out.printf("O VALOR da sua COMPRA é: %.2f", valorProduto);
		}
		entrada.close();
	}
}