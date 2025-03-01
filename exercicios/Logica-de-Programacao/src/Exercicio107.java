/*
SINTESE
    ENTRADA: quantidadeDeRepeticoesDoSistema, entradaDeNumero
    PROCESSAMENTO: maior
    SAIDA: maior
*/

import java.util.Scanner;

public class Exercicio107 {

    public static void main(String[] args) {
        
        String execucao;
        int sentinela = 0;
        int quantidadeDeRepeticoesDoSistema;
        int entradaDeNumero;
        int maior = 0;
        
        Scanner scan = new Scanner(System.in);

        while(sentinela != 9999) {
            System.out.println("Quantos números você deseja ver qual é o Maior?");
            quantidadeDeRepeticoesDoSistema = scan.nextInt();

            for(int i = 1; i <= quantidadeDeRepeticoesDoSistema; i++){
                System.out.println("Entre com o " + i + "º número: ");
                entradaDeNumero = scan.nextInt();

                if(i == 1){
                    maior = entradaDeNumero;
                }

                if(entradaDeNumero > maior){
                    maior = entradaDeNumero;
                }
            }

            System.out.println("O maior número digitado foi: " + maior);

            System.out.println("Deseja continuar? [S]Sim [N]Não ");
            scan.nextLine();
            execucao = scan.nextLine().toUpperCase();

            if (execucao.equals("N")) {
                sentinela = 9999;
                }else{
                    quantidadeDeRepeticoesDoSistema = 0;
                    entradaDeNumero = 0;
                    maior = 0;
                    execucao = "";
                }
         }
    }
}