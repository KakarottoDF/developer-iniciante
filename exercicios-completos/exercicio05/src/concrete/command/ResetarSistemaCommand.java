package concrete.command;

import command.Command;
import singleton.Singleton;

public class ResetarSistemaCommand implements Command {
    @Override
    public void executar() {
        Singleton.getInstancia().resetarSistema();
        System.out.println("Sistema resetado com sucesso!");
    }
}
