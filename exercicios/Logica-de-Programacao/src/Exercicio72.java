/*
SINTESE
    ENTRADA: nomeDoAtleta, idadeDoAtleta
    PROCESSAMENTO: idadeDoAtleta
    SAIDA: nomeDoAtleta, sua categoria
*/

import java.util.Scanner;

public class Exercicio72 {

    public static void main(String[] args) {

        String nomeDoAtleta;
        int idadeDoAtleta;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do atlela: ");
        nomeDoAtleta = scan.nextLine();

        System.out.print("Digite a idade deste atleta: ");
        idadeDoAtleta = scan.nextInt();

        switch(idadeDoAtleta){
            case 5, 6, 7, 8, 9, 10:
                System.out.println("O atleta " + nomeDoAtleta + ", está na categoria INFANTIL.");
                break;

            case 11, 12, 13, 14, 15:
                System.out.println("O atleta " + nomeDoAtleta + ", está na categoria JUVENIL.");
                break;

            case 16, 17, 18, 19, 20:
                System.out.println("O atleta " + nomeDoAtleta + ", está na categoria JÚNIOR.");
                break;

            case 21, 22, 23, 24, 25:
                System.out.println("O atleta " + nomeDoAtleta + ", está na categoria PROFISSIONAL.");
                break;

            default:
                System.out.println("Você digitou uma idade fora de todas as categorias. Encerrando o programa!");
                break;
        }

    }
}
