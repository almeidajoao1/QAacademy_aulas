package aulas;

public class Exercicio01_medium {

	public int calculoPareImpar(int i) {
		
		while (i<=100) {
			 
			if ( i%2==0 ){
				
			System.out.println("O número é: " + i + " par.");	
				
			} else {
				
				System.out.println("O número é: " + i + " ímpar.");
			} 
			
			i++;
			 
		 }
		
		return i;
	}
	
}
