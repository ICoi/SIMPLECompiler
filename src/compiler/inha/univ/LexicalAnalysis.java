package compiler.inha.univ;

public interface LexicalAnalysis {
	public Token next();
	
	// show next token
	public Token peekNext();
}
