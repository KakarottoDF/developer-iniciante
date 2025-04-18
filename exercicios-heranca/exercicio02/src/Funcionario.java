import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;


    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(){
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
        return "\nFUNCIONÁRIO: " +
                "\nNOME: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nSALÁRIO BRUTO R$ " + getSalario() + "\n ";
    }
}
