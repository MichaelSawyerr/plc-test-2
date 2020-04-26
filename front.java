import java.io.BufferReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.I0Exception;

	public class front {


static int charClass;
static char lexeme[100];
static char nextChar;
static int lexLen;
static int token;
static int nextToken;
static FILE *in_fp;


static int lookup(char ch);
static void addChar(void);
static void getChar(void);
static void getNonBlank(void);
static int lex(void);


public final int LETTER = 0;
public final int DIGIT = 1
public final int UNKNOWN = 99

/* Token codes */
public final int INT_LIT = 10
public final int IDENT = 11
public final int ASSIGN_OP = 20
public final int ADD_OP = 21
public final int SUB_OP = 22
public final int MULT_OP = 23
public final int DIV_OP = 24
public final LEFT_PAREN = 25
public final RIGHT_PAREN = 26



/******************************************************/
public static void main(String[] args) throws FileNotFoundException {
in_fp = new File("front.in");
fr = new FileReader(in_fp);
br = newBufferReader(fr);
getChar();
do {
lex();
} while (nextToken != -1);
}
/******************************************************/

int lookup(char ch) {
	 switch (ch) {
		 case '(':
			 addChar();
			 nextToken = LEFT_PAREN;
			 break;
		 case ')':
			 addChar();
			 nextToken = RIGHT_PAREN;
			 break;
		 case '+':
			 addChar();
			 nextToken = ADD_OP;
			 break;
		 case '-':
			 addChar();
			 nextToken = SUB_OP;
			 break;
		 case '*':
			 addChar();
			 nextToken = MULT_OP;
			 break;
		 case '/':
			 addChar();
			 nextToken = DIV_OP;
			 break;
		 default:
			 addChar();
			 nextToken = -1;
			 break;
	 }
	 return nextToken;
}

/******************************************************/
/* addChar - a function to add nextChar to lexeme */
public static void addChar() {
	if (lexLen <= 98) {
		lexeme[lexLen++] = nextChar;
		lexeme[lexLen] = '\0';
	} else
	printf("Error - lexeme is too long \n");
}


/******************************************************/
/* getChar - a function to get the next character of
 input and determine its character class */
public static void getChar() {
	 if ((nextChar = getc(in_fp)) != EOF) {
		 if (isalpha(nextChar))
		 	charClass = LETTER;
		 else if (isdigit(nextChar))
		 	charClass = DIGIT;
		 else
		 	charClass = UNKNOWN;
	 } else
	 	charClass = EOF;
}


/******************************************************/

public static void getNonBlank() {
	while (isspace(nextChar))
	getChar();
}

/******************************************************/
/* lex - a simple lexical analyzer for arithmetic
 expressions */
public static int lex() {
	 lexLen = 0;
	 getNonBlank();
	 switch (charClass) {
		/* Identifiers */
		 case LETTER:
			 addChar();
			 getChar();
			 while (charClass == LETTER || charClass == DIGIT) {
				 addChar();
				 getChar();
			 }
			 nextToken = IDENT;
			 break;
		
		 case DIGIT:
			 addChar();
			 getChar();
			 while (charClass == DIGIT) {
				 addChar();
				 getChar();
			 }
			 nextToken = INT_LIT;
		 	break;
		/* Parentheses and operators */
		 case UNKNOWN:
			 lookup(nextChar);
			 getChar();
			 break;
			/* EOF */
		case EOF:
			 nextToken = EOF;
			 lexeme[0] = 'E';
			 lexeme[1] = 'O';
			 lexeme[2] = 'F';
			 lexeme[3] = '\0';
		 	break;
	 
	 System.out.println("Next token is: %d, Next lexeme is %s\n",
	 nextToken, lexeme);
	 return nextToken;
}

