import java.util.Scanner;

public class Leitor {
    public static double lerDouble(){//DELEGATE
        return new Scanner(System.in).nextDouble();
    }
    public static double lerDouble(String msg){// assinatura do método
        System.out.println(msg);
        return lerDouble();
    }
    public static double lerDouble(String msg, String msgError, double min, double max){
        double valor;
        do{
            valor = lerDouble(msg);
            if(valor < min || valor > max){
                System.out.println(msgError);
            }
        }while (valor < min || valor > max);
        return valor;
    }
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }
    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
    public static Aluno lerAluno() {
        Aluno aluno = new Aluno();
        aluno.nome = lerString("Informe o nome do aluno: ");
        aluno.notaUm = lerDouble("Informe a nota um: ", "Ops! nota informada inválida", 0, 10);
        aluno.notaDois = lerDouble("Informe a nota dois: ", "Ops! nota informada inválida", 0, 10);
        aluno.media = ServiceAluno.media(aluno);
        aluno.isAprovado = ServiceAluno.isAprovado(aluno);
        return aluno;
    }


}
