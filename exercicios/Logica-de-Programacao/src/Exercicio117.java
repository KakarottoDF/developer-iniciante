/*
SINTESE
    ENTRADA: numero
    PROCESSAMENTO: calcular o valor de E, onde E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
    SAIDA: 
*/

import java.util.Scanner;

public class Exercicio117 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        double valorDeE = 1.0;
        int fatorial;
        int j = 1;
        String saidaSistema;
        boolean continuar = true;

        while (continuar){

            System.out.print("Digite um valor inteiro e positivo N: ");
            numero = scanner.nextInt();

            if(numero <= 0){
                System.out.println("O valor de N deve ser um número inteiro positivo.");
            }else{
                for (int i = 1; i <= numero; i++) {
                    fatorial = 1;

                    while (j <= i) {
                        fatorial *= j;
                        j++;
                    }

                    valorDeE += 1.0 / fatorial;
                }

                System.out.printf("O valor de E até numero = %d é: %.10f\n", numero, valorDeE);
            }

            System.out.print("Deseja continuar? Digite 1 para sim e qualquer outra coisa para Não: ");
            scanner.nextLine();
            saidaSistema = scanner.nextLine();

            if (!saidaSistema.equals("1")) {
                continuar = false;
            }
        }

    }
}