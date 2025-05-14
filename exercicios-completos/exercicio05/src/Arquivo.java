public class Arquivo {
    private String nome;
    private int qtdLinhas;

    public Arquivo(String nome, int qtdLinhas) {
        setNome(nome);
        setQtdLinhas(qtdLinhas);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLinhas() {
        return this.qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    //É PRA FAZER SOBRESCRITA E NÃO SOBRECARGA SEU CORNOOOOOOO
    //LEMBRAR QUE A SOBRESCRITA É A ESPECIALIZAÇÃO DE UMA AÇÃO ESPECÍFICA, ONDE SE MANTÉM A MESMA ASSINATURA DO METODO, MAS COM COMPORTAMENTOS DIFERENTES.

    public int tempoDeCompilacao() {
        int tempoDeCompilacao = 0;

        if (getNome().length() > 10 && getNome().length() <= 100) {
            tempoDeCompilacao += 1;
        }
        if (getNome().length() > 100) {
            tempoDeCompilacao += 2;
        }

        if (getQtdLinhas() > 5 && getQtdLinhas() < 1000) {
            tempoDeCompilacao += 1;
        }
        if (getQtdLinhas() >= 1000 && getQtdLinhas() < 5000) {
            tempoDeCompilacao += 2;
        }
        if (getQtdLinhas() >= 5000) {
            tempoDeCompilacao += 3;
        }

        return tempoDeCompilacao;
    }

    public int tempoDeCompilacaoTotal() {
        return tempoDeCompilacao();
    }

    @Override
    public String toString() {
        return  "\nNOME DO SISTEMA: " + getNome() +
                "\nQUANTIDADE DE LINHAS: " + getQtdLinhas();
    }

}
