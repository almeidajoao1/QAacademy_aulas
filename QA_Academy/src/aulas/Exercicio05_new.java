package aulas;

public class Exercicio05_new {
	
	/**
	 * @author Vitao
	 * @param numero_digitado1 Primeiro valor
	 * @param numero_digitado2 Segundo valor
	 * @param numero_digitado3 Terceiro valor
	 * @return operation
	 */
	public int multiplica��o(int numero_digitado1, int numero_digitado2, int numero_digitado3) {
		int multiplica��o;
		multiplica��o = numero_digitado1 * numero_digitado2 * numero_digitado3;
		
		System.out.println("O valor multiplicado �: " + multiplica��o);
		
		return multiplica��o;
	
	}

	public String subtra��o(double numero_digitado1, double numero_digitado2, double numero_digitado3) {
		double subtra��o;
		subtra��o = numero_digitado1 - numero_digitado2 - numero_digitado3;
		
		System.out.println("O valor subtra�do �: " + subtra��o);
		
		return Utilidades.formatarDouble(subtra��o);
	}

	public int soma(int numero_digitado1, int numero_digitado2, int numero_digitado3) {
		int soma;
		soma = numero_digitado1 + numero_digitado2 + numero_digitado3;
		
		System.out.println("O valor somado �: " + soma);
		
		return soma;
	}

	public int media(int numero_digitado1, int numero_digitado2, int numero_digitado3) {
		int media;
		media = (numero_digitado1 + numero_digitado2 + numero_digitado3)/3;
		
		System.out.println("O valor da m�dia �: " + media);
		
		return media;
	}

}