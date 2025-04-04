public class View{

    public static Acao cadastrarAcao(){
        Acao acao = new Acao();

        acao.setDescricao(Reader.lerString("Informa a descrição da ação: "));
        acao.setMes(Reader.lerInt("Informe o mês da ação: "));
        acao.setAno(Reader.lerInt("Informe o ano da ação: "));

        return acao;

    }

    public static UnidadeAdministrativa cadastrar(UnidadeAdministrativa unidadeAdministrativa){
        boolean continuar = true;

        unidadeAdministrativa.setNome(Reader.lerString("Digite o nome da Unidade Administrativa: "));

        while(continuar){
            unidadeAdministrativa.adicionar(cadastrarAcao());
            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não", "Digite somente [S]Sim [N]Não", "S", "N");
        }

        return unidadeAdministrativa;
    }


}
