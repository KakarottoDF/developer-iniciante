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

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static int lerQuantidade() {
        return lerInt("Quantos alunos existem na sala de aula? ");
    }

    public static void lerAluno(Aluno aluno, int quantidadeDeAlunoEmTurma) {

        for (int i = 0; i < quantidadeDeAlunoEmTurma; i++) {
            aluno.nome[i] = lerString("Informe o nome do aluno: ");
            aluno.matricula[i] = lerString("Informe a matrícula do aluno: ");
            aluno.situacaoRegular[i] = lerSituacao("O aluno é Regular? ");
            aluno.situacaoBolsista[i] = lerSituacao("O aluno é Bolsista? ");
        }
    }
}
