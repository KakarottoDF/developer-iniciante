public class View{
    public static Funcionario cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(Reader.lerString("Informe o nome do funcionário: "));
        funcionario.setCpf(Reader.lerString("Informe o CPF do funcionário: "));
        funcionario.setSalario(Reader.lerDouble("Informe o salário do funcionário: R$ "));

        return funcionario;
    }

    public static Professor cadastrarProfessor(){
        Professor professor = new Professor();

        professor.setTitulacao(Reader.lerString("Informe a titulação do professor " + professor.getNome() + ": "));

        return professor;
    }

    public static Administrativo cadastrarAdministrativo(){
        Administrativo administrativo = new Administrativo();

        administrativo.setDependentes(Reader.lerInt("Informe a quantidade de dependentes do Diretor " + administrativo.getNome() + ": "));

        return administrativo;
    }

    public static void cadastrar(Universidade universidade){
        boolean continuar = true;
        int escolha;

        universidade.setNome(Reader.lerString("Informe o nome desta Universidade: "));

        while(continuar) {
            Funcionario funcionario = cadastrarFuncionario();

            escolha = Reader.lerInt("Esse funcionário é Diretor ou é Professor? [1]Diretor [2]Professor", "Escolha somente: [1]Diretor ou [2]Professor", 1, 2);

            if (escolha == 1) {
                Administrativo administrativo = cadastrarAdministrativo();
                universidade.adicionar(funcionario, administrativo);
            } else {
                Professor professor = cadastrarProfessor();
                universidade.adicionar(funcionario, professor);
                {

                    continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
                }
            }
        }
    }
}
