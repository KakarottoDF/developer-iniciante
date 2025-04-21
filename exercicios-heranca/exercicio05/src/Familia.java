import java.util.ArrayList;

public class Familia {
    String nome;
    ArrayList<Pessoa> pessoa;

    public Familia() {
        this.pessoa = new ArrayList<>();
    }

    public ArrayList<Pessoa> getPessoa() {
        return this.pessoa;
    }

    public void adicionar(Pessoa pessoa){
        if (!getPessoa().contains(pessoa)) {
            getPessoa().add(pessoa);
        } else {
            System.out.println("Já existe uma pessoa com esse código. Cadastro ignorado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FAMÍLIA: " + getNome() +
                "\nINDIVÍDUOS DESSA FAMÍLIA: " + getPessoa();
    }
}
