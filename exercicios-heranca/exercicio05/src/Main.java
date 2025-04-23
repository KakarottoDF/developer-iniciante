public class Main {
    public static void main(String[] args) {
        UsuarioSistema usuarioSistema = new UsuarioSistema();

        View.cadastrar(usuarioSistema);

        Printer.imprimirPessoa(usuarioSistema);

    }
}