package aulas;
import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		int resultado =0;
		
		while (i<=100) {
			
			resultado = numero + i;
			
			i++;
			
		}
		
		System.out.println("O resultado é: " + resultado);

	}

}
