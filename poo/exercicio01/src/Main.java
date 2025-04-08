public class Main {
    public static void main(String[] args) {
        Anatel anatel = new Anatel();

        View.cadastrar(anatel);
        Printer.imprimirFranquias(anatel);
        Printer.imprimirFranquiaMaisBarata(anatel);
        Printer.imprimirQtdFranquias(anatel);
        Printer.imprimirQtdGigas(anatel);
        Printer.imprimirMedia(anatel);
    }
}