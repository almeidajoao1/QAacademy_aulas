package aulas;

public class Exercicio07_medium {

	public int fatorial(int resultado, int i) {
		
		while (i>1) {
			
			resultado = resultado*(i-1);
			
			i--;
			
		}
		
		System.out.println("A fatoração é: " + resultado);
		
		return resultado;
	}

}
