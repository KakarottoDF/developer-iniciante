/*
SINTESE
    ENTRADA: quantidadeDeRepeticoesDoSistema, entradaDeNumero
    PROCESSAMENTO: maior
    SAIDA: maior
*/

import java.util.Scanner;

public class Exercicio82 {

    public static void main(String[] args) {

        double precoProduto;
        int codigoDeOrigem;

        precoProduto = lerPrecodoProduto("Digite o preço do Produto R$ ");
        codigoDeOrigem = lerCodigoDeOrigem("Digite o código de Origem do Produto de 5 até 35: ");

        switch(codigoDeOrigem){
            case 5, 6:
                System.out.println("PREÇO R$ " + precoProduto);
                System.out.println("PROCEDÊNCIA: NORDESTE");
                break;

            case 7, 8, 9:
                System.out.println("PREÇO R$ " + precoProduto);
                System.out.println("PROCEDÊNCIA: SUDESTE");
                break;

            case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("PREÇO R$ " + precoProduto);
                System.out.println("PROCEDÊNCIA: CENTRO OESTE");
                break;

            case 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35:
                System.out.println("PREÇO R$ " + precoProduto);
                System.out.println("PROCEDÊNCIA: NORDESTE");
                break;

            default:
                System.out.println("IMPORTADO");
        }
    }

    public static double lerPrecodoProduto(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerPrecodoProduto(String msg){
        System.out.print(msg);
        return lerPrecodoProduto();
    }

    public static int lerCodigoDeOrigem(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerCodigoDeOrigem(String msg){
        System.out.print(msg);
        return lerCodigoDeOrigem();
    }
}
