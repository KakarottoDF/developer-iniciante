/*
SINTESE
    ENTRADA:
    PROCESSAMENTO:
    SAIDA:

Faça um algoritmo que leia uma matriz mat 2 x 3 e imprima na tela a soma de
todos os elementos da matriz mat.
*/

public class Main{
    public static void main(String[] args) {
        int matriz[][] = {
                {2, 5},
                {7, 10},
                {1, 8}
        };
        int resultado;

        resultado = somarMatriz(matriz);

        System.out.println(resultado);

    }

    public static int somarMatriz(int[][] matriz){
        int soma = 0;
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
        }
}
