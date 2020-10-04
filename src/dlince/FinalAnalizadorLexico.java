package dlince;

import java.io.IOException;
import java.io.StringReader;

public class FinalAnalizadorLexico {

	public static void main(String[] args) throws IOException {
		
		archivo a = new archivo();
		
		String expresion =a.leerTxt("C:\\Users\\jpine\\eclipse-workspace\\AnalizadorLexico\\src\\dlince\\Box.txt");
		
		AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(expresion));
		lexico.yylex();
		

	}

}
