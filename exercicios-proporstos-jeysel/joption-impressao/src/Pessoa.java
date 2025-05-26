public class Pessoa {
    private String nome;
    private int matricula;
    private Endereco endereco;
    private int telefone;

    public Pessoa(String nome, int matricula, Endereco endereco, int telefone) {
        setNome(nome);
        setMatricula(matricula);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nNOME: " + getNome() +
                "\nMATRÍCULA: " + getMatricula() +
                getEndereco() +
                "\nTELEFONE: " + getTelefone();
    }
}
