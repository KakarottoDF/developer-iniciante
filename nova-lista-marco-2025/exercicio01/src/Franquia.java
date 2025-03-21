public class Franquia {
    public int quantidadeDeGB;
    public String diaDeExpiracao;
    public double preco;
    public String nomeDaEmpresa;

    public static Franquia setFranquia(){
        Franquia franquias = new Franquia();
        franquias.quantidadeDeGB = Reader.getInt("Digite a quantidade de GB:");
        franquias.diaDeExpiracao = Reader.getString("Digite o dia de expiração:");

        return franquias;
    }
}
