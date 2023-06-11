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
    private String erro = "Houveram os seguintes erros ou waring ou info: \n";
    private boolean foise = false;
    private ArrayList<Variavel> retorno = new ArrayList<Variavel>();

    
    public Saida(ControleVariavel cv){
        this.cv = cv;
    }

    public void importacao(){
        this.escrever("import java.util.*;\n");
        this.escrever("import java.util.Scanner;\n");
        this.escrever("import java.io.*;\n");
    }
    public void scan(){
        this.escrever("Scanner scan = new Scanner(System.in);\n");
    }

    public void ler(String id){
        Variavel variavel = cv.busca(id);
        switch(variavel.getTipo()){
            case "normal" -> this.output = id+ws+eq+ws+"scan.nextInt()"+pv;
            case "letra" -> this.output = id+ws+eq+ws+"scan.next().charAt(1)"+pv;
            case "ideia" -> this.output = id+ws+eq+ws+"scan.nextLine()"+pv;
            case "quebrado" -> this.output = id+ws+eq+ws+"scan.nextLine()"+pv;
            default -> this.output = id+ws+eq+ws+"scan.nextLine()"+pv;
        }
        this.escrever(this.output);
    }

    public void escreve(String texto){
        this.output = "System.out.println"+ap+texto+fp+pv;
        this.escrever(this.output);
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
            cv.adiciona(new Variavel(id, tipo, this.escopo, valor));
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
        if(cv.jaExiste(vl_a)){
            if(cv.busca(vl_a).getEscopo() == this.escopo){
                if(cv.busca(vl_a).getValor() == null){
                    this.erro += "Variavel "+vl_a+" não incializada\n";
                    return;
                    }
            }
        }if(cv.jaExiste(vl_b)){
            if(cv.busca(vl_b).getEscopo() == this.escopo){
                if(cv.busca(vl_b).getValor() == null){
                    this.erro += "Variavel "+vl_b+" não incializada\n";
                    return;
                    }
            }
        }
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

    public ArrayList<Variavel> coletaOp(String id){
        if(cv.jaExiste(id)) retorno.add(cv.busca(id));
        return this.retorno;
    }

    public void validaOp(String id){
        Variavel idatbr = null;
        if(cv.jaExiste(id)) idatbr = cv.busca(id); else {this.erro += "Variavel "+id+" Não existe!\n"; this.retorno.clear(); return; };
        for(int i = 0; i < this.retorno.size(); ++i){
            if(this.retorno.get(i).getNome() == idatbr.getNome()){
                if(this.retorno.get(i).getEscopo() != idatbr.getEscopo() || this.retorno.get(i).getEscopo() != 1){
                    this.erro += "Escopo da variavel não é global ou local!\n";
                    this.retorno.clear();
                }else if(this.retorno.get(i).getTipo() != idatbr.getTipo()){
                    this.erro += "Variavel não pode ser atribuida na operação, tipos de dados diferentes!\n";
                    this.retorno.clear();
                }
            }
        }
        this.retorno.clear();
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
