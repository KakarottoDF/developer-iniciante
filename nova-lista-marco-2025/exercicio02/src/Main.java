public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        Printer printer = new Printer();

        UnidadeAdministrativa unidades = read.preencherUnidadeAdministrativa();


        printer.imprimirEmpresas(unidades);
        printer.imprimirAcoesPrioritarias(unidades);
        printer.imprimirAcoesTerceiroTrimestre(unidades);
        printer.imprimirAcoes2017(unidades);
    }
}