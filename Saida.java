import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author José Silva
 */
public class Saida {
    private String output = null;
    private String bloco = null;
    private String variavel = null;
    private String ws = " ";
    private String ap = "(";
    private String fp = ")";
    private String ac = "{";
    private String fc = "}";
    private String eq = "=";
    private String inteiro = "int";
    private String str = "String";
    private String floating = "float";
    private String pv = ";";
    private String novaLinha = "\n";
    private String tabulacao = "\t";
    private ControleVariavel cv = null;
    private String comp = null;
    
    public Saida(ControleVariavel cv){
        this.cv = cv;
    }

    public void printInicio(){
		this.escrever("public class Codigo{ \n\tpublic static void main(String args[]){\n\t\t");
	}
	
	public void printFim(){
		this.escrever("\n\t}\n}");
	}
    
    public void variavel(String id, String tipo, int escopo){
        if(!cv.jaExiste(id)){
            switch(tipo){
                case "normal" -> output = inteiro;
                case "quebrado" -> output = floating;
                case "fala" -> output = str;
            }
            output = output+ws+id+pv;
            this.escrever(output+novaLinha);
        }else {System.out.println("Variável já existe!");}
        
    };
    
    public void bloco(String valor){
        if(valor == ";") this.escrever(valor);
        else this.escrever(valor+this.novaLinha);
    };
    
    public void se(String vl_a, String op, String vl_b){
        this.output = "if"+ap+vl_a+ws+op+ws+vl_b+fp;
        this.escrever(this.output);
    };
    public void se(){
        if(this.comp != null){
            this.output = "if"+ap+comp+fp;
            this.escrever(this.output);
            this.comp = null;
        }
        else System.out.println("Comparação esta nulo");
        
    };
    
    public void comp(String vl_a, String op, String vl_b){
        if(vl_a.equals(null) || op.equals(null) || vl_b.equals(null))this.comp = null;
        else this.comp = vl_a+ws+op+ws+vl_b;
    }
    
    public void escrever(String frase) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Codigo.java", true);
            fileWriter.write(frase);
        } catch (IOException e) {
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
            }
        }
        this.output = null;
    }

}
