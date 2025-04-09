import java.util.ArrayList;

public class Administracao {
    private ArrayList<Acao> acao;
    String nome;

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
        return "Unidade Administrativa:" +
                "\nNome: " + getNome() +
                "\nAÇÕES:\n" + getAcao();
    }
}
