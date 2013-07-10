grammar ExplicitExprAST;

options { backtrack=true; memoize=true; }

@header {
  package antlr.explicitast;
}

@lexer::header {
  package antlr.explicitast;
}

expr returns [ExprAST e = null;]
@init {
   boolean isPlus = true;
}
    :   l=mexpr { e = l; }
        (
          ('+' {isPlus=true;} | '-' {isPlus=false;}) 
          r=mexpr
 	  { if (isPlus) {
		e = new PlusNodeAST(e,r);
	    } else {
		e = new MinusNodeAST(e,r);
            }
          }
         )*
    ;      

mexpr returns [ExprAST e = null;]     
    :   l=atom { e = l; }
        ('*' r=atom { e = new TimesNodeAST(e,r); } )*
    ;    

atom returns [ExprAST e = null;]
    :   i=INT { e = new LiteralAST($i.text); } 
    |  '(' pe=expr ')'  { e = pe; }
    ;

INT   : ('0'..'9')+ 
      ;

WS    : ( ' ' | '\r' '\n' | '\n' | '\t')
        { $channel=HIDDEN; }
      ;    
