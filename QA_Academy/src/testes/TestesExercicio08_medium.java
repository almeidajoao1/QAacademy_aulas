package testes;

import org.junit.Test;

import aulas.Exercicio08_medium;
import aulas.Exercicio09_medium;

public class TestesExercicio08_medium {
	
	Exercicio08_medium ex8 = new Exercicio08_medium();
	Exercicio09_medium ex9 = new Exercicio09_medium();
	
	@Test
	public void testesMeses() {
		
		ex9.exibirVetor(ex8.criarVetorMesesDoAno());
		
	}
	
}
