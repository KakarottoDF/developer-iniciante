/*
SINTESE
    ENTRADA: valorUsuario
    PROCESSAMENTO: mediaDoValor, quantidadeDeValoresImpares
    SAIDA: mediaDoValor, quantidadeDeValoresImpares, todos os valores que foram informados

Faça um programa que receba 5.000 mil dados do usuário do tipo inteiro. Sabe-se que
valores negativos não são aceitos. Após receber esses valores e popular o array, imprima
na saída padrão a média dos valores, quantos valores são ímpares e todos os valores que
foram informados.


*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        double mediaFinal = 0;
        int impares = 0;

        for(int i = 0; i < usuario.TAMANHO_DO_ARRAY; i++){
            do {
                usuario.valorUsuario[i] = popularArray("Digite o " + (i + 1) + "º valor: ");

                if(usuario.valorUsuario[i] < 0){
                    System.out.println("O valor tem que ser maior que 0(zero). Digite novamente o valor.");
                }else{
                    mediaFinal = calcularMedia(usuario.valorUsuario);
                    impares = numerosImpares(usuario.valorUsuario);
                }
            }while(usuario.valorUsuario[i] < 0);
        }
        System.out.println("MEDIA = " + mediaFinal);
        System.out.println("QTD DE NÚMEROS ÍMPARES = " + impares);

        System.out.println("VALORES QUE FORAM INFORMADOS:");
        for(int i = 0; i < usuario.TAMANHO_DO_ARRAY; i++){
            System.out.print(" | " + usuario.valorUsuario[i] + " ");
        }
    }

    public static int popularArray(){
        return new Scanner(System.in).nextInt();
    }

    public static int popularArray(String msg){
        System.out.print(msg);
        return popularArray();
    }

    public static int numerosImpares(int[] valores) {
        int impares = 0;

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] % 2 == 1) {
                impares++;
            }
        }
        return impares;
    }

    public static double calcularMedia(int[] valores) {
        int soma = 0;
        double media = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        media = soma / valores.length;

        return media;
    }
}

class Usuario{
    final int TAMANHO_DO_ARRAY = 3;
    int valorUsuario[] = new int[TAMANHO_DO_ARRAY];
}