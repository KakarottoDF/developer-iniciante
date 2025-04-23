public class View{
    public static Pessoa cadastrarPessoa(/*UsuarioSistema usuarioSistema*/) {
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

    public static void cadastrar(UsuarioSistema usuarioSistema){
        boolean continuar = true;

        usuarioSistema.setNome(Reader.lerString("Informe o nome da Família: "));

        while(continuar){
            usuarioSistema.adicionar(cadastrarPessoa(/*cadastro*/));

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
