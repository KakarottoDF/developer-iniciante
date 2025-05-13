import java.util.ArrayList;

public class SistemaDeArquivos {
    private ArrayList<Arquivo> arquivos;
    private ArrayList<DotNet> dotNets;
    private ArrayList<C> cArrayList;

    public SistemaDeArquivos(){
        this.arquivos = new ArrayList<>();
        this.dotNets = new ArrayList<>();
        this.cArrayList = new ArrayList<>();
    }

    public ArrayList<Arquivo> getArquivo() {
        return this.arquivos;
    }

    public ArrayList<DotNet> getDotNets() {
        return this.dotNets;
    }

    public ArrayList<C> getCArrayList() {
        return this.cArrayList;
    }

    public void adicionar(DotNet dotNet){
        getDotNets().add(dotNet);
        getArquivo().add(dotNet);
    }

    public void adicionar(C cArray){
        getCArrayList().add(cArray);
        getArquivo().add(cArray);
    }

    public boolean validarSeNomeExiste(String nome) {
        DotNet novoDotNet = new DotNet(nome, 0, "", 0);
        C novoArrayC = new C(nome, 0, 0, 0);

        return getDotNets().contains(novoDotNet) || getCArrayList().contains(novoArrayC);
    }

    //É PRA FAZER SOBRESCRITA E NÃO SOBRECARGA SEU CORNOOOOOOO
    //LEMBRAR QUE A SOBRESCRITA É A ESPECIALIZAÇÃO DE UMA AÇÃO ESPECÍFICA, ONDE SE MANTÉM A MESMA ASSINATURA DO METODO, MAS COM COMPORTAMENTOS DIFERENTES.


    @Override
    public String toString() {
        return "SISTEMA DE ARQUIVOS:" +
                getArquivo();
    }
}
