package dlince;

import java.io.File;

public class Generador {

	public static void main(String[] args) {
		
		String path ="C:\\Users\\jpine\\eclipse-workspace\\AnalizadorLexico\\src\\dlince\\";
		String archivo = path + "lenguaje.lex";
		
		File file = new File(archivo);	
		jflex.Main.generate(file);

	}

}
