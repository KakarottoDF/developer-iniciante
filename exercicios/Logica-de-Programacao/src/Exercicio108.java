/*
SINTESE
    ENTRADA: num1 e num2
    PROCESSAMENTO: quociente e resto da divisão
    SAIDA: num1, num2, quociente e resto
*/

import java.util.Scanner;

public class Exercicio108 {

    public static void main(String[] args) {
        
        String escolha = "";
        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);

        while (!escolha.equals("N")) {

            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = scan.nextInt();

            System.out.println("N1 = " + num1 + "\nN2 = " + num2 + "\nQ = " + (num1 / num2));
            System.out.println("N1 = " + num1 + "\nN2 = " + num2 + "\nR = " + (num1 % num2));

            System.out.println("Deseja continuar? [S]Sim [N]Não");
            scan.nextLine();
            escolha = scan.nextLine().toUpperCase();
        }
    }


}