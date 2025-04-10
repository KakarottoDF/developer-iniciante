public class View {
    public static Acao cadastrarAcao(){
        Acao acao = new Acao();

        acao.setDescricao(Reader.lerString("informe a descrição desta ação: "));
        acao.setMes(Reader.lerInt("informe o mês desta ação: "));
        acao.setAno(Reader.lerInt("informe o ano desta ação: ", "informe um ano entre 2015 e 2020", 2015, 2020));

        return acao;
    }

    public static void cadastrar(Administracao administracao){
        boolean continuar = true;

        administracao.setNome(Reader.lerString("informe o nome da unidade administrativa: "));

        while(continuar){
            administracao.adicionar(cadastrarAcao());
            continuar = Reader.lerBoolean("deseja continuar? [s]sim [n]não: ", "digite somente [s]sim [n]não", "s", "n");
        }
    }
}
