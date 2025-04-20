public class View{
    public static Pessoa cadastrarPessoa(){
        return new Pessoa(
                Reader.lerString("Informe o nome dessa pessoa: "),
                Reader.lerInt("Informe o código dessa pessoa: "),
                Reader.lerDouble("Informe a renda mensal dessa pessoa: R$ ")
        );
    }
}
