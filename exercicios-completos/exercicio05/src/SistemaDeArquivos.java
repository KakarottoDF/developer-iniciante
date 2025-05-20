import java.util.ArrayList;
import java.util.Collections;

public class SistemaDeArquivos{
    private ArrayList<Arquivo> arquivos;

    public SistemaDeArquivos(){
        setArquivos(new ArrayList<>());
    }

    public ArrayList<Arquivo> getArquivo() {
        return this.arquivos;
    }

    public void setArquivos(ArrayList<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public void adicionar(Arquivo arquivo){
        getArquivo().add(arquivo);
    }

    public boolean validarSeNomeExiste(String nome) {
        Arquivo novoArquivo = new Arquivo(nome, 0);
        return getArquivo().contains(novoArquivo);
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
