import java.util.Observable;

public class Banca {
    private String nome;
    private Endereco endereco;
    private Revista revista;

    public Banca(String nome, Endereco endereco, Revista revista) {
        setNome(nome);
        setEndereco(endereco);
        setRevista(revista);
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

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nome='" + getNome() + '\'' +
                ", endereco=" + getEndereco() +
                ", revista=" + getRevista() +
                '}';
    }
}
