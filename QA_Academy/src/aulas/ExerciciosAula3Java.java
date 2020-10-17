package aulas;
import javax.swing.JOptionPane;

public class ExerciciosAula3Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, resultado;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

//		Converte int para String

		resultado = n1 * 2;

		System.out.println("O resultado é " + resultado);

	}

}
