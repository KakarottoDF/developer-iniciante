/*

Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
da soma do quadrado de cada valor lido.

SINTESE
    ENTRADA: A e B
    PROCESSAMENTO: (A * A) + (B * B)
    SAIDA: resultadoFinal

*/

#include <stdio.h>

int main(){
    int A = 0;
    int B = 0;
    int resultadoFinal = 0;

    printf("Digite o valor de A:\n");
    scanf("%d", &A);

    printf("Digite o valor de B:\n");
    scanf("%d", &B);

    resultadoFinal = (A * A) + (B * B);

    printf("O resultado da soma do quadrado de A e B e igual a %d.\n", resultadoFinal);

}