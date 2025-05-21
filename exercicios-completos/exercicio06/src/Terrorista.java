import java.util.ArrayList;

public class Terrorista {
    private String nome;
    private int quantidadeDeExplosivos;

    public Terrorista(String nome, int quantidadeDeExplosivos) {
        setNome(nome);
        setQuantidadeDeExplosivos(quantidadeDeExplosivos);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeExplosivos() {
        return this.quantidadeDeExplosivos;
    }

    public void setQuantidadeDeExplosivos(int quantidadeDeExplosivos) {
        this.quantidadeDeExplosivos = quantidadeDeExplosivos;
    }

    public int grauDePericulosidade(){
        return 0;
    }

    @Override
    public String toString() {
        return "\nNOME: " + getNome() +
               "\nQUANTIDADE DE EXPLOSIVOS: " + getQuantidadeDeExplosivos();
    }
}
