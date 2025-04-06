public class View {

    public static Jogador cadastrarJogador(){
        Jogador jogador = new Jogador();

        jogador.setNome(Reader.lerString("Informe o nome do jogador: "));
        jogador.setIdade(Reader.lerInt("Informe a idade do jogador: "));
        jogador.setQuantidadeDeGols(Reader.lerInt("Informe a quantidade de gols do jogador: "));
        jogador.setPaisDeOrigem(Reader.lerString("Informe o país de origem do jogador: "));

        return jogador;

    }

    public static Fifa cadastrar(Fifa fifa){
        boolean continuar = true;
        Jogador jogador = new Jogador();

        while(continuar){
            fifa.adicionar(cadastrarJogador());
            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não", "Digite somente [S]Sim [N]Não", "S", "N");
        }

        return fifa;
    }

    public static String artilheiro(Jogador[] jogadores) {
        Jogador artilheiro = jogadores[0];
        for (Jogador jog : jogadores) {
            if (jog.getQuantidadeDeGols() > artilheiro.getQuantidadeDeGols()) {
                artilheiro = jog;
            }
        }
        return artilheiro.getNome();
    }

}
