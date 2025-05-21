public class View {
    public static Suicida alimentaArrayTerroristaSuicida(){

        return new Suicida(
                Reader.lerString("DIGITE O NOME DESTE TERRORISTA: "),
                Reader.lerInt("INFORME A QUANTIDADE DE EXPLOSIVOS: "),
                Reader.lerBoolean("O TERRORISTA SEGUE O ISLAMISMO? [S]SIM [N]NÃO", "DIGITE SOMENTE [S]SIM OU [N]NÃO", "S", "N")
        );
    }

    public static void cadastrarTerroristaSuicida(Governo governo){

        boolean continuar = true;

        while(continuar){
            governo.adicionar(alimentaArrayTerroristaSuicida());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static NaoSuicida alimentaArrayTerroristaNaoSuicida(){

        return new NaoSuicida(
                Reader.lerString("DIGITE O NOME DESTE TERRORISTA: "),
                Reader.lerInt("INFORME A QUANTIDADE DE EXPLOSIVOS: "),
                Reader.lerString("INFORME O PAÍS DE ORIGEM DESSE TERRORISTA: ")
        );
    }

    public static void cadastrarTerroristaNaoSuicida(Governo governo){

        boolean continuar = true;

        while(continuar){
            governo.adicionar(alimentaArrayTerroristaNaoSuicida());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }
}
