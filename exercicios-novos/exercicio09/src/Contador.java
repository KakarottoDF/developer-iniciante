public class Contador{

    public static void contarAlunos(Turma turma){

        for (int i = 0; i < turma.quantidadeDeAlunoEmTurma; i++) {
            if (turma.alunos[i].situacaoBolsista) {
                turma.totalBolsistas++;
            }else{
                turma.totalRegulares++;
            }
        }
    }

}
