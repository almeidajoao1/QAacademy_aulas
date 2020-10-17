package utils;

import java.text.DecimalFormat;

public class Utilidades {
	
	static DecimalFormat formatter = new DecimalFormat("########.##");
	public static String formatar (double valor) {
		
		return formatter.format(valor);
	}
}
