package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio05_new;

public class TestesExercicio05 {
	
	Exercicio05_new ex5 = new Exercicio05_new();
	
	@Test
	
	public void testesExercicio05 () {
		
		Assert.assertEquals("Multiplicação errada",125, ex5.multiplicação(5, 5, 5));
		Assert.assertEquals("Soma errada",15, ex5.soma(5, 5, 5));
		Assert.assertEquals("Media errada",5, ex5.media(5, 5, 5));
		Assert.assertEquals("Subtração errada",-5.0, ex5.subtração(5, 5, 5));
	}

}
