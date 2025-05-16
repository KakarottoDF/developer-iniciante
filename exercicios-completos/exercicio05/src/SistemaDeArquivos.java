import java.util.ArrayList;
import java.util.Collections;

public class SistemaDeArquivos{
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

    public void verificarArquivoComMaiorTempoDeCompilacao() {
        Arquivo arquivoComMaiorTempo = getArquivo().get(0);
        int maiorTempo = arquivoComMaiorTempo.tempoDeCompilacaoTotal();

        for (Arquivo arquivo : getArquivo()) {
            int tempo = arquivo.tempoDeCompilacaoTotal();
            if (tempo > maiorTempo) {
                maiorTempo = tempo;
                arquivoComMaiorTempo = arquivo;
            }
        }

        System.out.println("\nARQUIVO COM MAIOR TEMPO DE COMPILAÇÃO:");
        System.out.println(arquivoComMaiorTempo);
        System.out.println("TEMPO TOTAL DE COMPILAÇÃO: " + maiorTempo + " SEGUNDOS");
    }

    public ArrayList<Arquivo> getArquivosOrdenadosPorTempoDeCompilacaoDecrescente() {
        ArrayList<Arquivo> copia = new ArrayList<>(getArquivo());
        Collections.sort(copia); // Usa o compareTo implementado em Arquivo
        return copia;
    }

    @Override
    public String toString() {
        return "SISTEMA DE ARQUIVOS:" +
                getArquivo();
    }
}
