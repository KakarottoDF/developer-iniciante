public class Jogador{
    private String nome;
    private int idade;
    private int quantidadeDeGols;
    private String paisDeOrigem;
    private double remuneracao;

    public static String artilheiro(Jogador[] jogadores) {
        Jogador artilheiro = jogadores[0];
        for (Jogador jog : jogadores) {
            if (jog.getQuantidadeDeGols() > artilheiro.getQuantidadeDeGols()) {
                artilheiro = jog;
            }
        }
        return artilheiro.getNome();
    }

    public static String qualificacaoJogador(int qtdGols){
        if(qtdGols < 15){
            return "Fraco";
        }else{
            if(qtdGols < 32){
                return "Mediana";
            }else{
                return "Boa";
            }
        }
    }

    public static double calcularRemuneracao(int qtdGols){
        double gasto;

        if(qualificacaoJogador(qtdGols).equalsIgnoreCase("Fraco")){
            gasto = 500.00;
        }else{
            if(qualificacaoJogador(qtdGols).equalsIgnoreCase("Mediana")){
                gasto = 5000.00;
            }else{
                gasto = 10000.00;
            }
        }

        return gasto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeDeGols() {
        return quantidadeDeGols;
    }

    public void setQuantidadeDeGols(int quantidadeDeGols) {
        this.quantidadeDeGols = quantidadeDeGols;
        setRemuneracao(calcularRemuneracao(quantidadeDeGols));
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    @Override
    public String toString() {
        return "\nJogador:" +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nQuantidade de Gols: " + getQuantidadeDeGols() +
                "\nPaís de Origem: " + getPaisDeOrigem() +
                "\nQualificação: " + qualificacaoJogador(getQuantidadeDeGols()) +
                "\nRemuneração: " + getRemuneracao();
    }
}