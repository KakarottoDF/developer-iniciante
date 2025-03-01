/*
SINTESE
    ENTRADA: quantidadeDeRepeticoesDoSistema e conjuntoDeNumeros
    PROCESSAMENTO: par ou impar e quantidadeDePares e quantidadeDeImpares
    SAIDA: 
*/

import java.util.Scanner;

public class Exercicio109 {

    public static void main(String[] args) {
        
        int quantidadeDeRepeticoesDoSistema;
        int conjuntoDeNumeros;
        int quantidadeDeNumerosPares = 0;
        int quantidadeDeNumerosImpares = 0;
        String escolha = "S";

        Scanner scan = new Scanner(System.in);

        while(escolha.equals("S")){
            System.out.println("Digite a quantidade de conjunto de números que deseja verificar se é par ou ímpar:");
            quantidadeDeRepeticoesDoSistema = scan.nextInt();

            for(int i = 1; i <= quantidadeDeRepeticoesDoSistema; i++){
                System.out.println("Digite o " + i + "º número:");
                conjuntoDeNumeros = scan.nextInt();

                if(conjuntoDeNumeros % 2 == 0){
                    quantidadeDeNumerosPares++;
                }else{
                    quantidadeDeNumerosImpares++;
                }
            }

            System.out.println("Pares = " + quantidadeDeNumerosPares);
            System.out.println("Ímpares = " + quantidadeDeNumerosImpares);

            System.out.println("Deseja continuar? [S]Sim [N]Não:");
            scan.nextLine();
            escolha = scan.nextLine().toUpperCase();

            quantidadeDeRepeticoesDoSistema = 0;
            conjuntoDeNumeros = 0;
            quantidadeDeNumerosPares = 0;
            quantidadeDeNumerosImpares = 0;
        }
    }


}