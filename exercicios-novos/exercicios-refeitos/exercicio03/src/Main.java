public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        ServiceUsuario.popularArray(usuario);

        Printer.printarMedia(usuario);
        Printer.printarNumerosImpares(usuario);
        Printer.printarValores(usuario);
    }
}