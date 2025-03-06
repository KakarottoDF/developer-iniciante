/*
SINTESE
    ENTRADA: lerUmNumero
    PROCESSAMENTO: verificar dia da semana
    SAIDA: maior
*/

import java.util.Scanner;

public class Exercicio80 {

    public static void main(String[] args) {
        int lerUmNumero;

       lerUmNumero =  leituraDeUmNumero("Digite um número de 1 a 7: ");

        switch(lerUmNumero){
            case 1:
                System.out.println("DOMINGO");
                break;

            case 2:
                System.out.println("SEGUNDA");
                break;

            case 3:
                System.out.println("TERÇA");
                break;

            case 4:
                System.out.println("QUARTA");
                break;

            case 5:
                System.out.println("QUINTA");
                break;

            case 6:
                System.out.println("SEXTA");
                break;

            case 7:
                System.out.println("SÁBADO");
                break;

            default:
                System.out.println("Opção inválida. O programa será encerrado.");
                break;
        }
    }

    public static int leituraDeUmNumero(String msg){
        System.out.print(msg);
        return leituraDeUmNumero();
    }

    public static int leituraDeUmNumero(){
        return new Scanner(System.in).nextInt();
    }
}
