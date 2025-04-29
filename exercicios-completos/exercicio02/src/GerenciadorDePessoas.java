import java.util.ArrayList;

public class GerenciadorDePessoas{
    ArrayList<Professor> professores;

    public GerenciadorDePessoas() {
        this.professores = new ArrayList<>();
    }

    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(Professor professores) {
        getProfessores().add(professores);
    }

    @Override
    public String toString() {
        return "GerenciadorDePessoas{" +
                "professores=" + getProfessores() +
                '}';
    }
}
