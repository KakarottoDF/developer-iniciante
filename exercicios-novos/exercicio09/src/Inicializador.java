public class Inicializador{
    public static void iniciarArrays(Aluno alunos, Turma turma){
        alunos.nome = new String[turma.quantidadeDeAlunoEmTurma];
        alunos.matricula = new String[turma.quantidadeDeAlunoEmTurma];
        alunos.situacaoRegular = new boolean[turma.quantidadeDeAlunoEmTurma];
        alunos.situacaoBolsista = new boolean[turma.quantidadeDeAlunoEmTurma];
    }
}
