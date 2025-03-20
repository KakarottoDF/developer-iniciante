public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        do {
            usuario.primeiroNumero = Leitor.lerInt("Insira um número: ");
            Printer.printarFatorial(usuario);
        }while(MyMath.controlarSaidaDoPrograma("N"));
    }
}