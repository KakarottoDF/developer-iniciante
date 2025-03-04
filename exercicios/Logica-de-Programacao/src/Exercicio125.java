/*
SINTESE
    ENTRADA: numAndares, pessoasEntraram, pessoasSairam
    PROCESSAMENTO: pessoasNoElevador, excesso
    SAIDA: pessoasNoElevador
*/

import java.util.Scanner;

public class Exercicio125 {

    public static void main(String[] args) {
        int numAndares;
        int pessoasEntraram;
        int pessoasSairam;
        int pessoasNoElevador = 0;
        int excesso;
        int andar = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de andares do prédio: ");
        numAndares = scan.nextInt();

        while (andar <= numAndares) {
            System.out.print("Andar " + andar + " - Quantas pessoas entraram? ");
            pessoasEntraram = scan.nextInt();
            System.out.print("Andar " + andar + " - Quantas pessoas saíram? ");
            pessoasSairam = scan.nextInt();

            pessoasNoElevador = pessoasNoElevador + pessoasEntraram - pessoasSairam;

            if (pessoasNoElevador > 15) {
                excesso = pessoasNoElevador - 15;
                System.out.println("EXCESSO DE PASSAGEIROS. DEVEM SAIR " + excesso + " PESSOAS.");

                pessoasNoElevador = 15;
            }
            andar++;
        }
        System.out.println("No final da subida, o elevador tem " + pessoasNoElevador + " pessoas, que irão descer.");
    }
}