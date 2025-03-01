/*
SINTESE
    ENTRADA: entradaDeNumerosInteiros
    PROCESSAMENTO: somaDNumerosInteiros
    SAIDA: somaDNumerosInteiros
*/

import java.util.Scanner;

public class Exercicio110 {

    public static void main(String[] args) {
        String escolha = "N";
        int numerosInteiros;
        int somaDosNumerosInteiros = 0;
        final int repeticoes = 11;

        Scanner scan = new Scanner(System.in);

        while(escolha.equals("N")){
            for(int i = 1; i < repeticoes; i++){
                System.out.println("Digite o " + i + "º número:");
                numerosInteiros = scan.nextInt();

                somaDosNumerosInteiros += numerosInteiros;
            }

            System.out.println("A soma dos números inteiros é de " + somaDosNumerosInteiros);

            System.out.println("Deseja sair do sistema?\n[S]Sim [N]Não");
            scan.nextLine();
            escolha = scan.nextLine().toUpperCase();

            numerosInteiros = 0;
            somaDosNumerosInteiros = 0;
        }
    }


}