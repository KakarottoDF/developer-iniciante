/*
 SINTESE
    ENTRADA: valorDaLinhaDaMatriz, valorDaColunaDaMatriz, matriz
    PROCESSAMENTO: matrizTransposta
    SAIDA: matrizTransposta

    Faça um algoritmo para calcular a transposta de uma matriz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valorDaLinhaDaMatriz = tamanhoDaMatriz("Quantas linhas terá essa matriz: ");
        int valorDaColunaDaMatriz = tamanhoDaMatriz("Quantas colunas terá essa matriz: ");;
        int matriz[][] = new int[valorDaLinhaDaMatriz][valorDaColunaDaMatriz];
        int matrizTransposta[][] = new int[valorDaColunaDaMatriz][valorDaLinhaDaMatriz];

        if(valorDaColunaDaMatriz == valorDaLinhaDaMatriz){
            System.out.println("Essa  é uma matriz simétrica, a transposta sempre será diferente da original, pois muda o número de linhas e colunas.");
        }else{

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = tamanhoDaMatriz("Valor da Matriz: ");
                }
            }

            for(int i = 0; i < valorDaLinhaDaMatriz; i++) {
                for (int j = 0; j < valorDaColunaDaMatriz; j++) {
                    matrizTransposta[j][i] = matriz[i][j];
                }
            }

            System.out.println("MATRIZ ORIGINAL:");
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("MATRIZ TRANSPOSTA:");
            for(int i = 0; i < matrizTransposta.length; i++){
                for(int j = 0; j < matrizTransposta[i].length; j++){
                    System.out.print(matrizTransposta[i][j] + " ");
                }
                System.out.println();
            }

        }



    }
    public static int tamanhoDaMatriz(){
        return new Scanner(System.in).nextInt();
    }

    public static int tamanhoDaMatriz(String msg){
        System.out.print(msg);
        return tamanhoDaMatriz();
    }
}