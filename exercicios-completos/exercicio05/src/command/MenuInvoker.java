package command;

import java.util.HashMap;
import java.util.Map;

public class MenuInvoker {
    private final Map<Integer, Command> comandos = new HashMap<>();

    public void registrarComando(int opcao, Command command) {
        comandos.put(opcao, command);
    }

    public void executarComando(int opcao) {
        Command comando = comandos.get(opcao);
        if (comando != null) {
            comando.executar();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
