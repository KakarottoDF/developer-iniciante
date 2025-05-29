import java.util.Observable;

public class Banca {
    private String nome;
    private Endereco endereco;

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

    @Override
    public String toString() {
        return "Banca{" +
                "nome='" + getNome() + '\'' +
                ", endereco=" + getEndereco() +
                '}';
    }
}
