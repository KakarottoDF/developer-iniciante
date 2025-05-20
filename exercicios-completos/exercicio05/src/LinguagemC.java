public class LinguagemC extends Arquivo{
    private int qtdBibliotecas;
    private int qtdFuncoes;

    public LinguagemC(String nome, int qtdLinhas, int qtdBibliotecas, int qtdFuncoes) {
        super(nome, qtdLinhas);
        setQtdBibliotecas(qtdBibliotecas);
        setQtdFuncoes(qtdFuncoes);
    }

    public int getQtdBibliotecas() {
        return this.qtdBibliotecas;
    }

    public void setQtdBibliotecas(int qtdBibliotecas) {
        this.qtdBibliotecas = qtdBibliotecas;
    }

    public int getQtdFuncoes() {
        return this.qtdFuncoes;
    }

    public void setQtdFuncoes(int qtdFuncoes) {
        this.qtdFuncoes = qtdFuncoes;
    }

    @Override
    public int tempoDeCompilacao() {
        int tempo = 0;

        if (getQtdFuncoes() > 1 && getQtdFuncoes() < 60) {
            tempo += 3;
        }
        if (getQtdFuncoes() >= 60 && getQtdFuncoes() < 80) {
            tempo += 4;
        }
        if (getQtdFuncoes() >= 80) {
            tempo += 5;
        }

        return tempo;
    }

    @Override
    public int tempoDeCompilacaoTotal() {
        return super.tempoDeCompilacao() + this.tempoDeCompilacao();
    }

    @Override
    public boolean equals(Object obj) {
        LinguagemC novoLinguagemC = (LinguagemC) obj;
        return getNome() != null && getNome().equals(novoLinguagemC.getNome());
    }

    @Override
    public int hashCode() {
        return getNome() != null ? getNome().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nC:" +
                super.toString() +
                "\nQUANTIDADE DE BIBLIOTECAS: " + getQtdBibliotecas() +
                "\nQUANTIDADE DE FUNÇÕES: " + getQtdFuncoes() +
                "\n";
    }
}
