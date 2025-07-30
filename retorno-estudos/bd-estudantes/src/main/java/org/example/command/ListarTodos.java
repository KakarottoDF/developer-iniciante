package org.example.command;

import org.example.dao.AlunoDAO;
import org.example.model.Aluno;
import org.example.model.Reader;

import java.util.ArrayList;

public class ListarTodos implements Command {
    public void executar() {
        ArrayList<Aluno> alunos = new AlunoDAO().pesquisarTodos();
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos) {
            sb.append(aluno).append("\n");
        }
        Reader.mostrarMensagem(sb.toString());
    }
}