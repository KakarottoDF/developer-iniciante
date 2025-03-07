/*
SINTESE
    ENTRADA: primeiroVetor,segundoVetor
    PROCESSAMENTO: criar um terceiro vetor com o dobro do tamanho dos outros dois
    SAIDA: terceiroVetor
Faça um algoritmo que faça a união de dois vetores de mesmo tamanho e
mesmo tipo em um terceiro vetor com dobro do tamanho.a
*/

public class Main {
    public static void main(String[] args) {
        int []primeiroVetor = new int[4];
        int []segundoVetor = new int[primeiroVetor.length];
        int []terceiroVetor = new int[(primeiroVetor.length + segundoVetor.length)];

        System.out.println("Primeiro Vetor:");
        for(int i = 0; i < primeiroVetor.length; i++){
            System.out.println(i + 1);
        }

        System.out.println("Segundo Vetor:");
        for(int i = 0; i < segundoVetor.length; i++){
            System.out.println(i + 1);
        }

        System.out.println("Terceiro Vetor:");
        for(int i = 0; i < terceiroVetor.length; i++){
            System.out.println(i + 1);
        }
    }
}
