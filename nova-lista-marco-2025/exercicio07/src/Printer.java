public class Printer {
    public static void imprimirJogadores(Fifa fifa){
        System.out.println(fifa.toString());
    }

    public static void imprimirArtilheiro(Fifa fifa) {
        String resultado = Jogador.artilheiro(fifa.getJogadores());
        System.out.println("O jogador que mais fez gol foi: " + resultado);
    }
}
