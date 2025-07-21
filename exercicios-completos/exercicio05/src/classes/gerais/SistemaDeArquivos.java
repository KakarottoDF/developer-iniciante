package classes.gerais;

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

    public Arquivo verificarArquivoComMaiorTempoDeCompilacao() {
        Arquivo arquivoComMaiorTempo = getArquivo().get(0);
        int maiorTempo = arquivoComMaiorTempo.tempoDeCompilacao();

        for (Arquivo arquivo : getArquivo()) {
            int tempo = arquivo.tempoDeCompilacao();
            if (tempo > maiorTempo) {
                maiorTempo = tempo;
                arquivoComMaiorTempo = arquivo;
            }
        }

        System.out.println("TEMPO TOTAL DE COMPILAÇÃO: " + maiorTempo + " SEGUNDOS");
        return arquivoComMaiorTempo;
    }

    public ArrayList<Arquivo> getArquivosOrdenadosPorTempoDeCompilacaoDecrescente() {
        ArrayList<Arquivo> copia = new ArrayList<>(getArquivo());
        Collections.sort(copia); // Usa o compareTo implementado em classes.gerais.Arquivo
        return copia;
    }

    @Override
    public String toString() {
        return "SISTEMA DE ARQUIVOS:" +
                getArquivo();
    }
}
