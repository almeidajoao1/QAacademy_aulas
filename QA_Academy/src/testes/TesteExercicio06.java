package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio06_new;

public class TesteExercicio06 {
	
	Exercicio06_new ex6 = new Exercicio06_new();
	
	@Test
	public void TestesExercicio06() {
		  
		 Assert.assertEquals(5, ex6.calculoMedia(5, 5));
		
	}
	

}
