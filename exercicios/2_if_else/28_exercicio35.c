/*
Considere que o último concurso vestibular apresentou três provas: Português,
Matemática e Conhecimentos Gerais. Considerando que para cada candidato
tem-se um registro contendo o seu nome e as notas obtidas em cada uma das
provas, construa um algoritmo que forneça:
a) o nome e as notas em cada prova do candidato
b) a média do candidato
c) uma informação dizendo se o candidato foi aprovado ou não. Considere que
um candidato é aprovado se sua média for maior que 7.0 e se não apresentou
nenhuma nota abaixo de 5.0

SINTESE
    ENTRADA: nome, notaEmPortugues, notaEmMatematica, notaEmConhecimentoGerais
    PROCESSAMENTO: media
    SAIDA: aprovado ou reprovado
*/

#include <stdio.h>

int main(){
    char nome[50];
    float notaEmPortugues = 0.0;
    float notaEmMatematica = 0.0;
    float notaEmConhecimentosGerais = 0.0;
    float media = 0.0;

    printf("Insira o primeiro nome do candidato:\n");
    fgets(nome, sizeof(nome), stdin);

    printf("Digite a nota em Portugues:\n");
    scanf("%f", &notaEmPortugues);

    printf("Digite a nota em Matematica:\n");
    scanf("%f", &notaEmMatematica);

    printf("Digite a nota em Conhecimentos Gerais:\n");
    scanf("%f", &notaEmConhecimentosGerais);

    media = (notaEmPortugues + notaEmMatematica + notaEmConhecimentosGerais) / 3;

    printf("Ola %s. Sua media foi: %.2f. E voce esta ", nome, media);
    
    if(notaEmPortugues < 5.0 || notaEmMatematica < 5.0 || notaEmConhecimentosGerais < 5.0){
        printf("REPROVADO POR TER TIRADO UMA NOTA ABAIXO DE 5.0!\n");
    }else if(media > 7.0){
        printf("APROVADO!\n");
    }else{
        printf("REPROVADO!\n");
    }

    

}