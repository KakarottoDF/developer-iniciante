/*
SINTESE
  ENTRADA: nome, primeiraNota, segundaNota
  PROCESSAMENTO: media
  SAIDA: nome, primeiraNota, segundaNota, media, Aprovado ou Reprovado
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String validarPrograma = "S";
        Aluno aluno = new Aluno();

        do {
            aluno.nome = inserirNomeAluno("Insira o nome do aluno: ");
            do {
                aluno.primeiraNota = coletarNotasAluno("Digite a primeira nota do aluno: ");
                if(aluno.primeiraNota > 10 || aluno.primeiraNota <0){
                    System.out.println("A nota tem que ser entre 0 e 10. Digite novamente.");
                }
            }while(aluno.primeiraNota < 0 || aluno.primeiraNota > 10);

            do {
            aluno.segundaNota = coletarNotasAluno("Digite a segunda nota do aluno: ");
                if(aluno.segundaNota > 10 || aluno.segundaNota <0){
                    System.out.println("A nota tem que ser entre 0 e 10. Digite novamente.");
                }
            }while(aluno.segundaNota < 0 || aluno.segundaNota > 10);

            System.out.println("ALUNO(A): " + aluno.nome);
            System.out.println("PRIMEIRA NOTA: " + aluno.primeiraNota);
            System.out.println("SEGUNDA NOTA: " + aluno.segundaNota);
            System.out.println("A média do(a) aluno(a) " + aluno.nome + " é " + calcularMedia(aluno.primeiraNota, aluno.segundaNota));

            System.out.println(resultadoMedia(calcularMedia(aluno.primeiraNota, aluno.segundaNota)));

        }while(validarSistema(validarPrograma));
    }

    public static boolean validarSistema(String flag){
        System.out.print("Deseja continuar a usar o programa? [S]Sim [N]Não: ");
        flag = new Scanner(System.in).nextLine().toUpperCase();

        if(flag.equals("S")){
            return true;
        }else{
            if(flag.equals("N")){
                return false;
            }else{
                System.out.print("Digitou algo diferente de [S]Sim [N]Não. O programa será encerrado.");
                return false;
            }
        }
    }

    public static double calcularMedia(double nota1, double nota2){
        double media = 0;

        media = (nota1 + nota2) / 2;

        return media;
    }

    public static String resultadoMedia(double media){
        if(media >=6){
            return "Aluno Aprovado!";
        }else{
            return "Aluno Reprovado!";
        }
    }

    public static String inserirNomeAluno(){
        return new Scanner(System.in).nextLine();
    }

    public static String inserirNomeAluno(String msg){
        System.out.print(msg);
        return inserirNomeAluno();
    }

    public static double coletarNotasAluno(){
        return new Scanner(System.in).nextDouble();
    }

    public static double coletarNotasAluno(String msg){
        System.out.print(msg);
        return coletarNotasAluno();
    }
}

class Aluno{
    String nome;
    double primeiraNota;
    double segundaNota;
}