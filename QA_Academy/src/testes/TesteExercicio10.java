package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio10;

public class TesteExercicio10 {
	
	Exercicio10 ex10 = new Exercicio10 ();
	
	@Test
	public void testarExercicio10 () {
		
		Assert.assertEquals("Valor do juros re  tornado com erro","300",ex10.calcularInvestimento(1000.00, 0.03, 10));
	}
	

}
