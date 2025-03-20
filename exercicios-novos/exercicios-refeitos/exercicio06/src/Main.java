public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        do {
            usuario.primeiroNumero = Leitor.lerInt("Insira um número: ");
            Printer.printarFatorial(usuario.primeiroNumero);
            usuario.primeiroNumero = Leitor.lerInt("Insira o primeiro número: ");
            usuario.segundoNumero = Leitor.lerInt("Insira o segundo número: ");
            Printer.printarMaiorNumero(usuario.primeiroNumero, usuario.segundoNumero);
            usuario.primeiroNumero = Leitor.lerInt("Insira um número: ");
            Printer.printarPar(usuario.primeiroNumero);
            usuario.primeiroNumero = Leitor.lerInt("Insira um número: ");
            Printer.printarPrimo(usuario.primeiroNumero);
        }while(MyMath.controlarSaidaDoPrograma("N"));
    }
}