package concrete.command;

import command.Command;
import printer.Printer;

public class ArquivosPorLinhaCommand implements Command {
    @Override
    public void executar() {
        Printer.imprimirArquivosComLinhasCondicionais();
    }
}
