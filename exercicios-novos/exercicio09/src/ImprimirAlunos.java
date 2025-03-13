public class ImprimirAlunos{
    public static void imprimirAluno(Aluno aluno, Turma turma){

        for (int i = 0; i < turma.quantidadeDeAlunoEmTurma; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + aluno.nome[i]);
            System.out.println("Matrícula: " + aluno.matricula[i]);
            System.out.println("Regular: " + (aluno.situacaoRegular[i] ? "Sim" : "Não"));
            System.out.println("Bolsista: " + (aluno.situacaoBolsista[i] ? "Sim" : "Não"));
        }
    }
}
