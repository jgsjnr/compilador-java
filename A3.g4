grammar A3;

@header { 
    import java.util.*;
    import java.io.*;
    import java.util.ArrayList;
    import java.io.FileWriter;
    import java.io.IOException;
}
@members { 
    ControleVariavel cv = new ControleVariavel();
    Saida w = new Saida(cv);
}

start: bloco;

bloco: AC {w.bloco($AC.text);} declaracoes FC {w.bloco($FC.text);} PV {w.bloco($PV.text);};

declaracoes: (declararVariavel | bloco | cond)*;

declararVariavel: tipo ID PV {w.variavel($ID.text, $tipo.text, 0);};

attbVariavel: ID OP_ATR VL;

tipo: ('normal' | 'letra' | 'quebrado' | 'ideia');

cond: SE AP comp FP {w.se();};

dowhile: DO bloco WHILE AC comp FC;

for: PARA AP declararVariavel PV comp PV attbVariavel FP;

comp: VL OPREL VL2 {w.comp($VL.text, $OPREL.text, $VL2.text);};

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
ID: AZMIN(AZMIN|AZMAI|DIGIT)*;
VL: ID | NUM;
VL2: ID | NUM;
NUM: DIGIT+;
WS: WHITESPACE+ -> skip;

fragment AZMIN: [a-z];
fragment AZMAI: [A-Z];
fragment DIGIT: [0-9];
fragment WHITESPACE: [ \t\r\n];