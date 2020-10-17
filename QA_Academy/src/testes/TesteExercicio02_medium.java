package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio02_medium;

public class TesteExercicio02_medium {
	
	Exercicio02_medium ex2 = new Exercicio02_medium();
	
	@Test
	public void testeExercico02 () {
		
		Assert.assertEquals(1000, ex2.calculoInvestimento(resultado, numero, juros));
		
	}

}
