package testes;

import org.junit.Assert;
import org.junit.Test;
import aulas.Exercicio08_new;
import aulas.Utilidades;

public class TesteExercicio08 {
	
	Exercicio08_new ex8 = new Exercicio08_new();
	
	@Test
	public void testaCalculoIR() {
		
		Assert.assertEquals("Valor de IR Incorreto", "0,1", ex8.calculaIRString(1903.99));
		Assert.assertEquals("Valor de IR Incorreto", "69,2", ex8.calculaIRString(2826.66));
		Assert.assertEquals("Valor de IR Incorreto", "207,86", ex8.calculaIRString(3751.06));
		Assert.assertEquals("Valor de IR Incorreto", "413,43", ex8.calculaIRString(4664.69));
		Assert.assertEquals("Valor de IR Incorreto", "0", ex8.calculaIRString(1903.98));

	}
	
	@Test
	public void testaSalarioLiquido() {
		
		Assert.assertEquals("Valor de IR Incorreto", "1713,86", ex8.calculaSalarioLiquido(1903.99, ex8.calculaIR(1903.99), 190.03));
	}
	
	@Test
	public void testaCalculoIR_double() {
		
		Assert.assertEquals("Valor de IR Incorreto", "0,1", irpfFormatado(1903.99));
		Assert.assertEquals("Valor de IR Incorreto", "69,2", irpfFormatado(2826.66));
		Assert.assertEquals("Valor de IR Incorreto", "207,86", irpfFormatado(3751.06));
		Assert.assertEquals("Valor de IR Incorreto", "413,43", irpfFormatado(4664.69));
		Assert.assertEquals("Valor de IR Incorreto", "0", irpfFormatado(1903.98));
		
	}
	
	/**
	 * Método p/ formatar um double e transformar em uma String com 2 casas decimais
	 * @param salario
	 * @return String IRPF
	 */
	private String irpfFormatado (double salario) {
		
		return Utilidades.formatarDouble(ex8.calculaIR(salario));
	}

	
}
