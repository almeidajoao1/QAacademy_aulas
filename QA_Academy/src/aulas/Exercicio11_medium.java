package aulas;

import javax.swing.JOptionPane;

public class Exercicio11_medium {

	
	public int calculaFibonacci(int termo) {
		// TODO Auto-generated method stub
		
		int i = 2;
		int numeroDigitado = termo;
		int [] vetFibonacci new int [numDigitado];
		
		vetFibonacci [0] = 0;
		vetFibonacci [1] = 1;
		
		while (i< termo ) {
			
			vetFibonacci [i] = vetFibonacci [i-1]+ vetFibonacci [i+2];
			
			i++;
			
		}
		
		return vetFibonacci[numDigitado-1];
	}

	}
	
	/* public void fibonacci () {
	
	int valorDigitado [] = new int [10];
	
	digitadoFibonacci(valorDigitado);
	
}

public void digitadoFibonacci(int[] valorDigitado, int resultado) {
	
	int i = 0;
	
	while (i<10) {
		
		valorDigitado [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do aluno"));
		
		resultado = resultado + (i+1);
		
		System.out.println("A sequência é: " + valorDigitado [i]);

		i++;
	}
}
	
}

*/