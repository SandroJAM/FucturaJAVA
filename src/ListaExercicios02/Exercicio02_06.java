package ListaExercicios02;

import javax.swing.JOptionPane;

public class Exercicio02_06 {

	public static void main(String[] args) {
		// Ler uma letra do alfabeto e exibir se ela é volgal ou uma consoante!
		// O método charAt () da classe Java String retorna um valor char no número de índice fornecido.
		
		String umaLetra = JOptionPane.showInputDialog(null, "Informe uma LETRA: ");
				
		if (umaLetra.equalsIgnoreCase("A")
			|| umaLetra.equalsIgnoreCase("E")
			|| umaLetra.equalsIgnoreCase("I")
			|| umaLetra.equalsIgnoreCase("O")
			|| umaLetra.equalsIgnoreCase("U")){
			
			JOptionPane.showMessageDialog(null, "( " + umaLetra + " )" + " É Vogal");
			
		} else {
			JOptionPane.showMessageDialog(null,"( " + umaLetra + " )" + " É Consoante");
		}
	}
}