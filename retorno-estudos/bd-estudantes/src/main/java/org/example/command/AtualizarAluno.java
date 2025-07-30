package org.example.command;

import org.example.dao.AlunoDAO;
import org.example.model.Aluno;
import org.example.model.Reader;

public class AtualizarAluno implements Command {
    public void executar() {
        String cpf = Reader.lerString("Digite o CPF do aluno a atualizar:");
        Aluno aluno = new AlunoDAO().pesquisarByCpf(cpf);
        if (aluno != null) {
            String nome = Reader.lerString("Digite o novo nome:");
            int idade = Reader.lerInt("Digite a nova idade:");
            aluno.setNome(nome);
            aluno.setIdade(idade);
            new AlunoDAO().update(aluno);
            Reader.mostrarMensagem("Aluno atualizado!");
        } else {
            Reader.mostrarMensagem("Aluno não encontrado!");
        }
    }
}