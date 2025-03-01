/*

A série de Fibonacci é formada pela sequência:
0, 1, 1, 2, 3, 5, 8, 13, 21, ...
Construa um algoritmo que gere e mostre a série até o vigésimo termo.

SINTESE
    ENTRADA: termo
    PROCESSAMENTO: serieFibonacci
    SAIDA: serieFibonacci
*/

#include <stdio.h>

int main(){

    int termo = 20;
    int serieFibonacci[20];

    serieFibonacci[0] = 0;
    serieFibonacci[1] = 1;

    for(int i = 2; i < termo; i++){
        serieFibonacci[i] = serieFibonacci[i - 1] + serieFibonacci[i - 2];
    }

    for(int i = 0; i < termo; i++){
        printf("%d ", serieFibonacci[i]);
    }

    printf("\n");
    
}