public class Printer{

    public static void imprimirAluno(Aluno aluno){
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Situação: " + (aluno.situacaoBolsista ? "Bolsista" : "Regular"));
    }

    public static void printTurma(Turma turma) {
        System.out.println("A turma possui " + turma.quantidadeDeAlunosEmTurma + " alunos");

        for (Aluno aluno : turma.alunos) {
            imprimirAluno(aluno);
        }

        System.out.println("Alunos bolsistas: " + turma.totalBolsistas);
        System.out.println("Alunos regulares: " + turma.totalRegulares);
    }
}
