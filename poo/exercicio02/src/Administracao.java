import java.util.ArrayList;

public class Administracao {
    private ArrayList<Acao> acao;
    String nome;
    public final int TRIMESTRE_DESEJADO = 3;
    public final int ANO_DESEJADO = 2017;

    public Administracao(){
        this.acao = new ArrayList<>();
    }

    public ArrayList<Acao> getAcao() {
        return acao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionar(Acao acao){
        getAcao().add(acao);
    }

    @Override
    public String toString() {
        return "Administracao{" +
                "acao=" + getAcao() +
                ", nome='" + getNome() +
                '}';
    }
}
