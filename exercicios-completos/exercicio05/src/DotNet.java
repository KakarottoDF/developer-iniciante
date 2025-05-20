public class DotNet extends Arquivo{
    private String pacote;
    private int qtdMetodos;

    public DotNet(String nome, int qtdLinhas, String pacote, int qtdMetodos) {
        super(nome, qtdLinhas);
        setPacote(pacote);
        setQtdMetodos(qtdMetodos);
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

    @Override
    public int tempoDeCompilacao() {
        int tempo = 0;

        if (getQtdMetodos() > 1 && getQtdMetodos() < 10) {
            tempo += 2;
        }
        if (getQtdMetodos() >= 10 && getQtdMetodos() < 20) {
            tempo += 3;
        }
        if (getQtdMetodos() >= 20) {
            tempo += 4;
        }

        return super.tempoDeCompilacao() + tempo;
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
