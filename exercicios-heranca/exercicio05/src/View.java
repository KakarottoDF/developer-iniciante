public class View{
    public static Pessoa cadastrarPessoa(){
        return new Pessoa(
                Reader.lerString("Informe o nome dessa pessoa: "),
                Reader.lerInt("Informe o código dessa pessoa: "),
                Reader.lerDouble("Informe1 a renda mensal dessa pessoa: R$ ")
        );
    }

    public static void cadastrar(Familia familia){
        boolean continuar = true;

        familia.setNome(Reader.lerString("Informe o nome da Família: "));

        while(continuar){
            familia.adicionar(cadastrarPessoa());

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
