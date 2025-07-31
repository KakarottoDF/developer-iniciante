package org.example.command.concrete;

import org.example.command.Command;
import org.example.dao.AlunoDAO;
import org.example.model.Aluno;
import org.example.model.Reader;

public class BuscarPorCpf implements Command {
    @Override
    public void executar() {
        String cpf = Reader.lerString("Digite o CPF:");
        Aluno aluno = new AlunoDAO().pesquisarByCpf(cpf);
        if (aluno != null) {
            Reader.mostrarMensagem(aluno.toString());
        } else {
            Reader.mostrarMensagem("Aluno não encontrado.");
        }
    }
}
