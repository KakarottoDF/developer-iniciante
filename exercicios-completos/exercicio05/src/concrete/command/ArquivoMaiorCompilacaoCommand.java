package concrete.command;

import command.Command;
import printer.Printer;

public class ArquivoMaiorCompilacaoCommand implements Command {
    public void executar() {
        Printer.imprimirArquivoComMaiorTempoDeCompilacao();
    }
}