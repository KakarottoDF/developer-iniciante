import javax.management.ObjectInstance;

public class View{
    public static void cadastrar(Universidade universidade) {
        boolean continuar = true;

        universidade.setNome(Reader.lerString("Informe o nome desta Universidade: "));

        while (continuar) {
            int escolha = Reader.lerInt(
                    "Esse funcionário é Diretor ou é Professor? [1]Diretor [2]Professor: ",
                    "Escolha somente: [1]Diretor ou [2]Professor: ",
                    1, 2
            );

            if (escolha == 1) {
                Administrativo administrativo = new Administrativo();

                administrativo.setNome(Reader.lerString("Informe o nome do Diretor: "));
                administrativo.setCpf(Reader.lerString("Informe o CPF do Diretor: "));
                administrativo.setSalario(Reader.lerDouble("Informe o salário do Diretor: R$ "));
                administrativo.setDependentes(Reader.lerInt("Informe a quantidade de dependentes do Diretor: "));

                universidade.adicionarFuncionario(administrativo);
            } else {
                Professor professor = new Professor();

                professor.setNome(Reader.lerString("Informe o nome do Professor: "));
                professor.setCpf(Reader.lerString("Informe o CPF do Professor: "));
                professor.setSalario(Reader.lerDouble("Informe o salário do Professor: R$ "));
                professor.setTitulacao(Reader.lerString("Informe a titulação do Professor: "));

                universidade.adicionarFuncionario(professor);
            }

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim ou [N]Não", "S", "N");
        }
    }
}
