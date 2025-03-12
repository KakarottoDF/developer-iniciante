import java.util.Scanner;

public class Leitor{
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }

    public static boolean lerSituacao(){
        String resposta;
        while(true) {
            resposta = new Scanner(System.in).nextLine().trim().toUpperCase();
            if (resposta.equals("S")) {
                return true;
            } else if (resposta.equals("N")) {
                return false;
            } else {
                System.out.print("Entrada inválida. Por favor, digite 'S' para Sim ou 'N' para Não: ");
            }
        }
    }

    public static boolean lerSituacao(String msg){
        System.out.print(msg);
        return lerSituacao();
    }

    public static Aluno lerAluno(){
        Aluno aluno = new Aluno();

        aluno.nome = lerString("Informe o nome do aluno: ");
        aluno.matricula = lerString("Informe a matrícula do aluno: ");
        aluno.situacaoRegular = lerSituacao("O aluno é Regular? ");
        aluno.situacaoBolsista = lerSituacao("O aluno é Bolsista? ");
        return aluno;
    }
}
