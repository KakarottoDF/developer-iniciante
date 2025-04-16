import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    ArrayList<Professor> professor;
    ArrayList<Administrativo> administrativo;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(){
        this.professor = new ArrayList<>();
        this.administrativo = new ArrayList<>();
    }

    public ArrayList<Professor> getProfessor() {
        return this.professor;
    }

    public ArrayList<Administrativo> getAdministrativo() {
        return this.administrativo;
    }

    public void adicionar(Professor professor, Administrativo administrativo){
        getProfessor().add(professor);
        getAdministrativo().add(administrativo);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", professor=" + professor +
                ", administrativo=" + administrativo +
                '}';
    }
}
