import java.io.FileWriter;
import java.io.File;
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
    private String ideia = "String";
    private String letra = "char";
    private String floating = "float";
    private String pv = ";";
    private String novaLinha = "\n";
    private String tabulacao = "\t";
    private ControleVariavel cv = null;
    private String comp = null;
    private String soma = "+";
    
    public Saida(ControleVariavel cv){
        this.cv = cv;
    }

    public void printInicio(){
		this.escrever("public class Codigo{ \npublic static void main(String args[]){");
	}
	
	public void printFim(){
		this.escrever("\n}\n}");
	}

    public void limpaCodigo(){
        try{
            File f = new File("Codigo.java");
            f.delete();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void atrbVar(String id, String valor){
        if(cv.jaExiste(id)){
            this.output = id+ws+eq+ws+valor;
            this.escrever(this.output);
        }else System.out.println("Variavel"+ws+id+ws+"não existe!");
    }

    public void para(){
        this.output = "for"+ap;
        this.escrever(this.output);
    }

    public void enquanto(){
        if(this.comp != null){
            this.output = "while"+ap+comp+fp;
            this.escrever(this.output);
            this.comp = null;
        }
    }

    public void faca(){
        this.escrever("do");
    }
    
    public void variavel(String id, String tipo, int escopo, String valor){
        if(!cv.jaExiste(id)){
            switch(tipo){
                case "normal" -> output = inteiro;
                case "quebrado" -> output = floating;
                case "letra" -> output = letra;
                case "ideia" -> output = ideia;
            }
            cv.adiciona(new Variavel(id, tipo, escopo));
            if(valor != null) {
                this.output = output+ws+id+eq+ws+valor+pv;
            }
            else this.output = output+ws+id+pv;
            this.escrever(output);
        }else {System.out.println("Variável já existe!");}
        
    };
    
    public void bloco(String valor){
        if(valor != null)this.escrever(valor+this.novaLinha);
        else return;
    };

    public void se(){
        if(this.comp != null){
            this.output = "if"+ap+comp+fp;
            this.escrever(this.output);
            this.comp = null;
        }
        else System.out.println("Comparação com erro sintático");
    };
    
    public void comp(String vl_a, String op, String vl_b, String pv){
        if(vl_a.equals(null) || op.equals(null) || vl_b.equals(null))this.comp = null;
        else this.comp = vl_a+ws+op+ws+vl_b;
        if(pv != null) this.comp = this.comp+pv;
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
