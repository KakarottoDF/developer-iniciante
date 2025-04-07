import java.util.ArrayList;

public class Eleicao {
    private ArrayList<Candidato> candidatos;

    public Eleicao() {
        this.candidatos = new ArrayList<>();
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void adicionar(Candidato candidato){
        candidatos.add(candidato);
    }

    @Override
    public String toString() {
        return "Eleicao{" +
                "candidatos=" + getCandidatos() +
                '}';
    }
}
