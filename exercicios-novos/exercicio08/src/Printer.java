public class Printer {
    public static void print(Aluno aluno){
        System.out.println(aluno.nome);
        System.out.println(aluno.notaUm);
        System.out.println(aluno.notaDois);
        System.out.println(aluno.media);
        System.out.println(aluno.isAprovado ? "Aprovado" : "Reprovado");
    }
}
