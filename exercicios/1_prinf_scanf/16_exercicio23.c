/*

Faça um algoritmo que leia dois números nas variáveis NumA e NumB, nessa
ordem, e imprima em ordem inversa, isto é, se os dados lidos forem 5 e 9, por
exemplo, devem ser impressos na ordem 9 e 5.

SINTESE
    ENTRADA: numA e numB
    PROCESSAMENTO: numA e numB
    SAIDA: numB e numA

*/

#include <stdio.h>

int main(){
    int numA = 0;
    int numB = 0;

    printf("Digite o valor de A:\n");
    scanf("%d", &numA);

    printf("Digite o valor de B:\n");
    scanf("%d", &numB);

    printf("Ordem inversa de impressao: %d e %d", numB, numA);
}