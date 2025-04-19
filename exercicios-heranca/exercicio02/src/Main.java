public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();

        View.cadastroGeral(escola);
        Printer.imprimirFuncionarios(escola);
        Printer.imprimirProfessor(escola);
    }
}