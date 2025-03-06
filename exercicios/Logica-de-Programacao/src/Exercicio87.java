/*
SINTESE
    ENTRADA: número digitado pelo usuário (entre 1 e 10)
    PROCESSAMENTO: verifica o número e converte para o valor por extenso
    SAIDA: o número por extenso ou "Número inválido" caso o número não esteja no intervalo
*/

import java.util.Scanner;

public class Exercicio87 {

    public static void main(String[] args) {

        int numero;
        String numeroPorExtenso;

        numero = lerNumero("Digite um número entre 1 e 10: ");
        numeroPorExtenso = numeroPorExtenso(numero);

        System.out.println(numeroPorExtenso);
    }

    public static int lerNumero(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextInt();
    }

    public static String numeroPorExtenso(int numero) {
        String extenso;

        switch (numero) {
            case 1:
                extenso = "Um";
                break;
            case 2:
                extenso = "Dois";
                break;
            case 3:
                extenso = "Três";
                break;
            case 4:
                extenso = "Quatro";
                break;
            case 5:
                extenso = "Cinco";
                break;
            case 6:
                extenso = "Seis";
                break;
            case 7:
                extenso = "Sete";
                break;
            case 8:
                extenso = "Oito";
                break;
            case 9:
                extenso = "Nove";
                break;
            case 10:
                extenso = "Dez";
                break;
            default:
                extenso = "Número inválido";
        }

        return extenso;
    }
}