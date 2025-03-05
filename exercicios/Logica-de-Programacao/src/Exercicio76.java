/*
SINTESE
    ENTRADA: dataDoAno
    PROCESSAMENTO: pegar o mês digitado
    SAIDA: estacaoDoAnoCorrespondente
*/

import java.util.Scanner;

public class Exercicio76 {

    public static void main(String[] args) {

        int dataDoAno;
        //int dia;
        int mes;
        //int ano;
        int estacaoDoAnoCorrespondente;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma data no formato DDMMAAAA: ");
        dataDoAno = scan.nextInt();

        //dia = dataDoAno / 1000000;
        mes = (dataDoAno % 1000000) / 10000;
        //ano = dataDoAno % 10000;

        estacaoDoAnoCorrespondente = mes;

        switch(estacaoDoAnoCorrespondente){
            case 12, 1, 2:
                System.out.println("VERÃO");
                break;
            case 3, 4, 5:
                System.out.println("OUTONO");
                break;
            case 6, 7, 8:
                System.out.println("INVERNO");
                break;
            case 9, 10, 11:
                System.out.println("PRIMAVERA");
                break;
            default:
                System.out.println("Estação não correspondente. Finalizando o programa.");
                break;
        }
    }
}
