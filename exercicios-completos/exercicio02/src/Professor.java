public class Professor extends Pessoa{
    private String titulacao;
    private double salario;

    public Professor(String nome, String matricula, String titulacao, double salario) {
        super(nome, matricula);
        setTitulacao(titulacao);
        setSalario(salario);
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "titulacao='" + getTitulacao() + '\'' +
                ", salario=" + getSalario() +
                '}';
    }
}
