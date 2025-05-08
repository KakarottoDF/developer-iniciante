import java.util.ArrayList;

public class GerenciadorDePessoas{

    private ArrayList<Professor> professores;
    private final String PALAVRA = "SILVA";
    private final double SALARIO = 12000.00;

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

    public double getSALARIO() {
        return SALARIO;
    }

    public boolean matriculaExiste(String matricula){
        Professor novoProfessor = new Professor("", matricula, Titulacao.DOUTORADO, 0);
        return getProfessores().contains(novoProfessor);
    }

    public void acharProfessores(String palavra){
        boolean encontrou = false;

        for (Professor professor : getProfessores()) {
            if (professor.getNome().contains(palavra)) {
                System.out.println(professor);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("NÃO EXISTEM PROFESSORES COM " + palavra.toUpperCase() + " NO NOME.");
        }
    }

    public void acharProfessores(Titulacao titulacao){
        boolean encontrou = false;
        for (Professor professor : getProfessores()) {
            if (professor.getTitulacao().equals(titulacao)) {
                System.out.println(professor);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("NÃO EXISTEM PROFESSORES COM TITULAÇÃO " + titulacao);
        }
    }

    public void acharProfessores(double salario){
        boolean encontrou = false;
        for (Professor professor : getProfessores()) {
            if (professor.getSalario() > salario) {
                System.out.println(professor);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("NÃO EXISTEM PROFESSORES COM SALÁRIO ACIMA DE R$ " + getSALARIO());
        }
    }

    @Override
    public String toString() {
        return "\n----- LISTA DE PROFESSORES -----" + getProfessores();
    }
}
