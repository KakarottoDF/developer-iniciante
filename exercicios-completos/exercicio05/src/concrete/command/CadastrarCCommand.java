package concrete.command;

import command.Command;
import view.View;

public class CadastrarCCommand implements Command {
    @Override
    public void executar() {
        View.cadastrarLinguagemC();
    }
}