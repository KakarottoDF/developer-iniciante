public class Jogador{
    private String nome;
    private int idade;
    private int quantidadeDeGols;
    private String paisDeOrigem;

//    Um Jogador tem nome, idade, quantidade de gols na
//    temporada, nome do país de origem e qualificação do jogador. A qualificação é calculada da
//    seguinte maneira:


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
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }
}