public class APIString {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(Reader.lerString("Digite uma frase: "));

        System.out.println(usuario.contarLetraA());

    }
}