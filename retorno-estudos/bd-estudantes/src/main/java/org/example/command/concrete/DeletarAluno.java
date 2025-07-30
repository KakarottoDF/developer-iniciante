package org.example.command.concrete;

import org.example.command.Command;
import org.example.dao.AlunoDAO;
import org.example.model.Reader;

public class DeletarAluno implements Command {
    public void executar() {
        String cpf = Reader.lerString("Digite o CPF do aluno a deletar:");
        new AlunoDAO().delete(cpf);
        Reader.mostrarMensagem("Aluno deletado!");
    }
}
