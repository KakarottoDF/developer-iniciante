public class Main {
    public static void main(String[] args) {
        Fifa fifa = new Fifa();
        Jogador jogador = new Jogador();

        View.cadastrar(fifa);
        Printer.imprimirJogadores(fifa);
        Printer.imprimirArtilheiro(fifa);
        Printer.imprimirJogadores(fifa, "Mediana");
        Printer.imprimirMediaGolsMaioresDeIdade(fifa);
    }
}