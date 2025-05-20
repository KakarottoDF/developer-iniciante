import java.util.ArrayList;
import java.util.Collections;

public class SistemaDeArquivos{
    private ArrayList<Arquivo> arquivos;
    private ArrayList<DotNet> dotNets;
    private ArrayList<LinguagemC> linguagemCArrayList;

    public SistemaDeArquivos(){
        setArquivos(new ArrayList<>());
        setDotNets(new ArrayList<>());
        setcArrayList(new ArrayList<>());
    }

    public ArrayList<Arquivo> getArquivo() {
        return this.arquivos;
    }

    public void setArquivos(ArrayList<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public ArrayList<DotNet> getDotNets() {
        return this.dotNets;
    }

    public void setDotNets(ArrayList<DotNet> dotNets) {
        this.dotNets = dotNets;
    }

    public ArrayList<LinguagemC> getCArrayList() {
        return this.linguagemCArrayList;
    }

    public void setcArrayList(ArrayList<LinguagemC> linguagemCArrayList) {
        this.linguagemCArrayList = linguagemCArrayList;
    }

    public void adicionar(DotNet dotNet){
        getDotNets().add(dotNet);
        getArquivo().add(dotNet);
    }

    public void adicionar(LinguagemC linguagemCArray){
        getCArrayList().add(linguagemCArray);
        getArquivo().add(linguagemCArray);
    }

    public boolean validarSeNomeExiste(String nome) {
        DotNet novoDotNet = new DotNet(nome, 0, "", 0);
        LinguagemC novoArrayLinguagemC = new LinguagemC(nome, 0, 0, 0);

        return getDotNets().contains(novoDotNet) || getCArrayList().contains(novoArrayLinguagemC);
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
