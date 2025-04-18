public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        View.cadastroGeral(universidade);
        Printer.imprimirFuncionarios(universidade);
        Printer.imprimirProfessor(universidade);
    }
}