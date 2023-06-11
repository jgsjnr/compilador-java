grammar A3;

@header { 
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;
}
@members { 
    ControleVariavel cv = new ControleVariavel();
    Saida w = new Saida(cv);
}

start: {w.limpaCodigo();} {w.importacao();} 'inicio' {w.printInicio();} bloco 'fim' {w.printFim();} PV {w.erros();};

bloco: {w.incEsco();} AC {w.bloco($AC.text);} declaracoes FC {w.bloco($FC.text);} PV? {w.bloco($PV.text);} {w.decEsco();};

declaracoes: (declararVar | bloco | cond | dowhile | atrbVar | while | for | ler | escrever | scan)*;

declararVar: tipo ID OP_ATR? pri? PV {w.variavel($ID.text, $tipo.text, $pri.text);};

atrbVar: ID OP_ATR vlatrb PV? {w.atrbVar($ID.text, $vlatrb.text, $PV.text);};

vlatrb: (pri | calc);

tipo: ('normal' | 'letra' | 'quebrado' | 'ideia');

cond: SE AP comp FP {w.se();} bloco else?;

else: SENAO {w.senao();} bloco;

for: PARA AP {w.para();} declararVar comp atrbVar FP {w.fechaCond($FP.text);} bloco;

comp: pri OPREL seg PV? {w.comp($pri.text, $OPREL.text, $seg.text, $PV.text);};

pri: (ID | DG);

seg: (ID | DG);

dowhile: DO {w.faca();} bloco WHILE AP comp FP PV? {w.enquanto(); w.fechaCond($PV.text);};

while: WHILE AP comp FP {w.enquanto();} bloco PV? {w.fechaCond($PV.text);};

calc: op (membfim | cont_op | PV?);

membfim: (pri | calc) {w.coletaOp($pri.text);};

op: (aritm | geo);

aritm: pri op_aritm {w.coletaOp($pri.text);};

geo: AP pri op_geo membfim FP {w.coletaOp($pri.text);};

cont_op: op_aritm calc;

op_aritm: (SOMA | SUB);

op_geo: (DIV | MULT);

ler: LER AP ID FP PV {w.ler($ID.text);};

escrever: ESCREVER AP texto FP PV {w.escreve($texto.text);};

texto: ASPAS (descrito | pri) ASPAS;

descrito: ASPAS pri ASPAS;

scan: SCANNER PV {w.scan();};

SCANNER: 'scan';
LER: 'ler';
ESCREVER: 'escrever';
SOMA: '+';
SUB: '-';
DIV: '/';
MULT: '*';
INICIO: 'inicio';
FIM: 'fim';
OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=' ;
COMENTARIO: '//';
OP_ATR: '=';
WHILE: 'enquanto';
DO: 'do';
PARA: 'para';
SE: 'se';
SENAO: 'senao';
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
PV: ';' ;
ASPAS: '"';
ID: AZMIN+(AZMIN|AZMAI|DIGIT|'_')*;
DG: DIGIT+'.'?DIGIT*;
VL: ID | DIGIT;
WS: WHITESPACE+ -> skip;

fragment AZMIN: [a-z];
fragment AZMAI: [A-Z];
fragment DIGIT: [0-9];
fragment WHITESPACE: [ \t\r\n];
