import java.util.ArrayList;

public class Atleta {
    private String nome;
    private char sexo;
    private int idade;
    private int numero;

    private ArrayList<Paraolimpico> paraolimpicos;
    private ArrayList<Olimpico> olimpicos;

    public Atleta() {
        this.paraolimpicos = new ArrayList<>();
        this.olimpicos = new ArrayList<>();
    }

    public ArrayList<Paraolimpico> getParaolimpicos() {
        return this.paraolimpicos;
    }

    public ArrayList<Olimpico> getOlimpicos() {
        return this.olimpicos;
    }

    public void adicionar(Paraolimpico paraolimpico) {
        getParaolimpicos().add(paraolimpico);
    }

    public void adicionar(Olimpico olimpico) {
        getOlimpicos().add(olimpico);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double calcularCusto() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
               "\nSexo: " + getSexo() +
               "\nIdade: " + getIdade() +
               "\nNúmero: " + getNumero();
    }
}
