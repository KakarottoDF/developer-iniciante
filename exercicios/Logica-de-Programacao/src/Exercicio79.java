/*
SINTESE
    ENTRADA: lerPrimeiraLetraEstadoCivil
    PROCESSAMENTO: verificar o estado civil
    SAIDA: descrição (Solteiro, Casado, Viúvo, Divorciado, Desquitado)
*/

import java.util.Scanner;

public class Exercicio79 {

    public static void main(String[] args) {
        String lerPrimeiraLetraEstadoCivil;

        lerPrimeiraLetraEstadoCivil = lerEstadoCivil("Digite a primeira leta do Estado Civil: [S] [C] [V] [D] [X]");

        switch(lerPrimeiraLetraEstadoCivil){
            case "S":
                System.out.println("Seu estado civil é SOLTEIRO");
                break;

            case "C":
                System.out.println("Seu estado civil é CASADO");
                break;

            case "V":
                System.out.println("Seu estado civil é VIÚVO");
                break;

            case "D":
                System.out.println("Seu estado civil é DIVORCIADO");
                break;

            case "X":
                System.out.println("Seu estado civil é DESQUITADO");
                break;

            default:
                System.out.println("Opção inválida. Programa encerrado!");
                break;
        }
    }

    public static String lerEstadoCivil(String msg) {
        System.out.println(msg);
        return lerEstadoCivil();
    }

    public static String lerEstadoCivil(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }
}
