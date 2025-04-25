import java.util.ArrayList;

public class Terrorista {
    private String nome;
    private int quantidadeDeExplosivos;

    private ArrayList<Terrorista> listaDeTerroristas;

    public Terrorista(){
        this.listaDeTerroristas = new ArrayList<>();
    }

    public ArrayList<Terrorista> getListaDeTerroristas() {
        return this.listaDeTerroristas;
    }

    public void adicionar(Suicida suicida, NaoSuicida naoSuicida){
        getListaDeTerroristas().add(suicida);
        getListaDeTerroristas().add(naoSuicida);
    }

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

    @Override
    public String toString() {
        return "Terrorista{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeDeExplosivos=" + getQuantidadeDeExplosivos() +
                ", listaDeTerroristas=" + getListaDeTerroristas() +
                '}';
    }
}
