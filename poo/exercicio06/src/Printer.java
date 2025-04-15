import java.util.ArrayList;

public class Printer {
    private ArrayList<Acao> acoes;

    public Printer(){
        this.acoes = new ArrayList<>();
    }

    public ArrayList<Acao> getAcoes() {
        return this.acoes;
    }

    public void adicionar(Acao acoes){
        getAcoes().add(acoes);
    }
}
