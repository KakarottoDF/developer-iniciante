/*
SINTESE
    ENTRADA: nomeDaPessoa, alturaDaPessoa e pesoDaPessoa
    PROCESSAMENTO: pessoaMaisPesada, pessoaMaisAlta
    SAIDA: nomeDaPessoa, pessoaMaisPesada e pessoaMaisAlta
*/

import java.util.Scanner;

public class Exercicio113 {

    public static void main(String[] args) {

        int repeticoes = 1;
        String nomeDaPessoa;
        double alturaDaPessoa;
        double pesoDaPessoa;
        double pessoaMaisPesada = 0.0;
        double pessoaMaisAlta = 0.0;
        String nomeDaPessoaMaisAlta = "";
        String nomeDaPessoaMaisPesada = "";

        Scanner scanner = new Scanner(System.in);

        while(repeticoes <= 2){
            System.out.println("Entre com o nome da " + repeticoes + "ª pessoa:");
            nomeDaPessoa = scanner.nextLine();

            System.out.println("Entre com a altura da " + repeticoes + "ª pessoa: ");
            alturaDaPessoa = scanner.nextDouble();

            System.out.println("Entre com o peso da " + repeticoes + "ª pessoa: ");
            pesoDaPessoa = scanner.nextDouble();

            if(alturaDaPessoa > pessoaMaisAlta){
                pessoaMaisAlta = alturaDaPessoa;
                nomeDaPessoaMaisAlta = nomeDaPessoa;
            }

            if(pesoDaPessoa > pessoaMaisPesada){
                pessoaMaisPesada = pesoDaPessoa;
                nomeDaPessoaMaisPesada = nomeDaPessoa;
            }
            repeticoes++;
            scanner.nextLine();
        }

        System.out.println("NOME DA PESSOA MAIS ALTA: " + nomeDaPessoaMaisAlta);
        System.out.println("ALTURA DESSA PESSOA: " + pessoaMaisAlta);
        System.out.println("NOME DA PESSOA MAIS PESADA: " + nomeDaPessoaMaisPesada);
        System.out.println("PESO DESSA PESSOA: " + pessoaMaisPesada);
        
    }


}