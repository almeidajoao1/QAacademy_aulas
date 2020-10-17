package aulas;

import java.text.DecimalFormat;

public class Utilidades {
	
	static DecimalFormat formatter = new DecimalFormat("########.##");
	public static String formatarDouble (double valor) {
		
		return formatter.format(valor);
	}
}
