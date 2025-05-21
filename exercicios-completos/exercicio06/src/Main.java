public class Main {
    public static void main(String[] args) {
        boolean escolha;
        int opcao;
        Governo governo = new Governo();

        do {
            Printer.menu();

            opcao = Reader.lerInt("Escolha uma das opções: ", "Escolha somente um número entre 1 a 4", 1, 4);

            switch (opcao) {
                case 1:
                    View.cadastrarTerroristaSuicida(governo);
                    break;
                case 2:
                    View.cadastrarTerroristaNaoSuicida(governo);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERRO INESPERADO");
                    break;
            }

            escolha = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ", "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        }while(!escolha);
    }
}