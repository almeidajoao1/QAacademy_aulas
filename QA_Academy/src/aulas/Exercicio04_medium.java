package aulas;

public class Exercicio04_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int resultado = 1;
		
		while (i <= 1000) {
			
			resultado = resultado * i;
			
			if (resultado == 1500) {
				
				resultado = resultado/resultado;
				
			}
			
			i++;
			
		}
		
		System.out.println(resultado);
	}

}
