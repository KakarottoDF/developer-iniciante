public class Franquia {
    public int quantidadeDeGB;
    public String diaDeExpiracao;
    public double preco;
    public String nomeDaEmpresa;

    public String toString(){
        String franquia =
                "Nome da empresa: " + this.nomeDaEmpresa +
                "\nPreço da franquia: " + this.preco +
                "\nDia de expiração: " + this.diaDeExpiracao +
                "\nQuantidade de GB: " + this.quantidadeDeGB;

        return franquia;
    }

}
