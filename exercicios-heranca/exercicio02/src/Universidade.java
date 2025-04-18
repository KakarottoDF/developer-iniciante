import java.util.ArrayList;

public class Universidade {
    private String nome;
    ArrayList<Funcionario> funcionario;
    ArrayList<Professor> professor;
    ArrayList<Diretor> diretor;

    public Universidade(){
        this.funcionario = new ArrayList<>();
        this.professor = new ArrayList<>();
        this.diretor = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionario(){
        return this.funcionario;
    }

    public ArrayList<Professor> getProfessor() {
        return this.professor;
    }

    public ArrayList<Diretor> getDiretor() {
        return this.diretor;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        getFuncionario().add(funcionario);

        if (funcionario instanceof Professor) {
            getProfessor().add((Professor) funcionario);
        } else if (funcionario instanceof Diretor) {
            getDiretor().add((Diretor) funcionario);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "UNIVERSIDADE:" +
                "\n" + getNome() +
                "\nFUNCIONÁRIO: " + getFuncionario();
    }
}
