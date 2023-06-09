import java.util.ArrayList;

/**
 *
 * @author amgjunior
 * @author José Geraldo da Silva Júnior // edição
 */
public class ControleVariavel {
    private ArrayList<Variavel> contvar;

    public ControleVariavel() {
        contvar = new ArrayList<Variavel>();
    }

    public ArrayList<Variavel> getContvar(){
        return this.contvar;
    }
    
    public boolean adiciona(Variavel v){
        for(int i=0; i<contvar.size(); i++){
            if( (contvar.get(i).getNome().equals(v.getNome())) && (contvar.get(i).getEscopo() == v.getEscopo()) )
                return false;
        }
        contvar.add(v);
        return true;
    }
    
    public Variavel busca(String nome){
        for(int i=contvar.size()-1; i>=0; i--){
            if(contvar.get(i).getNome().equals(nome))
                return contvar.get(i);
        }
        return null;
    }
    
    public boolean jaExiste(String nome){
        for(int i=contvar.size()-1; i>=0; i--){
            if(contvar.get(i).getNome().equals(nome))
                return true;
        }
        return false;
    }

    public void remVar(int esc){
        for(int i = 0; i < contvar.size(); i++){
            if(contvar.get(i).getEscopo() == esc) contvar.remove(i);
        }
    }
    
    public void print(){
        for(int i=0; i<contvar.size(); i++){
            contvar.get(i).imprime();
            System.out.println("\n\n");
        }
    }

}
