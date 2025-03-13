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