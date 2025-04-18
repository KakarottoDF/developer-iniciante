import java.text.NumberFormat;
import java.util.Locale;

public class Professor extends Funcionario{
    private String titulacao;

    public Professor(String nome, String cpf, double salario, String titulacao) {
        super(nome, cpf, salario);
        setTitulacao(titulacao);
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getImpostoRenda(){
        return getSalario() * 0.23;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "\nProfessor " + getNome() + ": " +
                "\nCPF: " + getCpf() +
                "\nSALÁRIO BRUTO R$ " + getSalario() +
                "\nTitulação: " + getTitulacao() + (getTitulacao().isEmpty() ? "" : "\nO salário deste professor é de " + formatter.format(getImpostoRenda())) + "\n ";
    }
}
