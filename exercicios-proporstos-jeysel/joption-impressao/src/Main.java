public class Main {
    public static void main(String[] args) {
        GerenciarPessoas gerenciarPessoas = new GerenciarPessoas();

        View.cadastrarPessoa(gerenciarPessoas);
        Printer.imprimirPessoas(gerenciarPessoas);
    }
}