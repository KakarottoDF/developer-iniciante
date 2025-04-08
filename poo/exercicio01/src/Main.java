public class Main {
    public static void main(String[] args) {
        Anatel anatel = new Anatel();

        View.cadastrar(anatel);
        Printer.imprimirFranquias(anatel);
    }
}