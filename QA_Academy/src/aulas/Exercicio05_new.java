package aulas;

public class Exercicio05_new {
	
	/**
	 * @author Vitao
	 * @param numero_digitado1 Primeiro valor
	 * @param numero_digitado2 Segundo valor
	 * @param numero_digitado3 Terceiro valor
	 * @return operation
	 */
	public int multiplicação(int numero_digitado1, int numero_digitado2, int numero_digitado3) {
		int multiplicação;
		multiplicação = numero_digitado1 * numero_digitado2 * numero_digitado3;
		
		System.out.println("O valor multiplicado é: " + multiplicação);
		
		return multiplicação;
	
	}

	public String subtração(double numero_digitado1, double numero_digitado2, double numero_digitado3) {
		double subtração;
		subtração = numero_digitado1 - numero_digitado2 - numero_digitado3;
		
		System.out.println("O valor subtraído é: " + subtração);
		
		return Utilidades.formatarDouble(subtração);
	}

	public int soma(int numero_digitado1, int numero_digitado2, int numero_digitado3) {
		int soma;
		soma = numero_digitado1 + numero_digitado2 + numero_digitado3;
		
		System.out.println("O valor somado é: " + soma);
		
		return soma;
	}

	public int media(int numero_digitado1, int numero_digitado2, int numero_digitado3) {
		int media;
		media = (numero_digitado1 + numero_digitado2 + numero_digitado3)/3;
		
		System.out.println("O valor da média é: " + media);
		
		return media;
	}

}