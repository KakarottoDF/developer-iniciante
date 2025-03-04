/*
SINTESE
    ENTRADA: matricula, nota1, nota2 , nota3
    PROCESSAMENTO: mediaFinal, totalAlunos, aprovados, reprovados
    SAIDA: matricula, mediaFinal, totalAlunos, aprovados, reprovados
*/

import java.util.Scanner;

public class Exercicio124 {

    public static void main(String[] args) {

        int matricula;
        double nota1;
        double nota2;
        double nota3;
        double mediaFinal;
        int totalAlunos = 0;
        int aprovados = 0;
        int reprovados = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a matrícula do aluno (ou 9999 para finalizar): ");
            matricula = scan.nextInt();

            if (matricula == 9999) {
                break;
            }

            System.out.print("Digite a Nota 1: ");
            nota1 = scan.nextDouble();
            System.out.print("Digite a Nota 2: ");
            nota2 = scan.nextDouble();
            System.out.print("Digite a Nota 3: ");
            nota3 = scan.nextDouble();

            mediaFinal = (2 * nota1 + 3 * nota2 + 4 * nota3) / 9;

            totalAlunos++;

            if (mediaFinal >= 5) {
                System.out.println("Matrícula: " + matricula + ", Média Final: " + mediaFinal + ", APROVADO");
                aprovados++;
            } else {
                System.out.println("Matrícula: " + matricula + ", Média Final: " + mediaFinal + ", REPROVADO");
                reprovados++;
            }
        }

        System.out.println("\nTotal de alunos: " + totalAlunos);
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de reprovados: " + reprovados);
    }
}