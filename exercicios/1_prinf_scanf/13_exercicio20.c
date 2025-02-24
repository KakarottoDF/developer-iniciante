/*

Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
do quadrado da soma dos valores lidos.

SINTESE
    ENTRADA: A e B
    PROCESSAMENTO: A + B e somaNumerosDigitados * somaNumerosDigitados
    SAIDA: resultadoFinal

*/

#include <stdio.h>

int main(){
    int A = 0;
    int B = 0;
    int somaNumerosDigitados = 0;
    int resultadoFinal = 0;

    printf("Digite o primeiro numero inteiro:\n");
    scanf("%d", &A);

    printf("Digite o segundo numero inteiro:\n");
    scanf("%d", &B);

    somaNumerosDigitados = A + B;
    resultadoFinal = somaNumerosDigitados * somaNumerosDigitados;

    printf("O quadrado da soma dos valores lidos e igual a %d.\n", resultadoFinal);
}