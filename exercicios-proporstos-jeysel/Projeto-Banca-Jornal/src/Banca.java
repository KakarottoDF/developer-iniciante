import java.util.ArrayList;

public class Banca {
    private String nome;
    private Endereco endereco;
    private ArrayList<Revista> revistas;

    public Banca(String nome, Endereco endereco) {
        setNome(nome);
        setEndereco(endereco);
        setRevistas(new ArrayList<>());
    }

    public void adicionarRevista(Revista revista) {
        revistas.add(revista);
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

    public ArrayList<Revista> getRevistas() {
        return this.revistas;
    }

    public void setRevistas(ArrayList<Revista> revistas) {
        this.revistas = revistas;
    }

    @Override
    public String toString() {
        return "\nNOME DA BANCA: " + getNome() +
                getEndereco() +
                "\nREVISTAS: " + getRevistas() +
                "\n";
    }
}
