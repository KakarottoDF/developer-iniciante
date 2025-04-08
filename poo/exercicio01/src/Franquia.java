public class Franquia {
    private int quantidadeDeGB;
    private int diaDeExpiracao;
    private double preco;
    private String nome;

    public int getQuantidadeDeGB() {
        return this.quantidadeDeGB;
    }

    public void setQuantidadeDeGB(int quantidadeDeGB) {
        this.quantidadeDeGB = quantidadeDeGB;
    }

    public int getDiaDeExpiracao() {
        return this.diaDeExpiracao;
    }

    public void setDiaDeExpiracao(int diaDeExpiracao) {
        this.diaDeExpiracao = diaDeExpiracao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Franquias:" +
                "\nQuantidade de GB: " + getQuantidadeDeGB() +
                "\nDia de Expiração: " + getDiaDeExpiracao() +
                "\nPreco R$: " + getPreco() +
                "\nNome da Franquia: " + getNome();
    }
}
