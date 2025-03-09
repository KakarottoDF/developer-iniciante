import java.util.Scanner;

/*
SINTESE
    ENTRADA: primeiraMatriz, segundaMatriz
    PROCESSAMENTO: somarMatrizes
    SAIDA: resultadoSomaDasMatrizes
 Faça um algoritmo para somar duas matrizes.
 */
public class Main{
    public static void main(String[] args) {
        int [][]primeiraMatriz = new int [2][2];
        int [][]segundaMatriz = new int[2][2];
        int somarMatrizes;

        for(int i = 0; i < primeiraMatriz.length; i++) {
            for(int j = 0; j < segundaMatriz.length; j++) {
                primeiraMatriz[i][j] = lerValorDaMatriz("Digite o valor da primeira matriz na posição [" + i + "][" + j + "]: ");
            }
        }

        for(int i = 0; i < primeiraMatriz.length; i++) {
            for(int j = 0; j < segundaMatriz.length; j++) {
                segundaMatriz[i][j] = lerValorDaMatriz("Digite o valor da primeira matriz na posição [" + i + "][" + j + "]: ");
            }
        }

        System.out.println("MATRIZES:");
        System.out.println("Primeira Matriz:");
        for (int i = 0; i < primeiraMatriz.length; i++) {
            for (int j = 0; j < primeiraMatriz[i].length; j++) {
                System.out.print("[" + primeiraMatriz[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Segunda Matriz:");
        for (int i = 0; i < segundaMatriz.length; i++) {
            for (int j = 0; j < segundaMatriz[i].length; j++) {
                System.out.print("[" + segundaMatriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("A soma das matrizes será igual a " + (somarMatrizes(primeiraMatriz) + somarMatrizes(segundaMatriz)));
    }

    public static int lerValorDaMatriz(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerValorDaMatriz(String msg){
        System.out.print(msg);
        return lerValorDaMatriz();
    }

    public static int somarMatrizes(int [][]matrizes){
        int somar = 0;
        for(int i = 0; i < matrizes.length; i++){
            for(int j = 0; j < matrizes.length; j++){
                somar += matrizes[i][j];
            }
        }
        return somar;
    }
}
