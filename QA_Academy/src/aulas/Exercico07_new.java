package aulas;
import javax.swing.JOptionPane;

public class Exercico07_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valorINSS = 0.0;
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário"));
				
		valorINSS = valorINSS(salario);
		
		System.out.println("O valor é: R$ " + valorINSS );

 }

	public static double valorINSS(double salario) {
		
		double valorINSS = 0.0;
		
		if (salario <= 800.00) {
			
			valorINSS = salario * 0.5;
				
		}else if (salario >800.00 && salario <= 1039.00){
			
			valorINSS = salario * 0.11;
			
		}else if (salario >= 1039.00){
			
			valorINSS = salario * 0.20;
			
	   }
		return valorINSS;
	}
	
}
