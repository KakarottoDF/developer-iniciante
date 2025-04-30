public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        View.cadastrar(sistema);

        Printer.mostrarSistemasOrdenados(sistema);
        Printer.sistemaMaisFuncionarios(sistema);
        Printer.sistemaResponsavelEduardo(sistema);
    }
}
