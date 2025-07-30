package org.example.menu;

import org.example.command.*;
import org.example.model.Reader;

public class Menu {
    public void exibir() {
        Command[] comandos = {
                new CadastrarAluno(),
                new AtualizarAluno(),
                new DeletarAluno(),
                new BuscarPorCpf(),
                new BuscarPorNome(),
                new ListarTodos(),
                () -> System.exit(0)
        };

        while (true) {
            int opcao = Reader.lerInt("Menu:\n0 - Cadastrar\n1 - Atualizar\n2 - Deletar\n3 - Buscar CPF\n4 - Buscar Nome\n5 - Listar Todos\n6 - Sair");
            if (opcao >= 0 && opcao < comandos.length){
                comandos[opcao].executar();
            }
        }
    }
}