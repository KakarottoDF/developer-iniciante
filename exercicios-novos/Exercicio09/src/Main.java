/*
SINTESE
    ENTRADA: nomeDoAluno, matriculaDoAluno, situacaoDoAluno, quantidadeDeAlunosNaSala
    PROCESSAMENTO: quantidadeDeAlunosRegulares, quantidadeDeAlunosBolsistas 
    SAIDA: nomeDoAluno, matriculaDoAluno, situacaoDoAluno, quantidadeDeAlunosRegulares, quantidadeDeAlunosBolsistas

Uma escola deseja fazer um cadastro dos seus alunos. Um aluno possui nome, matrícula e
situação, que pode ser regular ou bolsista. O usuário informará quantos alunos existem em uma turma. Você receberá os dados de todos os alunos e, na sequência, você deve
apresentar todos os alunos informados, a quantidade de alunos regulares que existe e a
quantidade de alunos bolsistas.
*/

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.quantidadeDeAlunosNaSala = Aluno.lerQuantidadeDeAlunosNaSala("Quantos alunos existem nesta sala de Aula? ");

        aluno.nomeDoAluno = new String[aluno.quantidadeDeAlunosNaSala];
        aluno.matriculaDoAluno = new String[aluno.quantidadeDeAlunosNaSala];
        aluno.situacaoDoAluno = new String[aluno.quantidadeDeAlunosNaSala];

        for(int i = 0; i < aluno.quantidadeDeAlunosNaSala; i++){
            aluno.nomeDoAluno[i] = Aluno.lerDadoDoAluno("Digite o nome do " + (i + 1) + "º aluno: ");
            aluno.matriculaDoAluno[i] = Aluno.lerDadoDoAluno("Digite a matrícula do(a) " + aluno.nomeDoAluno[i] + ": ");


        }
    }
}