/*
SINTESE
    ENTRADA: mes, ano
    PROCESSAMENTO: anoBissexto
    SAIDA:
    Elaborar um algoritmo para imprimir o número de dias de um dado mês e ano.
Anos bissextos deverão ser tratados convenientemente.
Dica: Anos bissextos são múltiplos de 4 e não são múltiplos de 100, exceto os
anos múltiplos de 400, que também são bissextos.
*/

import java.util.Scanner;

public class Exercicio77 {

    public static void main(String[] args) {

        int mes;
        int ano;
        int diasNoMes;
        boolean anoBissexto;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o mês (1-12): ");
        mes = scan.nextInt();
        System.out.print("Digite o ano: ");
        ano = scan.nextInt();

        anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diasNoMes = 31;
                break;
            case 4, 6, 9, 11:
                diasNoMes = 30;
                break;
            case 2:
                if (anoBissexto) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;
            default:
                diasNoMes = -1;
                break;
        }

        if (diasNoMes != -1 && diasNoMes > 12) {

            if (anoBissexto) {
                System.out.println("O ano " + ano + " é bissexto!");
            } else {
                System.out.println("O ano " + ano + " não é bissexto.");
            }

            System.out.println("O mês " + mes + " do ano de " + ano + " tem " + diasNoMes + " dias.");

        } else {
            System.out.println("Mês inválido.");
        }

    }
}
