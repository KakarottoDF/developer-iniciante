package org.example.command.concrete;

import org.example.command.Command;
import org.example.dao.AlunoDAO;
import org.example.model.Aluno;
import org.example.model.Reader;

public class CadastrarAluno implements Command {
    public void executar() {
        String nome = Reader.lerString("Digite o nome:");
        String cpf = Reader.lerString("Digite o CPF:");
        int idade = Reader.lerInt("Digite a idade:");
        Aluno aluno = new Aluno(nome, cpf, idade);
        new AlunoDAO().cadastrar(aluno);
        Reader.mostrarMensagem("Aluno cadastrado!");
    }
}