package aulas;

public class Exercicio02_medium {
	
	int i;

	public String calculoInvestimento(double resultado, float numero, double juros) {
		
		System.out.println("O valor investido �: " + numero);
		System.out.println("O valor do juros �: " + (resultado - numero));
		System.out.println("O valor final �: " + resultado);
		
		while (i<=10) {
			
			resultado = numero * (juros * numero);
			
			i++;
		}
		
		 return Utilidades.formatarDouble(resultado);
	
	}

}