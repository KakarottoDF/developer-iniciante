import java.util.ArrayList;

public class SistemaDeArquivos {
    private String nome;
    private int qtdLinhas;

    private ArrayList<DotNet> dotNets;
    private ArrayList<C> cArrayList;

    public SistemaDeArquivos(String nome, int qtdLinhas) {
        setNome(nome);
        setQtdLinhas(qtdLinhas);
    }

    public SistemaDeArquivos(){
        this.dotNets = new ArrayList<>();
        this.cArrayList = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLinhas() {
        return this.qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public ArrayList<DotNet> getDotNets() {
        return this.dotNets;
    }

    public ArrayList<C> getCArrayList() {
        return this.cArrayList;
    }

    public void adicionar(DotNet dotNet){
        getDotNets().add(dotNet);
    }

    public void adicionar(C cArray){
        getCArrayList().add(cArray);
    }

    public boolean validarSeNomeExiste(String nome) {
        DotNet novoDotNet = new DotNet(nome, 0, "", 0);
        C novoArrayC = new C(nome, 0, 0, 0);

        return getDotNets().contains(novoDotNet) || getCArrayList().contains(novoArrayC);
    }

    public int tempoDeCompilacao() {
        int tamanhoDoNomeDoArquivo = getNome().length();
        if (tamanhoDoNomeDoArquivo > 10 && tamanhoDoNomeDoArquivo < 100 || tamanhoDoNomeDoArquivo == 100 || getQtdLinhas() > 5 && getQtdLinhas() < 1000) {
            return 1;
        } else {
            if (tamanhoDoNomeDoArquivo > 100 || getQtdLinhas() > 1000 && getQtdLinhas() < 5000) {
                return 2;
            } else {
                if (getQtdLinhas() >= 5000) {
                    return 3;
                }
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return  "\nNOME DO SISTEMA: " + getNome() +
                "\nQUANTIDADE DE LINHAS: " + getQtdLinhas();
    }
}
