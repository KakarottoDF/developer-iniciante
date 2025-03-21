import java.util.Scanner;

public class Turma{
    Aluno[] alunos;
    int quantidadeDeAlunosEmTurma;
    int totalBolsistas;
    int totalRegulares;

    public static Turma setTurma(int totalDeAlunos) {
        Turma turma = new Turma();
        turma.quantidadeDeAlunosEmTurma = totalDeAlunos;
        turma.alunos = new Aluno[totalDeAlunos];
        for(int i = 0; i < totalDeAlunos; i++){
            turma.alunos[i] = Aluno.setAluno();
        }
        return turma;
    }

    public static Turma setTurma(String msg){
        int qtdAlunos = Leitor.lerInt(msg);
        return setTurma(qtdAlunos);
    }
}
