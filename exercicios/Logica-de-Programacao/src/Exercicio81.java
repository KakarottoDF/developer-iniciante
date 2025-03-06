/*
SINTESE
    ENTRADA: lerLetra
    PROCESSAMENTO: verificar se é vogal ou consoante
    SAIDA: vogal ou consoante

    Crie um algoritmo para ler uma letra do alfabeto e mostrar uma mensagem: se é
vogal ou consoante
*/

import java.util.Scanner;

public class Exercicio81 {

    public static void main(String[] args) {

        String lerLetra;

        lerLetra = leituraDaLetra("Digite um letra: ");

        switch(lerLetra){
            case "A", "E", "I", "O", "U":
                System.out.println("VOGAL");
                break;

            default:
                System.out.println("CONSOANTE");
                break;
        }

    }

    public static String leituraDaLetra(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public static String leituraDaLetra(String msg){
        System.out.print(msg);
        return leituraDaLetra();
    }
}
