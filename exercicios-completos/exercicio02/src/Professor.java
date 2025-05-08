public class Professor extends Pessoa{
    private Titulacao titulacao;
    private double salario;

    public Professor(String nome, String matricula, Titulacao titulacao, double salario) {
        super(nome, matricula);
        setTitulacao(titulacao);
        setSalario(salario);
    }

    public Titulacao getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object obj){
        Professor professor = (Professor) obj;
        return getMatricula().equals(professor.getMatricula());
    }

    @Override
    public String toString() {
        return "\nPROFESSOR:" +
                super.toString() +
                "\nTitulação: " + getTitulacao() +
                "\nSalário: R$ " + getSalario() +
                "\n";
    }
}
