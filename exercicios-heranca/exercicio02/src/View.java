public class View{
    public static Funcionario cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(Reader.lerString("Informe o nome do funcionário: "));

        return funcionario;
    }

    public static Professor cadastrarProfessor(){
        Professor professor = new Professor();

        professor.setCpf(Reader.lerString(""));

        return professor;
    }

    public static Administrativo cadastrarAdministrativo(){
        Administrativo administrativo = new Administrativo();

        administrativo.setDependentes(Reader.lerInt());

        return administrativo;
    }

    public static void cadastrar(Universidade universidade){
        boolean continuar = true;

        universidade.setNome(Reader.lerString("Informe o nome desta Universidade: "));

        while(continuar){
            Funcionario funcionario = cadastrarFuncionario();
            Professor professor = cadastrarProfessor();
            Administrativo administrativo = cadastrarAdministrativo();
            universidade.adicionar(funcionario, professor, administrativo);

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
