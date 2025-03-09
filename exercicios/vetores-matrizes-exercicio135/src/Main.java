import java.util.Scanner;

public class Main {
    public static final int LINHA_EXERCICIO = 3;
    public static final int COLUNA_EXERCICIO = 1;
    public static void main(String[] args) {

        int[][] matriz = {
                {5, 2, 3, 9},
                {4, 1, 3, 2},
                {6, 3, 4, 4},
                {6, 3, 4, 4}
        };

        int soma = 0;

        int operacao = lerInt("Informe a operação que deseja realizar (1, 2, 3 ou 4):");


        switch (operacao){
            case 1:  soma = somarLinha(matriz, LINHA_EXERCICIO);break;
            case 2:  soma = somarColuna(matriz, COLUNA_EXERCICIO);break;
            case 3:  soma = somarDiagonalPrimaria(matriz);break;
            case 4:  soma = somarDiagonalSecundaria(matriz); break;
            default: System.out.println("Por favor, insira uma operação válida.");
        }

        printInt(soma);

    }

    /**
     *
     * @param matriz bidimensional
     * @param linha - varia a linha dentro da matriz partindo de zero.
     * @return a soma da linha informada. Caso a linha, seja maior que o tamanho retornará -9999999
     */
    public static int somarLinha(int[][] matriz, int linha){
        int soma = 0;
        if(linha < matriz.length - 1) {
            for (int i = 0; i < matriz[linha].length; i++) {
                soma += matriz[linha][i];
            }
            return soma;
        }else{
            return -9999999; // NÃO É UMA BOA PRATICA... NO JAVA EXISTE O LANÇAMENTOS DE EXCEPTIONS.
        }
    }


    public static int somarColuna(int[][] matriz, int coluna){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == coluna) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
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

    public static int somarDiagonalSecundaria(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }



    public static void printInt(int inteiro){
        System.out.println(inteiro);
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

}