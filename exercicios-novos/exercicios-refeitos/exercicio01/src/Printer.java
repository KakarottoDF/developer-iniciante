public class Printer{
    public static void situacaoAluno(Aluno aluno){
        if(ServiceAluno.mediaAluno(aluno.nota1, aluno.nota2) > 6){
            System.out.println("Aluno(a) aprovado!");
        }else{
            System.out.println("Aluno(a) reprovado!");
        }
    }

    public static void printarMedia(Aluno aluno){
        System.out.println("A média do aluno " + aluno.nome + " foi: " + ServiceAluno.mediaAluno(aluno.nota1,aluno.nota2));
    }
}
