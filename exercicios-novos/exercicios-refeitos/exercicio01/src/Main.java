public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = Leitor.lerString("Digite o nome do aluno: ");
        aluno.nota1 = Leitor.lerDouble("Digite a primeira nota do aluno: ", "A nota tem que ser entre 0 e 10", 0, 10);
        aluno.nota2 = Leitor.lerDouble("Digite a segunda nota do aluno: ", "A nota tem que ser entre 0 e 10", 0, 10);
        Printer.printarMedia(aluno);
        Printer.situacaoAluno(aluno);


    }
}