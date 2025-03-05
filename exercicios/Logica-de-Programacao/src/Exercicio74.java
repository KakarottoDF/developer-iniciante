/*
SINTESE
    ENTRADA: opcaoDaVenda
    PROCESSAMENTO: opcaoDaVenda
    SAIDA: qual o tipo de venda escolhida
*/

import java.util.Scanner;

public class Exercicio74 {

    public static void main(String[] args) {

        int opcaoDaVenda;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a opção:");
        System.out.println("1 - Venda a Vista");
        System.out.println("2 - Venda a Prazo 30 dias");
        System.out.println("3 - Venda a Prazo 60 dias");
        System.out.println("4 - Venda a Prazo com 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Escolha a opção: ");
        opcaoDaVenda = scan.nextInt();

        switch(opcaoDaVenda){
            case 1:
                System.out.println("Você escolheu Venda a Vista.");
                break;
            case 2:
                System.out.println("Você escolheu Venda a Prazo 30 dias.");
                break;
            case 3:
                System.out.println("Você escolheu Venda a Prazo 60 dias.");
                break;
            case 4:
                System.out.println("Você escolheu Venda a Prazo com 90 dias.");
                break;
            case 5:
                System.out.println("Você escolheu Venda com cartão de débito.");
                break;
            case 6:
                System.out.println("Você escolheu Venda com cartão de crédito.");
                break;
            default:
                System.out.println("Escolha inválida. Encerrando o sistema..");
                break;
        }
    }
}
