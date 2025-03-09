/*
SINTESE
    ENTRADA: matriz
    PROCESSAMENTO: somaDiagonal
    SAIDA: somaDiagonal

Faça um algoritmo que leia uma matriz mat 4 x 4, e imprima na tela a soma dos
elementos abaixo da diagonal principal da matriz mat.
*/
public class Main{
    public static void main(String[] args) {

        int matriz[][] = {
                {3, 5, 9, 4},
                {6, 7, 10, 2},
                {1, 15, 17, 8},
                {11, 20, 4, 13}
        };
        int somaDiagonal;

        somaDiagonal = somarDiagonalPrimaria(matriz);

        System.out.println(" O resultado da soma da diagonal da matriz é " + somaDiagonal);
    }

    public static int somarDiagonalPrimaria(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
}
