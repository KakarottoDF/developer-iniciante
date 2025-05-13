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

    public int tempoDeCompilacao() {
        if (getNome().length() > 10 && getNome().length() <= 100 || getQtdLinhas() > 5 && getQtdLinhas() < 1000) {
            return 1;
        } else {
            if (getNome().length() > 100 || getQtdLinhas() > 1000 && getQtdLinhas() < 5000) {
                return 2;
            } else {
                if (getQtdLinhas() >= 5000) {
                    return 3;
                }
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return  "\nNOME DO SISTEMA: " + getNome() +
                "\nQUANTIDADE DE LINHAS: " + getQtdLinhas();
    }

}
