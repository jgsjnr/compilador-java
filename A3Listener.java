// Generated from A3.g4 by ANTLR 4.13.0
 import java.util.*; 
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
	 * Enter a parse tree produced by {@link A3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(A3Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link A3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(A3Parser.TipoContext ctx);
}