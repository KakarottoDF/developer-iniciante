package org.example.command.concrete;

import org.example.command.Command;
import org.example.dao.AlunoDAO;
import org.example.model.Aluno;
import org.example.model.Reader;

import java.util.ArrayList;

public class BuscarPorNome implements Command {
    @Override
    public void executar() {
        String nome = Reader.lerString("Digite o nome:");
        ArrayList<Aluno> alunos = new AlunoDAO().pesquisarByNome(nome);
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos) {
            sb.append(aluno).append("\n");
        }
        Reader.mostrarMensagem(sb.toString());
    }
}