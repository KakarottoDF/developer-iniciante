package concrete.command;

import command.Command;
import printer.Printer;

public class ListarArquivosOrdenadosCommand implements Command {
    public void executar() {
        Printer.imprimirTodosOsSistemas();
        Printer.imprimirArquivosOrdenadosPorTempoDeCompilacaoDecrescente();
    }
}
