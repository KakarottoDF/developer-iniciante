public class Documentos{
    private String extensao;
    private int tamanhoEmBytes;
    private String nomeDoArquivo;

    public String getExtensao(){
        return this.extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public int getTamanhoEmBytes() {
        return this.tamanhoEmBytes;
    }

    public void setTamanhoEmBytes(int tamanhoEmBytes) {
        this.tamanhoEmBytes = tamanhoEmBytes;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public String toString() {
        return "Documentos:" +
                "\nExtensao: " + getExtensao() +
                "\nTamanho em Bytes: " + getTamanhoEmBytes() +
                "\nNome do Arquivo: " + getNomeDoArquivo();
    }
}
