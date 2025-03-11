/*
SINTESE
    ENTRADA: nome, notasAluno
    PROCESSAMENTO: mediaAluno
    SAIDA: nome, notasAluno, mediaAluno, APROVADO ou REPROVADO

Crie uma entidade aluno com nome e duas notas. Receba do usuário os dados deste aluno
e, na sequência, apresente todos os dados deste aluno. Apresente também a média dele e
se está aprovado ou reprovado. Crie o maior número de métodos que conseguir visualizar.
*/

public class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = Aluno.lerNome("Digite o nome do aluno: ");

        for(int i = 0; i < aluno.QUANTIDADE_DE_NOTAS; i++){
            aluno.notas[i] = Aluno.lerNotas("Digite a " + (i + 1) + "ª nota do aluno: ");
        }
    }
}
