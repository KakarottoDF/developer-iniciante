//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean escolha;
        int opcao;
        SistemaDeArquivos sistemaDeArquivos = new SistemaDeArquivos();

        do {
            Printer.menu();
            opcao = Reader.lerInt("ESCOLHA UMA DAS OPÇÕES: ", "DIGITE SOMENTE UM NÚMERO ENTRE 1 A 7", 1, 7);

            switch(opcao) {
                case 1:
                    View.alimentarArrayDotNet(sistemaDeArquivos);
                    break;
                case 2:
                    View.alimentarArrayC(sistemaDeArquivos);
                    break;
                case 3:
                    Printer.imprimirArquivosOrdenadosPorTempoDeCompilacao(sistemaDeArquivos);
                    break;
                case 4:
                    Printer.imprimirArquivoComMaiorTempoDeCompilacao(sistemaDeArquivos);
                    break;
                case 5:
                    Printer.imprimirArquivosComLinhasCondicionais(sistemaDeArquivos);
                    break;
                case 6:
                    Printer.imprimirArquivosComTermo(sistemaDeArquivos);
                    break;
                case 7:
                    escolha = true;
                    continue;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }

            escolha = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ", "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        } while (!escolha);
    }
}