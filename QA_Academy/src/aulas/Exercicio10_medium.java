package aulas;

import javax.swing.JOptionPane;

public class Exercicio10_medium {
	
	public void recebeNomeENumeroAlunos() {
		
		String nomeAluno [] = new String [5];
		int numeroAluno [] = new int [5];
		
		receberNumerosAlunos(nomeAluno, numeroAluno);
		
	}

	public void receberNumerosAlunos(String[] nomeAluno, int[] numeroAluno) {
		
		int i = 0;
		
		while (i<5) {
			
			nomeAluno [i] = JOptionPane.showInputDialog("Digite o nome do aluno");
			numeroAluno [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do aluno"));
			
			System.out.println("Os nomes dos alunos s�o: " + nomeAluno [i]);
			System.out.println("Os n�meros dos alunos s�o: " + numeroAluno [i]);
			
			i++;
		}
	}
	
}
