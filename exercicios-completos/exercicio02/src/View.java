public class View {
    public static Professor cadastrarProfessor(){

        String nome = Reader.lerString("Informe o nome do professor: ");
        String matricula = Reader.lerString("Informe a matrícula do professor: ");

        System.out.println("Escolha a titulação do professor:");
        Titulacao[] titulacoes = Titulacao.values();

        for (int i = 0; i < titulacoes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + titulacoes[i]);
        }

        int escolha = Reader.lerInt("Digite o número da titulação: ", "Escolha inválida. Tente novamente.", 1, titulacoes.length);
        Titulacao titulacaoEscolhida = titulacoes[escolha - 1];

        double salario = Reader.lerDouble("Informe o salário do professor: ");

        return new Professor(nome, matricula, titulacaoEscolhida.name(), salario);
    }

    public static void cadastrar(GerenciadorDePessoas gerenciadorDePessoas){
        boolean continuar = true;

        while(continuar){
            gerenciadorDePessoas.setProfessores(cadastrarProfessor());

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
