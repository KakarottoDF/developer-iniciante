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
        NumberFormat conversao = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "\nPROFESSOR " + getNome() + ": " +
                "\nCPF: " + getCpf() +
                "\nSALÁRIO BRUTO R$ " + getSalario() +
                "\nTITULAÇÂO: " + getTitulacao() +
                "\nO VALOR DE IMPOSTO DE RENDA QUE ESTE PROFESSOR PAGARÁ É DE " + conversao.format(getImpostoRenda()) +
                "\nO SALÁRIO FINAL DELE É DE " + conversao.format(getSalario() - getImpostoRenda());
    }
}
