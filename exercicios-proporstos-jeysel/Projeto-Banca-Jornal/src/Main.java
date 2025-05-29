public class Main {
    public static void main(String[] args) {
        GerenciadorBanca gerenciadorBanca = new GerenciadorBanca();

        View.alimentarArrayMorador(gerenciadorBanca);
        Printer.imprimirMoradores(gerenciadorBanca);

        View.alimentarArrayBanca(gerenciadorBanca);
    }
}