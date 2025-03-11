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
}
