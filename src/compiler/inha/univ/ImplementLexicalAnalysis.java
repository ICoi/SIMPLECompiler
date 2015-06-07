package compiler.inha.univ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Predictive parsing
 * Recursive-descent parsing
 * @author ICo
 *
 */
public class ImplementLexicalAnalysis implements LexicalAnalysis{
	private File sourceFile;
	private FileInputStream sourceFIS;
	
	private Token nextToken = null;
	
	public ImplementLexicalAnalysis() throws FileNotFoundException{
		System.out.println("Constructor Lexical Analysis");
		setDefault("testfile.txt");
	}
	
	public ImplementLexicalAnalysis(String fileName) throws FileNotFoundException{
		System.out.println("Constructor Lexical Analysis with file name");
		setDefault(fileName);
	}
	
	// set default data when Lexical Analysis constructors called
	public void setDefault(String fileName) throws FileNotFoundException{
		System.out.println("Lexical - setDefault()");
		sourceFile = new File(fileName);
		sourceFIS = new FileInputStream(sourceFile);
	
	}
	
	// read 1 character from file
	public char readNextChar() throws IOException{
		if(sourceFIS.available()!=0){
			// if remain character to read
			return (char)sourceFIS.read();
		}else{
			// if there are no character to read
			return '\0';
		}
	}
	
	// get next token
	public Token next(){
		System.out.println("NEXT");
		Token reToken = new Token();
		try {
			char c = readNextChar();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// if c is character
		// if c is integer 
		// if... -_-./.
		return reToken;
	}
	
	// show next token
	public Token peekNext(){
		Token reToken = new Token();
		return reToken;
		
	}
	/*
	public void testFileRead(){
	    File f=new File("testfile.txt");
	    FileInputStream fis;
		try {
			fis = new FileInputStream(f);
		    char a;
			 
		    for(int i=0;i<f.length();i++){     // 파일의 크기만큼 읽어온다.
		      
		      // read()는 1byte를 읽어와서 int로 반환하므로 char로 형 변환한다.
		      a=(char)fis.read();
		    
		      System.out.print(a);
		    }
		    fis.close();                    // 스트림을 닫는다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found exception error");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException Error");
			e.printStackTrace();
		}
	 }
	*/
}
