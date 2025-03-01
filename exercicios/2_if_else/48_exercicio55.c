/*
Calcule a média aritmética das três notas de um aluno e mostre, além do valor
da média, uma mensagem de "Aprovado", caso a média seja igual ou superior a
7; a mensagem “em prova final” caso a média seja menor que 7 e maior ou igual
a 4; e "reprovado", caso contrário.

SINTESE
    ENTRADA: primeiraNota, segundaNota, terceiraNota
    PROCESSAMENTO: primeiraNota, segundaNota, terceiraNota, mediaDoAluno
    SAIDA: Aprovado, Em Prova Final, Reprovado

*/

#include <stdio.h>
#define MEDIA 3

int main(){

    float primeiraNota;
    float segundaNota;
    float terceiraNota;
    float media = 0;

    printf("Entre com a primeira nota do aluno:\n", primeiraNota);
    scanf("%f", &primeiraNota);

    printf("Entre com a segunda nota do aluno:\n", segundaNota);
    scanf("%f", &segundaNota);

    printf("Entre com a tereira nota do aluno:\n", terceiraNota);
    scanf("%f", &terceiraNota);

    media = (primeiraNota + segundaNota + terceiraNota) / MEDIA;

    if (media >= 7){
        printf("Aluno APROVADO!\n\n");
        }else{
            if (media >= 4 && media < 7){
                printf("Aluno EM PROVA FINAL!\n\n");
                }else{
                    printf("Aluno REPROVADO!\n\n");
                    }
            }
}