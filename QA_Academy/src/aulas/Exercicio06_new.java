package aulas;

public class Exercicio06_new {

	public int calculoMedia(int valorDigitado1, int valorDigitado2) {
		
		int resultado;
		
		resultado = (valorDigitado1 + valorDigitado2)/2;
		
		System.out.println("A média é: " + resultado);
		
		if (resultado >  5) {
			
			System.out.println("Aprovado!");
			
		} 
		
		else if (resultado ==  5) {
			
			System.out.println("Exame");
			
		}
		
		
		else {
			
			System.out.println("Reprovado!");
		}
		
		return resultado;
	} 
}