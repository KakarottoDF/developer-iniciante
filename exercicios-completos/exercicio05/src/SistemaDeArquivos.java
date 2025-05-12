import java.util.ArrayList;

public class SistemaDeArquivos {
    private String nome;
    private int qtdLinhas;

    private ArrayList<DotNet> dotNets;
    private ArrayList<C> cArrayList;

    public SistemaDeArquivos(){
        this.dotNets = new ArrayList<>();
        this.cArrayList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public ArrayList<DotNet> getDotNets() {
        return this.dotNets;
    }

    public ArrayList<C> getcArrayList() {
        return this.cArrayList;
    }

    public void adicionar(DotNet dotNet){
        getDotNets().add(dotNet);
    }

    public void adicionar(C cArray){
        getcArrayList().add(cArray);
    }
}
