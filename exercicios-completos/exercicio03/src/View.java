public class View{
    public static Administrativo cadastrarAdministrativo(){
        return new Administrativo(
                Reader.lerString("Informe o nome do responsável: "),
                Reader.lerString("Informe o número do telefone do responsável: "),
                Reader.lerBoolean("Esse sistema é Full Time? [S]SIm [N]Não: ", "Digite somente [S]Sim ou [N]Não: ", "S", "N"),
                Reader.lerString("Informe o nome desse sistema: "),
                Reader.lerInt("Informe a quantidade de usuários simultâneos neste sistema: ")
        );
    }

    public static void cadastrar(Sistema sistema){
        boolean continuar = true;

        while(continuar){
            sistema.setAdministrativos(cadastrarAdministrativo());

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro de Sistema Administrativo? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
