public class Pessoa {
    private String nome;
    private int codigoInteiro;
    private double salario;

    public Pessoa(String nome, int codigoInteiro, double salario) {
        setNome(nome);
        setCodigoInteiro(codigoInteiro);
        setSalario(salario);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoInteiro() {
        return this.codigoInteiro;
    }

    public void setCodigoInteiro(int codigoInteiro) {
        this.codigoInteiro = codigoInteiro;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "PESSOA:" +
                "\nNOME: " + getNome() +
                "\nCÓDIGO: " + getCodigoInteiro() +
                "\nSALÁRIO R$ " + getSalario();
    }
}
