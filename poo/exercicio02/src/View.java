public class View {
    public static Acao cadastrarAcao(){
        Acao acao = new Acao();

        acao.setDescricao(Reader.lerString("Informe a descrição desta ação: "));
        acao.setMes(Reader.lerInt("Informe o mês desta ação: "));
        acao.setAno(Reader.lerInt("Informe o ano desta ação: ", "Informe um ano entre 2015 e 2020", 2015, 2020));

        return acao;
    }

    public static void cadastrar(Administracao administracao){
        boolean continuar = true;

        administracao.setNome(Reader.lerString("Informe o nome da Unidade Administrativa: "));

        while(continuar){
            administracao.adicionar(cadastrarAcao());
            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
