import java.util.ArrayList;

public class Universidade {
    private String nome;
    ArrayList<Funcionario> funcionario;
    ArrayList<Professor> professor;
    ArrayList<Administrativo> administrativo;

    public Universidade(){
        this.funcionario = new ArrayList<>();
        this.professor = new ArrayList<>();
        this.administrativo = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionario(){
        return this.funcionario;
    }

    public ArrayList<Professor> getProfessor() {
        return this.professor;
    }

    public ArrayList<Administrativo> getAdministrativo() {
        return this.administrativo;
    }

    public void adicionar(Funcionario funcionario, Professor professor, Administrativo administrativo){
        getFuncionario().add(funcionario);
        getProfessor().add(professor);
        getAdministrativo().add(administrativo);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nome='" + getNome() + '\'' +
                ", funcionario=" + getFuncionario() +
                ", professor=" + getProfessor() +
                ", administrativo=" + getAdministrativo() +
                '}';
    }
}
