public class Professor extends Funcionario{
    private String titulacao;

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
        return "Professor{" +
                "titulacao='" + getTitulacao() + '\'' +
                '}';
    }
}
