public static void exp() {
	 System.out.println("Enter <expr>\n");
	
	 term();
	
	 while (nextToken == ADD_OP || nextToken == SUB_OP) {
		 lex();
		 term();
	 }
System.out.println("Exit <expr\n"):
}


public static void term() {
	 System.out.println("Enter <term>\n");
	
	 factor();
	
	 while (nextToken == MULT_OP || nextToken == DIV_OP) {
		 lex();
		 factor();
	 }
	  System.out.println("Exit <term>\n");
}

public static void factor(){
	 System.out.println("Enter <factor>\n"):
	
	 if (nextToken == IDENT || nextToken == INT_LIT)
		
		 lex();
		
	 else { if (nextToken == LEFT_PAREN) {
		 lex();
		 expr();
		 if (nextToken == RIGHT_PAREN)
		 	lex();
		 else
		 	error();
		 }
		
		 parenthesis */
		 else
		 error();
	 }
	 System.out.println("Exit <factor>\n");
}





Trace of the parse of (sum + 47) / total:
Next token is: 25, Next lexeme is (
Enter <expr>
Enter <term>
Enter <factor>
Next token is: 11, Next lexeme is sum
Enter <expr>
Enter <term>
Enter <factor>
Next token is: 21, Next lexeme is +
Exit <factor>
Exit <term>
Next token is: 10, Next lexeme is 47
Enter <term>
Enter <factor>
Next token is: 26, Next lexeme is )
Exit <factor>
Exit <term>
Exit <expr>
Next token is: 24, Next lexeme is /
Exit <factor>
Next token is: 11, Next lexeme is total
Enter <factor>
Next token is: -1, Next lexeme is EOF
Exit <factor>
Exit <term>
Exit <expr>

****/