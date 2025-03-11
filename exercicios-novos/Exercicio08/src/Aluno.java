import java.util.Scanner;

public class Aluno{
    final int QUANTIDADE_DE_NOTAS = 2;
    String nome;
    double []notas = new double[QUANTIDADE_DE_NOTAS];

    public static double lerNotas(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerNotas(String msg){
        System.out.print(msg);
        return lerNotas();
    }

    public static String lerNome(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerNome(String msg){
        System.out.print(msg);
        return lerNome();
    }

    public static String mediaDoAluno(Aluno aluno){
        double totalNotas = 0;
        double mediaFinal;

        for(int i = 0; i < aluno.QUANTIDADE_DE_NOTAS; i++){
            totalNotas += aluno.notas[i];
        }

        mediaFinal = totalNotas / aluno.QUANTIDADE_DE_NOTAS;

        if(mediaFinal >= 6){
            System.out.println("A média final desse aluno foi " + mediaFinal);
            return "Aluno Aprovado";
        }else{
            System.out.println("A média final desse aluno foi " + mediaFinal);
            return "Aluno Reprovado";
        }
    }
}
