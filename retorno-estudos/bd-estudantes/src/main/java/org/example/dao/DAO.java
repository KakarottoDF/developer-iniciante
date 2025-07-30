package org.example.dao;

import org.example.model.Aluno;

import java.util.ArrayList;

public interface DAO {
    void cadastrar(Aluno aluno);
    void update(Aluno aluno);
    void delete(String cpf);
    ArrayList<Aluno> pesquisarByNome(String nome);
    ArrayList<Aluno> pesquisarTodos();
    Aluno pesquisarByCpf(String cpf);
}
