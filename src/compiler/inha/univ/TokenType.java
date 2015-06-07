package compiler.inha.univ;

public enum TokenType {
	PROGRAM,
	// Types
	VAR, INTEGER, CHAR, BOOLEAN,
	// Program blocks
	BEGIN, END, PROGRAMEND,
	// Condition, Recursion
	DO, IF, THEN, ELSIF, ELSE, WHILE,
	// Datas
	NUMBER, CHARACTER, WRITE, READ,
	// True or False
	NOT, TRUE, FALSE,
	//  Boolean Expression
	OR, AND,
	// Ect symbols
	SEMICOLON, COMMA, ASSIGN, PAREN_LEFT, PARENT_RIGHT, COLON, 
	// Arithmatic operator
	PLUS, MINUS, MULTI, DIVIDE,
	// Comparison operator
	LESS, BIG, EQL, LESSEQL, BIGEQL, NOTEQL
	
}
