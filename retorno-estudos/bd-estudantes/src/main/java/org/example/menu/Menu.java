package org.example.menu;

import org.example.command.*;
import org.example.command.concrete.*;
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
            int opcao = Reader.lerInt(
                    """
                            ESCOLHA UMA DAS OPÇÕES:
                            
                            [0] CADASTRAR ALUNO
                            [1] ATUALIZAR ALUNO
                            [2] DELETAR ALUNO
                            [3] BUSCAR ALUNO POR CPF
                            [4] BUSCAR ALUNO POR NOME
                            [5] LISTAR TODOS OS ALUNOS
                            [6] SAIR DO SISTEMA
                            
                            """, "DIGITE SOMENTE UM NÚMERO ENTRE 0 E 6", 0, 6);
            if (opcao >= 0 && opcao < comandos.length){
                comandos[opcao].executar();
            }
        }
    }
}