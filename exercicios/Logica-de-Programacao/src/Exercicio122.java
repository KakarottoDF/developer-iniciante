/*
SINTESE
    ENTRADA: valorDeN
    PROCESSAMENTO: mostrar o primeiro termo a, igual ele ao segundo que inicializou com 1, calcular o próximo termo que é a + b e colocar ele no valor de b
    SAIDA: sequência de Fibonacci de acordo com a sequência digitada.
*/

import java.util.Scanner;

public class Exercicio122 {

    public static void main(String[] args) {
        int valorDeN;
        int a = 0;
        int b = 1;
        int contador = 1;
        int proximoTermo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número N (N >= 2): ");
        valorDeN = scanner.nextInt();

        System.out.print("Sequência de Fibonacci: ");

        while (contador <= valorDeN) {
            System.out.print(a + " ");
            proximoTermo = a + b;
            a = b;
            b = proximoTermo;

            contador++;
        }
    }


}