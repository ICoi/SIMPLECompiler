import java.io.FileNotFoundException;
import java.io.IOException;

import compiler.inha.univ.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.out.println("Hello world");
			ImplementLexicalAnalysis lex = new ImplementLexicalAnalysis("testfile.txt");
			lex.next();
			//for(int i = 0 ; i < 1000 ; i++){
			//	System.out.print(lex.readNextChar());
			//}
	}

}
