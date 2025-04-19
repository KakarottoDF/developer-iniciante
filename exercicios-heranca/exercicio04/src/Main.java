public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = View.cadastrarPessoa();

        Printer.imprimirPessoa(pessoa);

    }
}