package aulas;
import javax.swing.JOptionPane;

public class ExerciciosAula2Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3-) Fa�a um algoritimo para ler dois valores, armazenar em vari�veis, e exibir os valores das vari�veis, trocados.
		
		String texto1, texto2, auxiliarTexto;
		
		texto1 = JOptionPane.showInputDialog("Insira um valor");
		
		texto2 = JOptionPane.showInputDialog("Insira um valor");	
		
		auxiliarTexto = texto1;
		
		texto1 = texto2;
		
		texto2 = auxiliarTexto; 
		
//		System.out.println(texto2 +" e "+texto1);
		
		System.out.println(texto1 +" e "+texto2);
		
	}

}
