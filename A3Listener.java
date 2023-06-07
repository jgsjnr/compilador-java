// Generated from .\A3.g4 by ANTLR 4.13.0
 
    import java.util.*;
    import java.io.*;
    import java.util.ArrayList;
    import java.io.FileWriter;
    import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A3Parser}.
 */
public interface A3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(A3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(A3Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(A3Parser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(A3Parser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(A3Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(A3Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#declararVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVariavel(A3Parser.DeclararVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#declararVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVariavel(A3Parser.DeclararVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#attbVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAttbVariavel(A3Parser.AttbVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#attbVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAttbVariavel(A3Parser.AttbVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(A3Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(A3Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(A3Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(A3Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#dowhile}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(A3Parser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#dowhile}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(A3Parser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(A3Parser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(A3Parser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link A3Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(A3Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(A3Parser.CompContext ctx);
}