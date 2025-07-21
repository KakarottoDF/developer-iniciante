package classes.gerais;

import command.MenuInvoker;
import concrete.command.*;
import reader.Reader;

public class Main {
    public static void main(String[] args) {

        boolean sair;
        int opcao;

        MenuInvoker menu = new MenuInvoker();
        menu.registrarComando(1, new CadastrarDotNetCommand());
        menu.registrarComando(2, new CadastrarCCommand());
        menu.registrarComando(3, new ListarArquivosOrdenadosCommand());
        menu.registrarComando(4, new ArquivoMaiorCompilacaoCommand());
        menu.registrarComando(5, new ArquivosPorLinhaCommand());
        menu.registrarComando(6, new ArquivosComTermoCommand());
        menu.registrarComando(8, new ResetarSistemaCommand());

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
                    """, "DIGITE SOMENTE UM NÚMERO ENTRE 1 A 8", 1, 8);

            if (opcao == 7) {
                sair = true;
                continue;
            }

            menu.executarComando(opcao);

            sair = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ",
                    "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        } while (!sair);
    }
}


        /*boolean escolha;
        int opcao;

        do {
            opcao = reader.Reader.lerInt("""
        ESCOLHA UMA DAS OPÇÕES:
        [1] Cadastrar arquivos classes.gerais.DotNet
        [2] Cadastrar arquivos C
        [3] Listar arquivos ordenados por tempo de compilação (decrescente)
        [4] classes.gerais.Arquivo com maior tempo de compilação
        [5] Arquivos com 1000 a 7000 linhas
        [6] Arquivos com o termo "PROVA2" no nome
        [7] Sair
        [8] Resetar o Sistema
        """, "DIGITE SOMENTE UM NÚMERO ENTRE 1 A 8", 1, 8);

            switch (opcao) {
                case 1:
                    view.View.cadastrarDotNet();
                    break;
                case 2:
                    view.View.cadastrarLinguagemC();
                    break;
                case 3:
                    printer.Printer.imprimirTodosOsSistemas();
                    printer.Printer.imprimirArquivosOrdenadosPorTempoDeCompilacaoDecrescente();
                    break;
                case 4:
                    printer.Printer.imprimirArquivoComMaiorTempoDeCompilacao();
                    break;
                case 5:
                    printer.Printer.imprimirArquivosComLinhasCondicionais();
                    break;
                case 6:
                    printer.Printer.imprimirArquivosComTermo();
                    break;
                case 7:
                    escolha = true;
                    continue;
                case 8:
                    singleton.Singleton.getInstancia().resetarSistema();
                    System.out.println("Sistema resetado com sucesso!");
                    break;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }

            escolha = reader.Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ",
                    "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        } while (!escolha);
    }
}
*/