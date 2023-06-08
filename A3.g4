grammar A3;

@header { 
    import java.util.*;
    import java.io.*;
}
@members { 
    ControleVariavel cv = new ControleVariavel();
    Saida w = new Saida(cv);
}

start: {w.limpaCodigo();} 'inicio' {w.printInicio();} bloco 'fim' {w.printFim();} PV;

bloco: AC {w.bloco($AC.text);} declaracoes FC {w.bloco($FC.text);} PV? {w.bloco($PV.text);};

declaracoes: (declararVar | bloco | cond | dowhile | atrbVar | while | for)*;

declararVar: tipo ID OP_ATR? VL? PV {w.variavel($ID.text, $tipo.text, 0, $VL.text);};

atrbVar: ID OP_ATR VL PV? {w.atrbVar($ID.text, $VL.text, $PV.text);};

tipo: ('normal' | 'letra' | 'quebrado' | 'ideia');

cond: SE AP comp FP {w.se();} bloco;

for: PARA AP {w.para();} declararVar comp atrbVar FP {w.fechaCond($FP.text);} bloco;

comp: pri OPREL seg PV? {w.comp($pri.text, $OPREL.text, $seg.text, $PV.text);};

pri: VL;

seg: VL;

dowhile: DO {w.faca();} bloco WHILE AP comp FP PV? {w.enquanto(); w.fechaCond($PV.text);};

while: WHILE AP comp FP {w.enquanto();} bloco PV? {w.fechaCond($PV.text);};



SOMA: '+';
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
ID: AZMIN+(AZMIN|AZMAI|DIGIT|'_')*;
VL: ID | DIGIT;
WS: WHITESPACE+ -> skip;

fragment AZMIN: [a-z];
fragment AZMAI: [A-Z];
fragment DIGIT: [0-9];
fragment WHITESPACE: [ \t\r\n];
