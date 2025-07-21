package concrete.command;

import command.Command;
import view.View;

public class CadastrarCCommand implements Command {
    public void executar() {
        View.cadastrarLinguagemC();
    }
}