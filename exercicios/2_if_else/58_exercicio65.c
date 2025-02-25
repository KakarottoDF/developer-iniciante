/*
Crie um algoritmo em que o aluno digita duas notas bimestrais e informa se o
aluno foi aprovado ou não. Nota: Considere aprovado se a nota for maior que
5.0.

SINTESE
    ENTRADA: primeiraNotaBimestral, segundaNotaBimestral
    PROCESSAMENTO: mediaBimestral
    SAIDA: Aprovado ou Reprovado
*/

#include <stdio.h>
#define MEDIA 2

int main(){

    float primeiraNotaBimestral;
    float segundaNotaBimestral;
    float mediaBimestral;

    printf("Digite a primeira nota bimestral: %f");
    scanf("%f", &primeiraNotaBimestral);

    printf("Digite a segunda nota bimestral: %f");
    scanf("%f", &segundaNotaBimestral);

    mediaBimestral = (primeiraNotaBimestral + segundaNotaBimestral) / MEDIA;

    if(mediaBimestral > 5.0){
        printf("APROVADO");
    }else{
        printf("REPROVADO");
    }
    


}