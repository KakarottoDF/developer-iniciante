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

    @Override
    public boolean equals(Object obj) {
        C novoC = (C) obj;
        return getNome().equals(novoC.getNome());
    }

    @Override
    public String toString() {
        return "C:" +
                super.toString() +
                "QUANTIDADE DE BIBLIOTECAS: " + getQtdBibliotecas() +
                "QUANTIDADE DE FUNÇÕES: " + getQtdFuncoes() +
                "\n";
    }
}
