public class Main {
    public static void main(String[] args) {
        Reader leitura = new Reader();
        Printer printer = new Printer();

        Anatel anatel = leitura.setQuantidadeDeFranquias();
        printer.printerEmpresas(anatel);
        printer.printarFranquiaMaisBarata(anatel);
        printer.printEmpresaOferecida(anatel);
        printer.printEmpresasPorGB(anatel);
        printer.printMediaDasFranquias(anatel);
    }
}