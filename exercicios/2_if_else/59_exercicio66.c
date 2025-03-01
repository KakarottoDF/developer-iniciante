/*
Escreva um algoritmo que leia dois números inteiros e determine qual é o menor
e qual é o maior também.

SINTESE
    ENTRADA: primeiroNumero, segundoNumero
    PROCESSAMENTO: verificar qual é o maior e qual é o menor digitado
    SAIDA: Mostrar o maior e o menor
*/

#include <stdio.h>

int main(){

    int primeiroNumero;
    int segundoNumero;

    printf("Digite o primeiro numero: ");
    scanf("%d", &primeiroNumero);

    printf("Digite o segundo numero: ");
    scanf("%d", &segundoNumero);

    if(primeiroNumero > segundoNumero){
        printf("Maior numero: %d\n", primeiroNumero);
        printf("Menor numero: %d\n\n", segundoNumero);
        }else{
            printf("Maior numero: %d\n", segundoNumero);
            printf("Menor numero: %d\n\n", primeiroNumero);
            }
}