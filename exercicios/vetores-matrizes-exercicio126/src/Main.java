/*
SINTESE
    ENTRADA: primeiroVetor[0]
    PROCESSAMENTO: copiando conteúdo do primeiro para segundoVetor[0]
    SAIDA: segundoVetor[0]

*/

public class Main {
    public static void main(String[] args) {
        String []primeiroVetor = new String[1];
        String []segundoVetor = new String[1];

        primeiroVetor[0] = "TESTANDO";
        segundoVetor[0] = primeiroVetor[0];

        System.out.println(segundoVetor[0]);
    }

}
