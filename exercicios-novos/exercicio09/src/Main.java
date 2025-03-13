/*
SINTESE
    ENTRADA: nomeDoAluno, matriculaDoAluno, situacaoDoAluno, quantidadeDeAlunosNaSala
    PROCESSAMENTO: quantidadeDeAlunosRegulares, quantidadeDeAlunosBolsistas 
    SAIDA: nomeDoAluno, matriculaDoAluno, situacaoDoAluno, quantidadeDeAlunosRegulares, quantidadeDeAlunosBolsistas

Uma escola deseja fazer um cadastro dos seus alunos. Um aluno possui nome, matrícula e
situação, que pode ser regular ou bolsista. O usuário informará quantos alunos existem em uma turma. Você receberá os dados de todos os alunos e, na sequência, você deve
apresentar todos os alunos informados, a quantidade de alunos regulares que existe e a
quantidade de alunos bolsistas.
*/

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        turma.quantidadeDeAlunoEmTurma = Leitor.lerQuantidade();

        Aluno alunos = new Aluno();

        Inicializador.iniciarArrays(alunos, turma);

        Leitor.lerAluno(alunos, turma.quantidadeDeAlunoEmTurma);

        ImprimirAlunos.imprimirAluno(alunos, turma);
        Contador.contarAlunos(alunos, turma);
    }
}