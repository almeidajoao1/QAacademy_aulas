package aulas;

public class Exercicio03_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int resultado = 0;
		
		while (i < 1000) {
			
			resultado = resultado + i;
			
			if (resultado == 1500) {
				
				break;
				
			}
			
			i++;
			
		}
		
		System.out.println(resultado);

	}

}
