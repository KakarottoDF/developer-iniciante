public class View {
    public static Suicida cadastrarTerroristaSuicida(){

        return new Suicida(
                Reader.lerString("DIGITE O NOME DESTE TERRORISTA: "),
                Reader.lerInt("INFORME A QUANTIDADE DE EXPLOSIVOS: "),
                Reader.lerBoolean("O TERRORISTA SEGUE O ISLAMISMO? [S]SIM [N]NÃO", "DIGITE SOMENTE [S]SIM OU [N]NÃO", "S", "N")
        );
    }

    public static void alimentaArrayTerroristaSuicida(Governo governo){

        boolean continuar = true;

        while(continuar){
            governo.adicionar(cadastrarTerroristaSuicida());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }
}
