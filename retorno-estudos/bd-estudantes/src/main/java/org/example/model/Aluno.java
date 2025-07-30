package org.example.model;

public class Aluno {
    private int codigo;
    private String nome;
    private String cpf;
    private int idade;

    public Aluno(String nome, String cpf, int idade) {
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    public Aluno(int codigo, String nome, String cpf, int idade) {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "\nCódigo = " + getCodigo() +
                "\nNome = " + getNome() +
                "\nCPF = " + getCpf() +
                "\nIdade = " + getIdade() +
                "\n}";
    }
}