public class Main {
    public static void main(String[] args) {
        boolean escolha;
        int opcao;
        Governo governo = new Governo();

        do {
            Printer.menu();

            opcao = Reader.lerInt("Escolha uma das opções: ", "Escolha somente um número entre 1 a 8", 1, 8);

            switch (opcao) {
                case 1:
                    View.cadastrarTerroristaSuicida(governo);
                    break;
                case 2:
                    View.cadastrarTerroristaNaoSuicida(governo);
                    break;
                case 3:
                    Printer.imprimirListaTodosTerroristas(governo);
                    break;
                case 4:
                    Printer.imprimirListaGrauPericulosidade(governo);
                    break;
                case 5:
                    Printer.imprimirTerroristasComNomeEspecifico(governo);
                    break;
                case 6:
                    Printer.imprimirQuantidadeTerroristasComExplosivos(governo);
                    break;
                case 7:
                    Printer.imprimirPercentualNaoArabes(governo);
                    break;
                case 8:
                    escolha = true;
                    continue;
                default:
                    System.out.println("ERRO INESPERADO");
                    break;
            }

            escolha = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ", "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        }while(!escolha);
    }
}