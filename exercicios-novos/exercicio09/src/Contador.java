public class Contador{

    public static void contarAlunos(Aluno alunos, Turma turma){

        int regulares = 0;
        int bolsistas = 0;

        for (int i = 0; i < turma.quantidadeDeAlunoEmTurma; i++) {
            if (alunos.situacaoRegular[i]) {
                regulares++;
            }
            if (alunos.situacaoBolsista[i]) {
                bolsistas++;
            }
        }
        System.out.println("Quantidade de alunos regulares: " + regulares);
        System.out.println("Quantidade de alunos bolsistas: " + bolsistas);
    }

}
