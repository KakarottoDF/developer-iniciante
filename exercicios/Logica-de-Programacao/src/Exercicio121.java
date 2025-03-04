/*
SINTESE
    ENTRADA: numeroInteiro
    PROCESSAMENTO: (verificacaoQuadrado + 1) * (verificacaoQuadrado + 1) <= numeroInteiro
    SAIDA: verificacaoQuadrado
*/

import java.util.Scanner;

public class Exercicio121 {

    public static void main(String[] args) {

        int numeroInteiro;
        int verificacaoQuadrado = 0;
        int quadrado;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        numeroInteiro = scanner.nextInt();

        while ((verificacaoQuadrado + 1) * (verificacaoQuadrado + 1) <= numeroInteiro) {
            verificacaoQuadrado++;
        }

        quadrado = verificacaoQuadrado * verificacaoQuadrado;

        System.out.println("O menor quadrado é " + quadrado + " (quadrado de " + verificacaoQuadrado + ").");
    }
}