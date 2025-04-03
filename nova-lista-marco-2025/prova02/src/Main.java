public class Main {
    public static void main(String[] args) {

        boolean continuar;

        Pasta pasta = View.cadastrarPasta();

        Printer.print(pasta);

    }
}