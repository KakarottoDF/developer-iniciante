package concrete.command;

import command.Command;
import printer.Printer;

public class ArquivoMaiorCompilacaoCommand implements Command {
    @Override
    public void executar() {
        Printer.imprimirArquivoComMaiorTempoDeCompilacao();
    }
}