public class View{
    private static Diretor cadastrarDiretor() {
        Diretor diretor = new Diretor();

        diretor.setNome(Reader.lerString("Informe o nome do Diretor: "));
        diretor.setCpf(Reader.lerString("Informe o CPF do Diretor: "));
        diretor.setSalario(Reader.lerDouble("Informe o salário do Diretor: R$ "));
        diretor.setDependentes(Reader.lerInt("Informe a quantidade de dependentes do Diretor: "));

        return diretor;
    }

    private static Professor cadastrarProfessor() {
        Professor professor = new Professor();

        professor.setNome(Reader.lerString("Informe o nome do Professor: "));
        professor.setCpf(Reader.lerString("Informe o CPF do Professor: "));
        professor.setSalario(Reader.lerDouble("Informe o salário do Professor: R$ "));
        professor.setTitulacao(Reader.lerString("Informe a titulação do Professor: "));

        return professor;
    }

    public static void cadastrar(Universidade universidade) {
        boolean continuar = true;

        universidade.setNome(Reader.lerString("Informe o nome desta Universidade: "));

        while (continuar) {
            int escolha = Reader.lerInt(
                    "Esse funcionário é Diretor ou é Professor? [1]Diretor [2]Professor: ",
                    "Escolha somente: [1]Diretor ou [2]Professor: ",
                    1, 2
            );

            Funcionario funcionario = (escolha == 1) ? cadastrarDiretor() : cadastrarProfessor();
            universidade.adicionarFuncionario(funcionario);

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim ou [N]Não", "S", "N");
        }
    }

}
