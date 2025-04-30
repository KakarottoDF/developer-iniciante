import java.util.ArrayList;

public class GerenciadorDePessoas{
    ArrayList<Professor> professores;
    private final String PALAVRA = "SILVA";

    public GerenciadorDePessoas() {
        this.professores = new ArrayList<>();
    }

    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(Professor professores) {
        getProfessores().add(professores);
    }

    public String getPALAVRA() {
        return this.PALAVRA;
    }

    public boolean matriculaExiste(String matricula){
        Professor novoProfessor = new Professor("", matricula, Titulacao.DOUTORADO, 0);
        return getProfessores().contains(novoProfessor);
    }

    public void acharPalavraEspecificaNoNome(){
        for(Professor professor : getProfessores()){
            if(professor.getNome().contains(getPALAVRA())){
                System.out.println(professor);
            }
        }
    }

    @Override
    public String toString() {
        return "GerenciadorDePessoas" +
                "\n----- LISTA DE PROFESSORES -----" + getProfessores();
    }
}
