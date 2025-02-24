/*

Faça um algoritmo que leia dois números nas variáveis Val1 e Val2, calcule sua
média na variável Media e imprima seu valor.

SINTESE
    ENTRADA: Val1 e Val2
    PROCESSAMENTO: (Val1 + Val2) /2
    SAIDA: Media

*/

#include <stdio.h>

int main(){
    int val1 = 0;
    int val2 = 0;
    int media = 0;

    printf("Digite o primeiro valor:\n");
    scanf("%d", &val1);

    printf("Digite o segundo valor:\n");
    scanf("%d", &val2);

    media = (val1 + val2) / 2;

    printf("A media dos valores digitados e igual a %d.\n", media);
}