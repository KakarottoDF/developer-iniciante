/*
SINTESE
    ENTRADA: escolhaDoTipoDeCalculo
    PROCESSAMENTO: raizQuadrada, metadeDoNumero, dezPorCentoDoNumero, dobroDoNumero
    SAIDA: o valor do tipo de escolha do usuário
*/

import java.util.Scanner;

public class Exercicio73 {

    public static void main(String[] args) {

        int escolhaDoTipoDeCalculo;
        double numero;
        double raizQuadrada;
        double metadeDoNumero;
        double dezPorCentoDoNumeroDigitado;
        double dobroDoNumero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o tipo de cálculo:");
        System.out.printf("101 - Raiz quadrada\n102 - A metade\n103 - 10%% do número\n104 - O dobro\n");
        System.out.print("Digite um número entre 101 e 104: ");
        escolhaDoTipoDeCalculo = scan.nextInt();

        switch(escolhaDoTipoDeCalculo){
            case 101:
                System.out.print("Digite um número: ");
                numero = scan.nextDouble();

                raizQuadrada = Math.sqrt(numero);

                System.out.println("A raiz quadrada de " + numero + " é igual a " + raizQuadrada + ".");
                break;
            case 102:
                System.out.print("Digite um número: ");
                numero = scan.nextDouble();

                metadeDoNumero = numero / 2;

                System.out.println("A metade do número " + numero + " é igual a " + metadeDoNumero + ".");
                break;
            case 103:
                System.out.print("Digite um número: ");
                numero = scan.nextDouble();

                dezPorCentoDoNumeroDigitado = numero * 0.10;

                System.out.println("10% do número " + numero + " é igual a " + dezPorCentoDoNumeroDigitado + ".");
                break;

            case 104:
                System.out.print("Digite um número: ");
                numero = scan.nextDouble();

                dobroDoNumero = numero * 2;

                System.out.println("O dobro do número " + numero + " é igual a " + dobroDoNumero + ".");
                break;
            default:
                System.out.println("Escolha inválida. Encerrando o programa!");
                break;
        }

    }
}
