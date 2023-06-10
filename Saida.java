import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
    private boolean epara = false;
    private boolean edo = false;
    private int escopo = 0;
    private String erro = "Houveram os seguintes erros: \n";
    private boolean foise = false;

    
    public Saida(ControleVariavel cv){
        this.cv = cv;
    }

    public void importacao(){
        this.escrever("import java.util.*;\n");
    }

    public void incEsco(){
        ++this.escopo;
        System.out.println("Escopo inicial: "+this.escopo);
    }
    public void decEsco(){
        cv.remVar(this.escopo);
        if(this.escopo > 0) --this.escopo;
        System.out.println("Escopo final: "+this.escopo);
    }

    public void leitor(){
        //this.output;
    }

    public void fechaCond(String vl){
        if(vl != null){
            switch(vl){
            case ";" -> this.escrever(pv);
            case "(" -> this.escrever(ap);
            case ")" -> this.escrever(fp);
            case "}" -> this.escrever(ac);
            case "{" -> this.escrever(fc);
            default -> this.erro += "Simbolo inexistente, erro LÉXICO! \n";
        }
        }
        else this.erro += "Condição não finalizada, erro SINTÁTICO! \n" + vl;
    }

    public void printInicio(){
		this.escrever("public class Codigo{ \npublic static void main(String args[])");
	}
	
	public void printFim(){
		this.escrever("\n}");
	}

    public void limpaCodigo(){
        try{
            File f = new File("Codigo.java");
            f.delete();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void atrbVar(String id, String valor, String pv){
        if(cv.jaExiste(id)){
        if(cv.busca(id).getEscopo() == this.escopo || cv.busca(id).getEscopo() == 1){
            this.output = id+ws+eq+ws+valor;
            if(pv != null) this.output += pv;
            this.escrever(this.output);
        }else this.erro += "Variavel"+ws+id+ws+"não existe no escopo!";
        }else this.erro += "Variavel"+ws+id+ws+"não existe!";
    }

    public void para(){
        this.output = "for"+ap;
        this.escrever(this.output);
        this.epara = true;
    }

    public void enquanto(){
        if(this.comp != null){
        this.output = "while"+ap+comp+fp;
        this.escrever(this.output);
        this.comp = null;
        }else this.erro += "Comparação não finalizada, erro sintático! \n";
    }

    public void faca(){
        this.escrever("do");
        this.edo = true;
    }
    
    public void variavel(String id, String tipo, String valor){
        if(!cv.jaExiste(id)){
            switch(tipo){
                case "normal" -> output = inteiro;
                case "quebrado" -> output = floating;
                case "letra" -> output = letra;
                case "ideia" -> output = ideia;
            }
            cv.adiciona(new Variavel(id, tipo, this.escopo));
            if(valor != null) {
                this.output = output+ws+id+ws+eq+ws+valor+pv;
            }
            else this.output = output+ws+id+pv;
            this.escrever(output);
        }else this.erro += "Variável "+id+" já foi declarada no escopo "+cv.busca(id).getEscopo()+"\n";
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
            this.foise = true;
        }
        else this.erro += "Comparação com erro sintático \n";
    };

    public void senao(){
        if(this.foise) this.escrever("else");
        else this.erro = "Erro no else, condição se não declarada";
    }
    
    public void comp(String vl_a, String op, String vl_b, String pv){
        if(vl_a.equals(null) || op.equals(null) || vl_b.equals(null))this.comp = null;
        else this.comp = vl_a+ws+op+ws+vl_b;
        if(pv != null) this.comp += pv;
        if(epara){
            this.escrever(this.comp);
            this.comp = null;
            this.epara = false;
        }
    }

    public void calc(String membini, String op, String membfim, String pv){
        if(membini == null || op == null || membfim == null){
            this.erro += "Condiação incompleta no calculo \n";
        }else {
            if(this.epara) this.output = membini+ws+op+membfim;
            else this.output = membini+ws+op+membfim+pv;
            this.escrever(this.output);
        }
    }

    public int escopo (){
        int esc = 0;
        ArrayList<Variavel> vars = cv.getContvar();
        for(int i = 0; i < vars.size(); i++){
            if(vars.get(i).getEscopo() >= esc) esc = vars.get(i).getEscopo();
            else esc = esc;
        }
        return esc;
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

    public void erros(){
        if(this.erro == null){
            System.out.println("Sem erros!");
        }else {
            System.out.println("Erros: \n"+this.erro);
        }
    }
}
