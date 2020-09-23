package dlince;

import java.io.IOException;
import java.io.StringReader;

public class FinalAnalizadorLexico {

	public static void main(String[] args) throws IOException {
		
		String expresion = "if 2+3+a then ";
		
		AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(expresion));
		lexico.yylex();
		

	}

}
