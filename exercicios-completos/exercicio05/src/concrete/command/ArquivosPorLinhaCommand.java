package concrete.command;

import command.Command;
import printer.Printer;

public class ArquivosPorLinhaCommand implements Command {
    public void executar() {
        Printer.imprimirArquivosComLinhasCondicionais();
    }
}
