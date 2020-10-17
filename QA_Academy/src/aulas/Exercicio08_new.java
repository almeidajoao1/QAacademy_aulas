package aulas;

public class Exercicio08_new {
	
	/**
	 * @author João Vitor
	 * @param salario
	 * @param valorIR
	 * @param valorINSS
	 * @return Formata o valor do salário de saída para String
	 */
	public String calculaSalarioLiquido(double salario, double valorIR, double valorINSS) {
	
		 return Utilidades.formatarDouble(salario - (valorINSS + valorIR));
		 
	}

	public double calculaIR(double salario) {
		double valorIR;
		if (salario >= 1903.99 && salario <= 2826.65 ) {
			
       	 valorIR = (salario * 0.075) - 142.70;
			
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			
			valorIR = (salario * 0.15) - 354.80;
			
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			
			valorIR = (salario * 0.225) - 636.13;
			
		} else if (salario > 4664.68) {
			
			valorIR = (salario * 0.275) - 869.36;
			
		}
		
		else {
			
			valorIR = 0.00;
			
		}
		return valorIR;
	}
	
	public String calculaIRString(double salario) {
		
		double valorIR;
		if (salario >= 1903.99 && salario <= 2826.65 ) {
			
        	 valorIR = (salario * 0.075) - 142.70;
			
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			
			valorIR = (salario * 0.15) - 354.80;
			
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			
			valorIR = (salario * 0.225) - 636.13;
			
		} else if (salario > 4664.68) {
			
			valorIR = (salario * 0.275) - 869.36;
			
		}
		
		else {
			
			valorIR = 0.00;
			
		}
		return Utilidades.formatarDouble(valorIR);
	}

}
