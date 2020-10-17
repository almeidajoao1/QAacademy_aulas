package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio07_medium;

public class TestesExercicio07_medium {
	
	Exercicio07_medium ex7 = new Exercicio07_medium();
	
	@Test
	public void testeFatorial () {
		
		Assert.assertEquals(120, ex7.fatorial(5, 5));
	}

}
