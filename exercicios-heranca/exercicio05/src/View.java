public class View{
    public static Pessoa cadastrarPessoa(Familia familia) {
        /*int codigo;
        do {
            codigo = Reader.lerInt("Informe o código dessa pessoa: ");
            if (familia.codigoExiste(codigo)) {
                System.out.println("Código já existe, digite outro.");
            }
        } while (familia.codigoExiste(codigo));*/

        return new Pessoa(
                Reader.lerString("Informe o nome dessa pessoa: "),
                /*codigo*/Reader.lerInt("Informe o código dessa pessoa: "),
                Reader.lerDouble("Informe a renda mensal dessa pessoa: R$ ")
        );
    }

    public static void cadastrar(Familia familia){
        boolean continuar = true;

        familia.setNome(Reader.lerString("Informe o nome da Família: "));

        while(continuar){
            familia.adicionar(cadastrarPessoa(familia));

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
