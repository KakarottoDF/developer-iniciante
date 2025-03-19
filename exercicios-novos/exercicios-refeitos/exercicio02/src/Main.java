public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        do {
            aluno.nome = Leitor.lerString("Digite o nome do aluno: ");
            aluno.nota1 = Leitor.lerDouble("Digite a primeira nota do aluno: ", "A nota tem que ser entre 0 e 10", 0, 10);
            aluno.nota2 = Leitor.lerDouble("Digite a segunda nota do aluno: ", "A nota tem que ser entre 0 e 10", 0, 10);
            Printer.printarMedia(aluno);
            Printer.situacaoAluno(aluno);
        }while(ServiceAluno.validarPrograma(Leitor.lerString("Deseja continuar com o programa? [S]Sim [N]Não: ", "Digitou algo inválido.").toUpperCase()));

    }
}