/*
Para uma turma de 45 alunos, construa um algoritmo que determine:
a) A idade média dos alunos com menos de 1,70m de altura;
b) A altura média dos alunos com mais de 20 anos.

SINTESE
    ENTRADA: idade, altura
    PROCESSAMENTO:  mediaDaIdadeDoAluno e mediaDaAlturaDoAluno
    SAIDA: médias da idade e altura dos alunos
*/

#include <stdio.h>
#define QUANTIDADE_DE_ALUNOS 2

int main(){

    int idadeDoAluno;
    float alturaDoAluno;
    float mediaDaIdadeDoAluno = 0;
    int totalDasIdadesDosAlunos = 0;
    float mediaDaAlturaDoAluno = 0;
    float totalDasAlturasDosAlunos = 0;

    for(int i = 1; i <= QUANTIDADE_DE_ALUNOS; i++){
        printf("Digite a idade do %d aluno: ", i);
        scanf("%d", &idadeDoAluno);

        totalDasIdadesDosAlunos += idadeDoAluno;
        
        printf("Digite a altura do %d aluno: ", i);
        scanf("%f", &alturaDoAluno);

        totalDasAlturasDosAlunos += alturaDoAluno;

    }

    printf("%d\n\n\n", totalDasIdadesDosAlunos);

    mediaDaIdadeDoAluno = totalDasIdadesDosAlunos / QUANTIDADE_DE_ALUNOS;
    mediaDaAlturaDoAluno = totalDasAlturasDosAlunos / QUANTIDADE_DE_ALUNOS;

    printf("A media das idades dos %d alunos e de %.2f\n", QUANTIDADE_DE_ALUNOS, mediaDaIdadeDoAluno);
    printf("A media das alturas dos %d alunos e de %.2f\n\n", QUANTIDADE_DE_ALUNOS, mediaDaAlturaDoAluno);
    
}