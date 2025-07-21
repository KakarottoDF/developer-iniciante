package concrete.command;

import command.Command;
import view.View;

public class CadastrarDotNetCommand implements Command {
    public void executar() {
        View.cadastrarDotNet();
    }
}
