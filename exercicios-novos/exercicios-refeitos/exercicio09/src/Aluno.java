import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    boolean situacaoBolsista;


    public static Aluno setAluno() {
        Aluno aluno = new Aluno();

        aluno.nome = Leitor.lerString("Informe o nome do aluno: ");
        aluno.matricula = Leitor.lerString("Informe a matrícula do aluno: ");
        aluno.situacaoBolsista = Aluno.lerSituacao("O aluno é Bolsista? [S]Sim [N]Não: ");

        return aluno;
    }

    public static boolean lerSituacao(String msg){
        System.out.print(msg);
        return lerSituacao();
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
}

