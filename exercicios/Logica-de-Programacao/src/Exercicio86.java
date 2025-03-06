/*
SINTESE
    ENTRADA: mês (um número entre 1 e 12)
    PROCESSAMENTO: a partir do mês informado, determina-se a estação correspondente
    SAIDA: mensagem com o mês e a estação do ano correspondente
*/

import java.util.Scanner;

public class Exercicio86 {

    public static void main(String[] args) {

        int mes;

        mes = lerMes("Digite o número do mês (1 a 12): ");

        String estacao = determinarEstacao(mes);

        System.out.println("A estação do ano correspondente ao mês " + mes + " é " + estacao);
    }

    public static int lerMes(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextInt();
    }

    public static String determinarEstacao(int mes) {
        String estacao;

        switch (mes) {
            case 1, 2, 3:
                estacao = "Verão";
                break;
            case 4, 5, 6:
                estacao = "Outono";
                break;
            case 7, 8, 9:
                estacao = "Inverno";
                break;
            case 10, 11, 12:
                estacao = "Primavera";
                break;
            default:
                estacao = "Mês inválido";
        }

        return estacao;
    }
}
