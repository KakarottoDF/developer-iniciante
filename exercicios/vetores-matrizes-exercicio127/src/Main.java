/*
SINTESE
    ENTRADA: primeiroVetor[0], segundoVetor[0]
    PROCESSAMENTO: somar os dois vetores e armazenar no terceiroVetor[0]
    SAIDA: terceiroVetor[0]

Faça um algoritmo que some o conteúdo de dois vetores e armazene o
resultado em um terceiro vetor.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double []primeiroVetor = new double[1];
        double []segundoVetor = new double[1];
        double []terceiroVetor = new double[1];

        primeiroVetor[0] = lerNumero("Digite o primeiro número: ");
        segundoVetor[0] = lerNumero("Digite o segundo número: ");

        terceiroVetor[0] = somarNumeros(primeiroVetor[0], segundoVetor[0]);

        System.out.println(primeiroVetor[0] + " + " + segundoVetor[0] + " = " + terceiroVetor[0]);
    }

    public static double lerNumero(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerNumero(String msg) {
        System.out.print(msg);
        return lerNumero();
    }

    public static double somarNumeros(double num1, double num2){
        return num1 + num2;
    }
}
