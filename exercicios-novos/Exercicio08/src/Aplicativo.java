public class Aplicativo {
    public static void main(String[] args) {
        Aluno aluno = Leitor.lerAluno();
        Printer.print(aluno);
    }
}
