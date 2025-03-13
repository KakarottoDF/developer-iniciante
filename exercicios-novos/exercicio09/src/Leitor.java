import java.util.Scanner;

public class Leitor{
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static Turma lerTurma(int totalDeAlunos) {
        Turma turma = new Turma();
        turma.quantidadeDeAlunoEmTurma = totalDeAlunos;
        turma.alunos = new Aluno[totalDeAlunos];
        for(int i = 0; i < totalDeAlunos; i++){
            turma.alunos[i] = lerAluno();
        }
        return turma;
    }

    public static Turma lerTurma(String msg){
        int qtdAlunos = lerInt(msg);
        return lerTurma(qtdAlunos);
    }

    public static Aluno lerAluno() {
        Aluno aluno = new Aluno();

        aluno.nome = lerString("Informe o nome do aluno: ");
        aluno.matricula = lerString("Informe a matrícula do aluno: ");
        aluno.situacaoBolsista = lerSituacao("O aluno é Bolsista? ");

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