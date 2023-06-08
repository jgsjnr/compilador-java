/**
 *
 * @author amgjunior
 */
public class Variavel {
    private String nome;
    private String tipo;
    private int escopo;

    public Variavel(String nome, String tipo, int escopo) {
        this.nome = nome;
        this.tipo = tipo;
        this.escopo = escopo;
    }

    public Variavel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEscopo() {
        return escopo;
    }

    public void setEscopo(int escopo) {
        this.escopo = escopo;
    }
    
    public void imprime(){
        System.out.println("Nome: "+nome+"\nTipo: "+tipo+"\nEscopo: "+escopo);
    }
}
