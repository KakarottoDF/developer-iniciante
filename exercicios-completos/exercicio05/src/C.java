public class C extends SistemaDeArquivos{
    private int qtdBibliotecas;
    private int qtdFuncoes;

    public C(String nome, int qtdLinhas, int qtdBibliotecas, int qtdFuncoes) {
        super(nome, qtdLinhas);
        setQtdBibliotecas(qtdBibliotecas);
        setQtdFuncoes(qtdFuncoes);
    }

    public C(int qtdBibliotecas, int qtdFuncoes) {
        this.qtdBibliotecas = qtdBibliotecas;
        this.qtdFuncoes = qtdFuncoes;
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

    public int tempoDeCompilacao(int funcoes) {
        if (funcoes > 1 && funcoes < 60) {
            return 3;
        } else {
            if (funcoes >= 60 && funcoes < 80) {
                return 4;
            } else {
                if (funcoes >= 80) {
                    return 5;

                }
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        C novoC = (C) obj;
        return getNome() != null && getNome().equals(novoC.getNome());
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
