import java.util.ArrayList;

public class GerenciadorDePessoas{

    private ArrayList<Pessoa> pessoas;
    private final String PALAVRA = "SILVA";
    private final double SALARIO = 12000.00;

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public String getPALAVRA() {
        return this.PALAVRA;
    }

    public double getSALARIO() {
        return SALARIO;
    }

    public GerenciadorDePessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public ArrayList<Professor> getProfessores() {
        ArrayList<Professor> professores = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if (p instanceof Professor) {
                professores.add((Professor) p);
            }
        }
        return professores;
    }

    public ArrayList<Aluno> getAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if (p instanceof Aluno) {
                alunos.add((Aluno) p);
            }
        }
        return alunos;
    }

    public boolean matriculaExiste(String matricula) {
        for (Pessoa p : pessoas) {
            if (p.getMatricula().equalsIgnoreCase(matricula)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeProfessorCadastrado() {
        return !getProfessores().isEmpty();
    }

    public boolean existeAlunoCadastrado() {
        return !getAlunos().isEmpty();
    }

    /*public boolean matriculaExiste(String matricula){
        *//*Professor novoProfessor = new Professor("", matricula, Titulacao.DOUTORADO, 0);
        return getProfessores().contains(novoProfessor);*//*
        return getProfessores().contains(new Professor("", matricula, Titulacao.GRADUADO, 0));
    }*/

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
        return "\n----- LISTA DAS PESSOAS CADASTRADAS -----" + getPessoas();
    }
}
