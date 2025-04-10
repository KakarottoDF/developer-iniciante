import java.util.ArrayList;

public class Administracao {
    private ArrayList<Acao> acao;
    String nome;

    public void findByTrimestre(int trimestre) {
        boolean encontrou = false;
        for (Acao acoes : acao) {
            if (acoes.getTrimestre() == trimestre) {
                System.out.println(acoes);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("nenhuma ação encontrada para o trimestre " + trimestre);
        }
    }

    public void findByAno(int ano) {
        for (Acao acoes : acao) {
            if (acoes.getAno() == ano) {
                System.out.println(acoes);
            }
        }
    }

    public void findByPrioridade(boolean prioridade) {
        for (Acao acoes : acao) {
            if (acoes.isAcaoPrioritaria() == prioridade) {
                System.out.println(acoes);
            }
        }
    }

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
        return "unidade administrativa:" +
                "\nnome: " + getNome() +
                "\nações:\n" + getAcao();
    }
}
