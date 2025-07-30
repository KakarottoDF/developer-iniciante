package org.example.dao;

import org.example.model.Aluno;

import java.sql.*;
import java.util.ArrayList;

public class AlunoDAO implements DAO {
    public void cadastrar(Aluno aluno) {
        try (Connection con = FactoryConnection.getInstance();
             PreparedStatement pst = con.prepareStatement("INSERT INTO ESTUDANTE (NOME, CPF, IDADE) VALUES (?, ?, ?)");) {
            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getCpf());
            pst.setInt(3, aluno.getIdade());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Aluno aluno) {
        try (Connection con = FactoryConnection.getInstance();
             PreparedStatement pst = con.prepareStatement("UPDATE ESTUDANTE SET NOME=?, IDADE=? WHERE CPF=?");) {
            pst.setString(1, aluno.getNome());
            pst.setInt(2, aluno.getIdade());
            pst.setString(3, aluno.getCpf());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String cpf) {
        try (Connection con = FactoryConnection.getInstance();
             PreparedStatement pst = con.prepareStatement("DELETE FROM ESTUDANTE WHERE CPF=?");) {
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Aluno> pesquisarByNome(String nome) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try (Connection con = FactoryConnection.getInstance();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM ESTUDANTE WHERE NOME LIKE ?");) {
            pst.setString(1, "%" + nome + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                alunos.add(new Aluno(rs.getInt("CODIGO"), rs.getString("NOME"), rs.getString("CPF"), rs.getInt("IDADE")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public ArrayList<Aluno> pesquisarTodos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try (Connection con = FactoryConnection.getInstance();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM ESTUDANTE");
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                alunos.add(new Aluno(rs.getInt("CODIGO"), rs.getString("NOME"), rs.getString("CPF"), rs.getInt("IDADE")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public Aluno pesquisarByCpf(String cpf) {
        try (Connection con = FactoryConnection.getInstance();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM ESTUDANTE WHERE CPF=?");) {
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return new Aluno(rs.getInt("CODIGO"), rs.getString("NOME"), rs.getString("CPF"), rs.getInt("IDADE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}