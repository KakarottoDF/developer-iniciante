public class Main {
    public static void main(String[] args) {
        boolean escolha;
        int opcao;

        do {
            opcao = Reader.lerInt("""
        ESCOLHA UMA DAS OPÇÕES:
        [1] Cadastrar arquivos DotNet
        [2] Cadastrar arquivos C
        [3] Listar arquivos ordenados por tempo de compilação (decrescente)
        [4] Arquivo com maior tempo de compilação
        [5] Arquivos com 1000 a 7000 linhas
        [6] Arquivos com o termo "PROVA2" no nome
        [7] Sair
        [8] Resetar o Sistema
        """, "DIGITE SOMENTE UM NÚMERO ENTRE 1 A 7", 1, 7);

            switch (opcao) {
                case 1:
                    View.cadastrarDotNet();
                    break;
                case 2:
                    View.cadastrarLinguagemC();
                    break;
                case 3:
                    Printer.imprimirTodosOsSistemas();
                    Printer.imprimirArquivosOrdenadosPorTempoDeCompilacaoDecrescente();
                    break;
                case 4:
                    Printer.imprimirArquivoComMaiorTempoDeCompilacao();
                    break;
                case 5:
                    Printer.imprimirArquivosComLinhasCondicionais();
                    break;
                case 6:
                    Printer.imprimirArquivosComTermo();
                    break;
                case 7:
                    escolha = true;
                    continue;
                case 8:
                    Singleton.getInstancia().resetarSistema();
                    System.out.println("Sistema resetado com sucesso!");
                    break;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }

            escolha = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ",
                    "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        } while (!escolha);
    }
}
