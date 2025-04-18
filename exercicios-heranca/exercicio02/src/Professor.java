import java.text.NumberFormat;
import java.util.Locale;

public class Professor extends Funcionario{
    private String titulacao;

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getImpostoRenda(){
        return getSalario() + (getSalario() * 0.23);
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "\nProfessor " + getNome() + ": " +
                "\nTitulação: " + getTitulacao() + (getTitulacao().isEmpty() ? "" : "\nO salário deste professor é de R$ " + formatter.format(getImpostoRenda()));
    }
}
