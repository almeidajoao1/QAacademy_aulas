package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio11_medium;

public class TestesExercicio11_medium {
	

	
	@Test
	public void testeFibonacci () {
		
		Exercicio11_medium ex11 = new Exercicio11_medium();
		Assert.assertArrayEquals(3, ex11.calculaFibonacci(5));
		
	}
	

}
