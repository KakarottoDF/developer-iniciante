public class View {
    public static Professor cadastrarProfessor(GerenciadorDePessoas gerenciadorDePessoas) {
        String nome = Reader.lerString("INFORME O NOME DO PROFESSOR: ");

        String matricula;
        do {
            matricula = Reader.lerString("INFORME A MATRÍCULA DO PROFESSOR: ");
            if (gerenciadorDePessoas.matriculaExiste(matricula)) {
                System.out.println("A MATRÍCULA JÁ FOI CADASTRADA, DIGITE OUTRA.");
            }
        } while (gerenciadorDePessoas.matriculaExiste(matricula));

        System.out.println("ESCOLHA A TITULAÇÃO DO PROFESSOR:");
        Titulacao[] titulacoes = Titulacao.values();

        for (int i = 0; i < titulacoes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + titulacoes[i]);
        }

        int escolha = Reader.lerInt("DIGITE O NÚMERO DA TITULAÇÃO: ", "ESCOLHA INVÁLIDA. TENTE NOVAMENTE.", 1, titulacoes.length);
        Titulacao titulacaoEscolhida = titulacoes[escolha - 1];

        double salario = Reader.lerDouble("INFORME O SALÁRIO DO PROFESSOR: ");

        return new Professor(nome, matricula, titulacaoEscolhida, salario);
    }

    public static Aluno cadastrarAluno(GerenciadorDePessoas gerenciador) {
        String nome = Reader.lerString("NOME DO ALUNO: ");

        String matricula;
        do {
            matricula = Reader.lerString("MATRÍCULA DO ALUNO: ");
            if (gerenciador.matriculaExiste(matricula)) {
                System.out.println("MATRÍCULA JÁ CADASTRADA.");
            }
        } while (gerenciador.matriculaExiste(matricula));

        String curso = Reader.lerString("CURSO DO ALUNO: ");
        int periodo = Reader.lerInt("PERÍODO ATUAL DO ALUNO: ");

        return new Aluno(nome, matricula, curso, periodo);
    }

    public static void cadastrarProfessores(GerenciadorDePessoas gerenciadorDePessoas){
        boolean continuar = true;
        while (continuar) {
            Professor novoProfessor = cadastrarProfessor(gerenciadorDePessoas);
            gerenciadorDePessoas.adicionarPessoa(novoProfessor);

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void cadastrarAlunos(GerenciadorDePessoas gerenciador) {
        boolean continuar = true;
        while (continuar) {
            gerenciador.adicionarPessoa(cadastrarAluno(gerenciador));
            continuar = Reader.lerBoolean("DESEJA CADASTRAR MAIS ALUNOS? [S/N]: ", "SOMENTE [S] ou [N]", "S", "N");
        }
    }
}
