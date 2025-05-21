public class View {

    private static final String NACIONALIDADE = "ARÁBIA";
    private static final String RELIGIAO = "ISLAMISMO";

    public static Suicida alimentaArrayTerroristaSuicida(){

        String nome = Reader.lerString("DIGITE O NOME DESTE TERRORISTA: ");
        int qtdExplosivos = Reader.lerInt("INFORME A QUANTIDADE DE EXPLOSIVOS: ");

        String religiao;

        boolean validarReligiao = Reader.lerBoolean("O TERRORISTA PERTENCE A RELIGIÃO DO " + RELIGIAO + "? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM OU [N]NÃO: ", "S", "N");

        if(validarReligiao){
            religiao = RELIGIAO;
        }else{
            religiao = Reader.lerString("INFORME A RELIGIÃO DESSE TERRORISTA: ");
        }

        return new Suicida(
                nome,
                qtdExplosivos,
                religiao
        );
    }

    public static void cadastrarTerroristaSuicida(Governo governo){

        boolean continuar = true;

        while(continuar){
            governo.adicionar(alimentaArrayTerroristaSuicida());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO: ", "S", "N");
        }
    }

    public static NaoSuicida alimentaArrayTerroristaNaoSuicida(){

        String nome = Reader.lerString("DIGITE O NOME DESTE TERRORISTA: ");
        int qtdExplosivos = Reader.lerInt("INFORME A QUANTIDADE DE EXPLOSIVOS: ");

        String paisOrigem;

        boolean validarPais = Reader.lerBoolean("O TERRORISTA NASCEU NA " + NACIONALIDADE + "? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM OU [N]NÃO: ", "S", "N");

        if(validarPais){
            paisOrigem = NACIONALIDADE;
        }else{
            paisOrigem = Reader.lerString("INFORME O PAÍS DE ORIGEM DESSE TERRORISTA: ");
        }

        return new NaoSuicida(
                nome,
                qtdExplosivos,
                paisOrigem
        );
    }

    public static void cadastrarTerroristaNaoSuicida(Governo governo){

        boolean continuar = true;

        while(continuar){
            governo.adicionar(alimentaArrayTerroristaNaoSuicida());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO: ", "S", "N");
        }
    }
}
