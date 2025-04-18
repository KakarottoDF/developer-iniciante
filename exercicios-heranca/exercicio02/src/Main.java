public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        View.cadastrar(universidade);
        Printer.imprimirFuncionarios(universidade);
    }
}