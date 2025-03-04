/*
SINTESE
    ENTRADA: opcaoDaVenda
    PROCESSAMENTO: valorDoDesconto ou valorDoAcrescimo e totalDaVenda
    SAIDA: valorDaVenda, valorDoDesconto ou valorDoAcrescimo e totalDaVenda
*/

import java.util.Scanner;

public class Exercicio75 {

    public static void main(String[] args) {

        double valorDaVenda;
        double valorDoDesconto;
        double valorDoAcrescimo;
        int opcaoDaVenda;
        double totalDaVenda;

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o valor da venda? R$ ");
        valorDaVenda = scan.nextDouble();

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
                valorDoDesconto = valorDaVenda * 0.10;
                totalDaVenda = valorDaVenda - valorDoDesconto;

                System.out.println("O valor da venda foi de R$ " + valorDaVenda);
                System.out.println("Houve um desconto de 10% no valor de R$ " + valorDoDesconto);
                System.out.println("O valor total da venda foi de R$ " + totalDaVenda);
                break;
            case 2:
                System.out.println("Você escolheu Venda a Prazo 30 dias.");
                valorDoDesconto = valorDaVenda * 0.05;
                totalDaVenda = valorDaVenda - valorDoDesconto;

                System.out.println("O valor da venda foi de R$ " + valorDaVenda);
                System.out.println("Houve um desconto de 5% no valor de R$ " + valorDoDesconto);
                System.out.println("O valor total da venda foi de R$ " + totalDaVenda);
                break;
            case 3:
                System.out.println("Você escolheu Venda a Prazo 60 dias.");
                totalDaVenda = valorDaVenda;

                System.out.println("O valor da venda foi de R$ " + valorDaVenda);
                System.out.println("O valor total da venda foi de R$ " + totalDaVenda);
                break;
            case 4:
                System.out.println("Você escolheu Venda a Prazo com 90 dias.");
                valorDoAcrescimo = valorDaVenda * 0.05;
                totalDaVenda = valorDaVenda + valorDoAcrescimo;

                System.out.println("O valor da venda foi de R$ " + valorDaVenda);
                System.out.println("Houve um acréscimo de 5% no valor de R$ " + valorDoAcrescimo);
                System.out.println("O valor total da venda foi de R$ " + totalDaVenda);
                break;
            case 5:
                System.out.println("Você escolheu Venda com cartão de débito.");
                valorDoDesconto = valorDaVenda * 0.08;
                totalDaVenda = valorDaVenda - valorDoDesconto;

                System.out.println("O valor da venda foi de R$ " + valorDaVenda);
                System.out.println("Houve um desconto de 8% no valor de R$ " + valorDoDesconto);
                System.out.println("O valor total da venda foi de R$ " + totalDaVenda);
                break;
            case 6:
                System.out.println("Você escolheu Venda com cartão de crédito.");
                valorDoDesconto = valorDaVenda * 0.07;
                totalDaVenda = valorDaVenda - valorDoDesconto;

                System.out.println("O valor da venda foi de R$ " + valorDaVenda);
                System.out.println("Houve um desconto de 7% no valor de R$ " + valorDoDesconto);
                System.out.println("O valor total da venda foi de R$ " + totalDaVenda);
                break;
            default:
                System.out.println("Escolha inválida. Encerrando o sistema..");
                break;
        }
    }
}