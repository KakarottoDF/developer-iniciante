public class Main {
    public static void main(String[] args) {
        GerenciarPlacas gerenciarPlacas = new GerenciarPlacas();
        Reader reader = new Reader();
        String resposta;
        int escolha;
        boolean continuar = true;

        do {
            escolha = GerenciarPlacas.menu();

            switch (escolha) {
                case 1:
                    reader.preencherPlacas(gerenciarPlacas);
                    break;
                case 2:
                    Printer.imprimirPlacas(gerenciarPlacas);
                    break;
                case 3:
                    Printer.impimirCustoTotal(gerenciarPlacas);
                    break;
                case 4:
                    Printer.imprimirPlacasComMLP(gerenciarPlacas);
                    break;
                case 5:
                    Printer.impimirCustoPlacasSemMLP(gerenciarPlacas);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente. ");
            }

            resposta = Reader.lerString("\nDeseja fazer outra operação? [S]Sim [N]Não", "Digite[S]Sim [N]Não", "S", "N");

            if (resposta.equals("N")) {
                continuar = false;
            }

        } while (continuar);
    }
}