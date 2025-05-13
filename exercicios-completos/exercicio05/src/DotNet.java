public class DotNet extends SistemaDeArquivos{
    private String pacote;
    private int qtdMetodos;

    public DotNet(String nome, int qtdLinhas, String pacote, int qtdMetodos) {
        super(nome, qtdLinhas);
        setPacote(pacote);
        setQtdMetodos(qtdMetodos);
    }

    public DotNet(String pacote, int qtdMetodos) {
        this.pacote = pacote;
        this.qtdMetodos = qtdMetodos;
    }

    public String getPacote() {
        return this.pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public int getQtdMetodos() {
        return this.qtdMetodos;
    }

    public void setQtdMetodos(int qtdMetodos) {
        this.qtdMetodos = qtdMetodos;
    }

    public int tempoDeCompilacao(int metodos) {
        if (metodos > 1 && metodos < 10) {
            return 2;
        } else {
            if (metodos >= 10 && metodos < 20) {
                return 3;
            } else {
                if (metodos >= 20) {
                    return 4;

                }
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        DotNet dotNet = (DotNet) obj;
        return getNome() != null && getNome().equals(dotNet.getNome());
    }

    @Override
    public int hashCode() {
        return getNome() != null ? getNome().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nDOTNET: " +
                super.toString() +
                "\nNOME DO PACOTE: " + getPacote() +
                "\nQUANTIDADE DE MÉTODOS: " + getQtdMetodos() +
                "\n";
    }
}
