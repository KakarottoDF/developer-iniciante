/*
SINTESE
    ENTRADA: posicaoDoTermo, primeiroTermo, razaoDaPA
    PROCESSAMENTO: Calcular os n termos da PA e calcular a soma dos termos da PA.
    SAIDA: Exibir os termos da PA e a soma
*/

import java.util.Scanner;

public class Exercicio119 {

    public static void main(String[] args) {

        int soma = 0;
        int i = 0;
        int termo = 0;
        int posicaoDoTermo = 0;
        int primeiroTermo = 0;
        int razaoDaPA = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (n): ");
        posicaoDoTermo = scanner.nextInt();

        System.out.print("Digite o primeiro termo da PA (a1): ");
        primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da PA (r): ");
        razaoDaPA = scanner.nextInt();

        termo = primeiroTermo;

        System.out.println("Os termos da Progressão Aritmética são:");

        while(i < posicaoDoTermo){
            System.out.print(termo + " ");
            soma += termo;
            termo += razaoDaPA;
            i++;
            }

        System.out.println("\nA soma dos termos é: " + soma);
        }
}