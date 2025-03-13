public class Main {
    public static void main(String[] args) {
        Turma turma = Leitor.lerTurma("Informe quantos alunos tem a turma: ");

        Contador.contarAlunos(turma);

        Imprimir.printTurma(turma);

    }
}