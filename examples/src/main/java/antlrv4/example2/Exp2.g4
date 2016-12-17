grammar Exp2;

start: exp EOF;

exp
  : INT                                   #IntLiteral
  | ID                                    #IdExp
  | '(' exp ')'                           #ParenExp
  | e1=exp op=( '*' | '/' | '%' ) e2=exp  #BinaryExp
  | e1=exp op=( '+' | '-' )       e2=exp  #BinaryExp
  ;

ID
  : ( 'a'..'z' | 'A'..'Z' | '_' | '$' ) 
    ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
  ;
  
INT
  : '0' | ('1'..'9') ('0'..'9')*
  ;

// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;
  
// Any other character is an error character
ErrorChar
  : .
  ;