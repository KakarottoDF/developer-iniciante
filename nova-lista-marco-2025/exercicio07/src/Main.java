public class Main {
    public static void main(String[] args) {
        Fifa fifa = new Fifa();
        Jogador jogador = new Jogador();

        View.cadastrar(fifa);
        Printer.imprimirJogadores(fifa);
    }
}