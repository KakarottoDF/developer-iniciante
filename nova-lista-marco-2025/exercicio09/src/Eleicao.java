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
        getCandidatos().add(candidato);
    }

    @Override
    public String toString() {
        return "Eleicões 2025\n" +
                "Candidatos:\n" + getCandidatos();
    }
}
