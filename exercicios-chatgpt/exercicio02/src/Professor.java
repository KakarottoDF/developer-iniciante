public class Professor extends Funcionario implements Pagamento{
    private String titulacao;

    public Professor(String nome, String cpf, double salario, String titulacao) {
        super(nome, cpf, salario);
        setTitulacao(titulacao);
    }

    public double getImpostoRenda(){
        return 0.0;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public double getGratificacao() {
        return 0;
    }
}
