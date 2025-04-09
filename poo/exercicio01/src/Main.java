public class Main {
    public static final String NOME_FRANQUIA = "VIVO";
    public static final int QTD_GIGA = 2;

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