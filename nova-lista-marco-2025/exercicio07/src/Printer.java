public class Printer {
    public static void imprimirJogadores(Fifa fifa){
        System.out.println(fifa.toString());
    }

    public static void imprimirJogadores(Fifa fifa, String qualificacao){
        System.out.println("\n\nJogadores com qualificação " + qualificacao + ":");

        for (Jogador jogador : fifa.getJogadores()) {
            if (jogador.qualificacaoJogador(jogador.getQuantidadeDeGols()).equalsIgnoreCase(qualificacao)) {
                System.out.println(jogador);
            }
        }
    }

    public static void imprimirArtilheiro(Fifa fifa) {
        String resultado = View.artilheiro(fifa.getJogadores());
        System.out.println("O jogador que mais fez gol foi: " + resultado);
    }

    public static void imprimirMediaGolsMaioresDeIdade(Fifa fifa) {
        double mediaGols = fifa.mediaGolsMaioresDeIdade();
        System.out.println("Média de gols dos jogadores maiores de idade: " + mediaGols);
    }
}
