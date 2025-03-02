/*
Faça um algoritmo que leia um número e divida-o por dois (sucessivamente)
ate que o resultado seja menor que 1. Mostre o resultado da ultima divisão e a
quantidade de divisões efetuadas
SINTESE
    ENTRADA: numero
    PROCESSAMENTO: dividir o número por dois até que o resto seja menor que 1
    SAIDA: resultado da ultima divisão e a quantidade de divisões efetuadas
*/

import java.util.Scanner;

public class Exercicio116 {

    public static void main(String[] args) {

        int numero;
        int quantidadeDeDivisoesEfetuadas;
        double resultadoDaUltimaDivisao;
        String saidaSistema;
        boolean flag = true;

        Scanner scan = new Scanner(System.in);

        while (flag) {

            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            quantidadeDeDivisoesEfetuadas = 0;
            resultadoDaUltimaDivisao = numero;

            while (resultadoDaUltimaDivisao >= 1) {
                resultadoDaUltimaDivisao = resultadoDaUltimaDivisao / 2;
                quantidadeDeDivisoesEfetuadas++;
            }

            System.out.println("O resultado da última divisão foi: " + resultadoDaUltimaDivisao);
            System.out.println("A quantidade de divisões efetuadas foi de " + quantidadeDeDivisoesEfetuadas + " vezes.");

            System.out.print("Deseja sair do sistema? Digite 1 para sim e qualquer outra coisa para Não: ");
            scan.nextLine();
            saidaSistema = scan.nextLine();

            if (saidaSistema.equals("1")) {
                flag = false;
            }
        }
    }
}
