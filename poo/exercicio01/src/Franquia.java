public class Franquia {
    private int quantidadeDeGB;
    private int diaDeExpiracao;
    private double preco;
    private String nome;

    public static double precoTotal(Anatel anatel){
        double total = 0.0;

        for(Franquia franquia : anatel.getFranquia()){
            total += franquia.getPreco();
        }
        return total;
    }

    public static double media(Anatel anatel){
        return precoTotal(anatel) / anatel.getFranquia().size();
    }

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
        return "\nFranquia:" +
               "\nNome da Franquia: " + getNome() +
               "\nQuantidade de GB: " + getQuantidadeDeGB() +
               "\nDia de Expiração: " + getDiaDeExpiracao() +
               "\nPreco R$: " + getPreco();
    }
}
