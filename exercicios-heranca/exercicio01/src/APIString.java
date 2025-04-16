public class APIString {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(Reader.lerString("Digite uma frase: "));

        System.out.println(usuario.contarLetraA());
        System.out.println(usuario.quantidadeDeCaracteres());
        System.out.println(usuario.qualificacaoDaFrase());
        System.out.println(usuario.getFrase().toUpperCase());
        System.out.println(usuario.quantidadeDePalavras());

    }
}