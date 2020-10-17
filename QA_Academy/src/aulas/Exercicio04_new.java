package aulas;
import javax.swing.JOptionPane;

public class Exercicio04_new {

	public static void main (String [] args) {
		
		int resultado, valordigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")); 
		resultado = valordigitado * 2;
		System.out.println("Dobro de " + valordigitado + " é igual a " + resultado);
		
	}
	
}
