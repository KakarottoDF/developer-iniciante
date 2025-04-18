public class APIString {
    public static void main(String[] args) {
        Frase frase = new Frase(Reader.lerString("Digite uma frase: "));

        System.out.println(frase.contarLetraA('a'));
        System.out.println(frase.quantidadeDeCaracteres());
        System.out.println(frase.qualificacaoDaFrase());
        System.out.println(frase.getFrase());
        System.out.println(frase.quantidadeDePalavras());

    }
}