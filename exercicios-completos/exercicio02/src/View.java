public class View {
    public static Professor cadastrarProfessor(GerenciadorDePessoas gerenciadorDePessoas){

        String nome = Reader.lerString("INFORME O NOME DO PROFESSOR: ");

        String matricula;
        do {
            matricula = Reader.lerString("INFORME A MATRÍCULA DO PROFESSOR: ");
            if(gerenciadorDePessoas.matriculaExiste(matricula)){
                System.out.println("A MATRÍCULA JÁ FOI CADASTRADA, DIGITE OUTRA.");
            }
        } while(gerenciadorDePessoas.matriculaExiste(matricula));

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

    public static void cadastrar(GerenciadorDePessoas gerenciadorDePessoas){
        boolean continuar = true;

        while(continuar){
            gerenciadorDePessoas.setProfessores(cadastrarProfessor(gerenciadorDePessoas));

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }
}
