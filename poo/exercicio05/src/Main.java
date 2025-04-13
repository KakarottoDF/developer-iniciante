public class Main {
    public static void main(String[] args) {
        Triatlo triatlo = new Triatlo();

        View.cadastrar(triatlo);
        Printer.imprimirAtletas(triatlo);
    }
}