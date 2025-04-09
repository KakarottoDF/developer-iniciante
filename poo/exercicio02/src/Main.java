public class Main {
    public static void main(String[] args) {
        Administracao administracao = new Administracao();

        View.cadastrar(administracao);
        Printer.imprimirAcoes(administracao);
    }
}