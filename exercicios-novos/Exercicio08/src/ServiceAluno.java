public class ServiceAluno {
    public static final double MEDIA_APROVACAO = 7;
    public static double media(Aluno aluno){
        return ((aluno.notaUm + aluno.notaDois) / 2);
    }
    public static boolean isAprovado(Aluno aluno){
        return media(aluno) > MEDIA_APROVACAO;
    }
    public static double mensalidade(Aluno aluno){
        return 0;
    }
    public static double bolsa(Aluno aluno){
        return 0;
    }
    public static int faltas (Aluno aluno){
        return 0;
    }
}
