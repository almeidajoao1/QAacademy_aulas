package aulas;

import javax.swing.JOptionPane;

public class Exercicio05_medium {

	public int verificaMenorSemVetor(int numeroDigitado) {
		
		int i = 0;
		int menor = 0;
		
		while (i<5) {
			
			numeroDigitado  = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
  
			if (numeroDigitado < menor || i==0) {
				
				menor = numeroDigitado;

		}
			
			i++;
			
 }
		
		System.out.println("O menor número é: " + menor);
		
		return menor;
	}
	

	public int vetNumerosDigitados(int[] vetNumerosDigitados) {
		
		int i = 0;
		int menor = 0;
		
		while (i< 5) {

  
			if (vetNumerosDigitados[i] < menor || i==0) {
				
				menor = vetNumerosDigitados[i];
		}
			
			i++;
			
 }
		
		System.out.println("O menor número é: " + menor);
		
		return menor;
	}

}