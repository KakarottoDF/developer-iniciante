import java.util.Scanner;

public class Aluno {
    int quantidadeDeAlunosNaSala;
    String []nomeDoAluno;// = new String[quantidadeDeAlunosNaSala];
    String []matriculaDoAluno;// = new String[quantidadeDeAlunosNaSala];
    String []situacaoDoAluno;// = new String[quantidadeDeAlunosNaSala];
    int quantidadeDeAlunosRegulares;
    int quantidadeDeAlunosBolsistas;

    public static int lerQuantidadeDeAlunosNaSala() {
        return new Scanner(System.in).nextInt();
    }

    public static int lerQuantidadeDeAlunosNaSala(String msg) {
        System.out.print(msg);
        return lerQuantidadeDeAlunosNaSala();
    }

    public static String lerDadoDoAluno() {
        return new Scanner(System.in).nextLine();
    }

    public static String lerDadoDoAluno(String msg) {
        System.out.print(msg);
        return lerDadoDoAluno();
    }
}

