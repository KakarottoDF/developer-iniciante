public class View{
    public static Funcionario cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(Reader.lerString());

        return funcionario;
    }
}
