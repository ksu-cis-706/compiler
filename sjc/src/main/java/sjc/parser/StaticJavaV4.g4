grammar StaticJavaV4;

compilationUnit
  : classDefinition EOF
  ;

classDefinition
  : 'public' 'class' ID '{' 
    mainMethodDeclaration
    memberDeclaration*
    '}'
  ;
  
memberDeclaration
  : fieldDeclaration | methodDeclaration
  ;

mainMethodDeclaration
  : 'public' 'static' 'void'
    id1=ID                   { "main".equals($id1.text) }? 
    '(' id2=ID               { "String".equals($id2.text) }?
    '[' ']' id3=ID ')'
    '{' methodBody '}'
  ;
  
fieldDeclaration
  : 'static' type ID ';'
  ;
  
methodDeclaration
  : 'static' returnType ID '(' params? ')' '{' methodBody '}'
  ;
  
type
  : 'boolean'                #BooleanType
  | 'int'                    #IntType
  ;
  
returnType
  : 'void'                   #VoidType
  | type                     #NonVoidReturnType
  ;
  
params
  : param ( ',' param )*
  ;
  
param
  : type ID
  ;

methodBody
  : localDeclaration* statement*
  ;

localDeclaration
  : type ID ';'
  ;
  
statement
  : assignStatement
  | ifStatement
  | whileStatement
  | invokeExpStatement
  | returnStatement
  ;
  
assignStatement
  : ID '=' exp ';'
  ;
  
ifStatement
  : 'if' '(' exp ')' '{' ts+=statement* '}'
    ( 'else' '{' fs+=statement* '}' )?
  ;
  
whileStatement
  : 'while' '(' exp ')' '{' statement* '}'
  ;
  
invokeExpStatement
  : invoke ';'
  ;
  
returnStatement
  : 'return' ( exp )? ';'
  ;

exp
  : INT                      { new java.math.BigInteger($INT.text).bitLength() < 32 }? 
                             #IntLiteral
  | 'true'                   #TrueLiteral 
  | 'false'                  #FalseLiteral
  | 'null'                   #NullLiteral
  | '(' exp ')'              #ParenExp
  | invoke                   #InvokeExp
  | ID                       #IdExp
  | op=( '-' | '+' ) exp     #UnaryExp
  | op='!' exp               #UnaryExp
  | e1=exp 
    op=( '*' | '/' | '%' )
    e2=exp                   #BinaryExp
  | e1=exp 
    op=( '+' | '-' )
    e2=exp                   #BinaryExp
  | e1=exp 
    op=( '<' | '>' | '<=' | '>=' )
    e2=exp                   #BinaryExp
  | e1=exp 
    op=( '==' | '!=' )
    e2=exp                   #BinaryExp
  | e1=exp op='&&' e2=exp    #BinaryExp
  | e1=exp op='||' e2=exp    #BinaryExp
  ;

invoke
  : ( id1=ID '.' )? id2=ID '(' args? ')'
  ;
  
args
  : exp ( ',' exp )*
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
ERROR
  : .
  ;