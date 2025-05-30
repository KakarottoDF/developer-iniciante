public class Pessoa {
    private String nome;
    private Endereco endereco;
    private String telefone;

    public Pessoa(String nome, Endereco endereco, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nNOME: " + getNome() +
                getEndereco() +
                "TELEFONE: " + getTelefone() +
                "\n";
    }
}
