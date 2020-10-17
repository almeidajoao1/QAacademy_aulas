package aulas;

public class Exercicio10 {
	
	/**
	 * M�todo para calcular o rendimento de um investimento, considerando juros simples.
	 * @param n1
	 * @param juros
	 * @param ano
	 */

	public String calcularInvestimento(double n1, double juros, int ano) {
		
		double jurosAcumulados = 0;
		int i = 1;
		
		while (i <= ano) {
			
			jurosAcumulados = (n1 * juros) + jurosAcumulados;	
			
			i++;
			
		}
		
		System.out.println("O valor investido � de: " + n1);
		System.out.println("A taxa de juros � de: " + jurosAcumulados);
		System.out.println("O valor atualizado � de: " + (jurosAcumulados + n1));
		return Utilidades.formatarDouble(jurosAcumulados);
	}	
		
}
