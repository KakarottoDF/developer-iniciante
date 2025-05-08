public class View {
    public static Professor cadastrarProfessor(GerenciadorDePessoas gerenciadorDePessoas){

        String nome = Reader.lerString("Informe o nome do professor: ".toUpperCase());

        String matricula;
        do {
            matricula = Reader.lerString("Informe a matrícula do professor: ".toUpperCase());
            if(gerenciadorDePessoas.matriculaExiste(matricula)){
                System.out.println("A matrícula já foi cadastrada, digite outra.".toUpperCase());
            }
        } while(gerenciadorDePessoas.matriculaExiste(matricula));

        System.out.println("Escolha a titulação do professor:".toUpperCase());
        Titulacao[] titulacoes = Titulacao.values();

        for (int i = 0; i < titulacoes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + titulacoes[i]);
        }

        int escolha = Reader.lerInt("Digite o número da titulação: ".toUpperCase(), "Escolha inválida. Tente novamente.".toUpperCase(), 1, titulacoes.length);
        Titulacao titulacaoEscolhida = titulacoes[escolha - 1];

        double salario = Reader.lerDouble("Informe o salário do professor: ".toUpperCase());

        return new Professor(nome, matricula, titulacaoEscolhida, salario);
    }

    public static void cadastrar(GerenciadorDePessoas gerenciadorDePessoas){
        boolean continuar = true;

        while(continuar){
            gerenciadorDePessoas.setProfessores(cadastrarProfessor(gerenciadorDePessoas));

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro? [S]Sim [N]Não: ".toUpperCase(), "Digite somente [S]Sim [N]Não".toUpperCase(), "S", "N");
        }
    }
}
