grammar A3;

@header { import java.util.*; }

start: 'inicio' bloco 'fim' PV;
bloco: AC declaracoes FC PV;
declaracoes: (declararVariavel | bloco)*;
declararVariavel: tipo ID OP_ATR VL PV;

tipo: ('int' | 'letra' | 'quebrado' | 'ideia');


OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=' ;
LINE_COMMENT: '//';
OP_ATR: '=';
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
PV: ';';
ID: AZMIN(AZMIN|AZMAI|DIGIT)*;
VL: ID | DIGIT;
NUM: DIGIT+;
WS: WHITESPACE+ -> skip;

fragment AZMIN: [a-z];
fragment AZMAI: [A-Z];
fragment DIGIT: [0-9];
fragment WHITESPACE: [ \t\r\n];