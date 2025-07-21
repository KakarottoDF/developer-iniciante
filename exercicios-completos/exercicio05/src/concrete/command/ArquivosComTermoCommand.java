package concrete.command;

import command.Command;
import printer.Printer;

public class ArquivosComTermoCommand implements Command {
    public void executar() {
        Printer.imprimirArquivosComTermo();
    }
}
