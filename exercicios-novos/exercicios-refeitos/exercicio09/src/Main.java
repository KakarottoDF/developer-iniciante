public class Main {
    public static void main(String[] args) {
        Turma turma = Turma.setTurma("Informe quantos alunos tem a turma: ");

        Contador.contarAlunos(turma);

        Printer.printTurma(turma);
    }
}