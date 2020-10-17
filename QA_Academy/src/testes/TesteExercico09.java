package testes;

import org.junit.Test;

import aulas.Exercicio09;

public class TesteExercico09 {
	
	Exercicio09 ex9 = new Exercicio09 ();
	
	@Test
	public void testeTabuada () {
		
		ex9.calculaTabuada(60);
		
	}

}
