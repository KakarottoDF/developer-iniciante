public class View{
    private static Diretor cadastrarDiretor() {

        String nome = Reader.lerString("Informe o nome do Diretor: ");
        String cpf = Reader.lerString("Informe o CPF do Diretor: ");
        double salario = Reader.lerDouble("Informe o salário do Diretor: R$ ");
        int dependentes = Reader.lerInt("Informe a quantidade de dependentes do Diretor: ");

        return new Diretor(nome, cpf, salario, dependentes);
    }

    private static Professor cadastrarProfessor() {
        String nome = Reader.lerString("Informe o nome do Professor: ");
        String cpf = Reader.lerString("Informe o CPF do Professor: ");
        double salario = Reader.lerDouble("Informe o salário do Professor: R$ ");
        String titulacao = Reader.lerString("Informe a titulação do Professor: ");

        Professor professor = new Professor(nome, cpf, salario, titulacao);

        return professor;
    }

    public static void cadastroGeral(Escola escola) {
        boolean continuar = true;

        escola.setNome(Reader.lerString("Informe o nome desta Universidade: "));

        while (continuar) {
            int escolha = Reader.lerInt(
                    "Esse funcionário é Diretor ou é Professor? [1]Diretor [2]Professor: ",
                    "Escolha somente: [1]Diretor ou [2]Professor: ",
                    1, 2
            );

            Funcionario funcionario = (escolha == 1) ? cadastrarDiretor() : cadastrarProfessor();
            escola.adicionarFuncionario(funcionario);

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim ou [N]Não", "S", "N");
        }
    }

}
