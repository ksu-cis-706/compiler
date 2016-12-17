grammar ExpSimple;

start: exp EOF;

exp
  : INT
  | '(' exp ')'
  | exp ( '*' | '/' | '%' ) exp
  | exp ( '+' | '-' )       exp
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