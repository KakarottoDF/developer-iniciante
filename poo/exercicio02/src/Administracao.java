import java.util.ArrayList;

public class Administracao {
    private ArrayList<Acao> acao;
    String nome;

    public void findBySemestre(int semestre) {
        for (Acao acoes : acao) {
            int trimestre = acoes.getTrimestre();
            if (semestre == 1 && (trimestre == 1 || trimestre == 2)) {
                System.out.println(acoes);
            } else {
                if (semestre == 2 && (trimestre == 3 || trimestre == 4)) {
                    System.out.println(acoes);
                }
            }
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
        return "Unidade Administrativa:" +
                "\nNome: " + getNome() +
                "\nAÇÕES:\n" + getAcao();
    }
}
