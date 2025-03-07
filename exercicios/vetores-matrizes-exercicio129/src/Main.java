/*
SINTESE
    ENTRADA: primeiroVetor
    PROCESSAMENTO: pegar o primeiro elemento do primeiro vetor e trocar pelo último do segundo e assim sucessivamente até o 10º com o 11º
    SAIDA: escrever o vetor modificado.

Escrever um algoritmo que lê um vetor N(20) e o escreve. Troque, a seguir, o 1º
elemento com o último, o 2º com o penúltimo etc. até o 10º com o 11º e escreva
o vetor N assim modificado.
 */

public class Main {
    public static void main(String[] args) {

        int[] primeiroVetor = new int[20];
        int[] segundoVetor = new int[20];
        int temp;

        for (int i = 0; i < primeiroVetor.length; i++) {
            primeiroVetor[i] = i + 1;
        }

        System.out.print("Primeiro Vetor: ");
        for (int i = 0; i < primeiroVetor.length; i++) {
            System.out.print(primeiroVetor[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < primeiroVetor.length; i++) {
            segundoVetor[i] = primeiroVetor[i];
        }

        for (int i = 0; i < 10; i++) {
            temp = segundoVetor[i];
            segundoVetor[i] = segundoVetor[19 - i];
            segundoVetor[19 - i] = temp;
        }

        for (int i = 10; i < 20; i++) {
            segundoVetor[i] = i + 1;
        }

        System.out.print("Segundo Vetor: ");
        for (int i = 0; i < segundoVetor.length; i++) {
            System.out.print(segundoVetor[i] + " ");
        }
    }
}
