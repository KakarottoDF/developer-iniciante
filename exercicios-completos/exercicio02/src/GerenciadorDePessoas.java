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

    public boolean matriculaExiste(String matricula){
        Professor novoProfessor = new Professor("", matricula, Titulacao.valueOf(""), 0);
        return getProfessores().contains(novoProfessor);
    }

    @Override
    public String toString() {
        return "GerenciadorDePessoas{" +
                "professores=" + getProfessores() +
                '}';
    }
}
