package testes;

import org.junit.Assert;
import org.junit.Test;

import aulas.Exercicio05_medium;

public class TestesExercicio05_medium {
	
	Exercicio05_medium ex5 = new Exercicio05_medium();
	
	@Test
	public void testeVerificaMenorVetor() {
		
		int vetNumerosDigitados []= {5,6,4,3,8};
		
		Assert.assertEquals(3, ex5.vetNumerosDigitados(vetNumerosDigitados));
		
		}
	}
