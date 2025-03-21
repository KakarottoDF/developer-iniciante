public class Contador {
    public static void contarAlunos(Turma turma){

        for (int i = 0; i < turma.quantidadeDeAlunosEmTurma; i++) {
            if (turma.alunos[i].situacaoBolsista) {
                turma.totalBolsistas++;
            }else{
                turma.totalRegulares++;
            }
        }
    }
}
