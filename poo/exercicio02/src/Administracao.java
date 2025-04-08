import java.util.ArrayList;

public class Administracao {
    private ArrayList<Acao> acao;

    public Administracao(){
        this.acao = new ArrayList<>();
    }

    public ArrayList<Acao> getAcao() {
        return acao;
    }

    @Override
    public String toString() {
        return "Administracao{" +
                "acao=" + getAcao() +
                '}';
    }
}
