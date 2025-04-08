public class Franquia {
    private int quantidadeDeGB;
    private int diaDeExpiracao;
    private double preco;
    private String nome;
    private final String NOME_FRANQUIA = "VIVO";
    private final int QTD_GIGA = 2;

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

    public static String franquiaMaisBarata(Anatel anatel){
        String franquia = "";
        double menorPreco = 0.0;
        int cont = 1;

        for(Franquia franquias : anatel.getFranquia()){
            if(cont == 1){
                franquia = franquias.getNome();
                menorPreco = franquias.getPreco();
                cont++;
            }

            if(franquias.getPreco() < menorPreco) {
                franquia = franquias.getNome();
                menorPreco = franquias.getPreco();
            }
        }

        return franquia;
    }

    public static int qtdFranquias(Anatel anatel, String nome){
        int cont = 0;

        for(Franquia franquias : anatel.getFranquia()){

            if(franquias.getNome().equalsIgnoreCase(nome)) {
                cont++;
            }
        }
        return cont;
    }

    public static int qtdFranquias(Anatel anatel, int qtdGiga){
        int cont = 0;

        for(Franquia franquias : anatel.getFranquia()){
            if(franquias.getQuantidadeDeGB() > qtdGiga) {
                cont++;
            }
        }
        return cont;
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

    public String getNOME_FRANQUIA() {
        return NOME_FRANQUIA;
    }

    public int getQTD_GIGA() {
        return QTD_GIGA;
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
