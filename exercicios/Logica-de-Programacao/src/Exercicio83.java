/*
SINTESE
    ENTRADA: operação desejada (soma, subtração, multiplicação, divisão) e dois números
    PROCESSAMENTO: dependendo da operação escolhida, a respectiva operação matemática é realizada
    SAIDA: o resultado da operação escolhida é exibido
*/

import java.util.Scanner;

public class Exercicio83 {

    public static void main(String[] args) {

        int operacao;
        double num1, num2;

        operacao = lerOperacao("Escolha a operação desejada (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão): ");
        num1 = lerNumero("Digite o primeiro número: ");
        num2 = lerNumero("Digite o segundo número: ");

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma: " + somar(num1, num2));
                break;

            case 2:
                System.out.println("Resultado da subtração: " + subtrair(num1, num2));
                break;

            case 3:
                System.out.println("Resultado da multiplicação: " + multiplicar(num1, num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + dividir(num1, num2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida! Escolha uma operação de 1 a 4.");
                break;
        }
    }
    public static int lerOperacao(String msg){
        System.out.print(msg);
        return new Scanner(System.in).nextInt();
    }

    public static double lerNumero(String msg){
        System.out.print(msg);
        return new Scanner(System.in).nextDouble();
    }

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }
}
