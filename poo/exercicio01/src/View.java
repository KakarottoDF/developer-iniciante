public class View{
    public static Franquia cadastrarFranquia(){
        Franquia franquia = new Franquia();

        franquia.setNome(Reader.lerString("Digite o nome da franquia: "));
        franquia.setQuantidadeDeGB(Reader.lerInt("Informe a quantidade de GB da franquia: "));
        franquia.setDiaDeExpiracao(Reader.lerInt("Informe o dia de expiração da franquia: ", "Dia inválido", 1, 30));
        franquia.setPreco(Reader.lerDouble("Informe o preço da Franquia: R$ "));

        return franquia;
    }

    public static void cadastrar(Anatel anatel){
        boolean continuar = true;

        while(continuar){
            anatel.adicionar(cadastrarFranquia());
            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }

    }
}
