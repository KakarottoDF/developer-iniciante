/*

Faça um algoritmo que leia dois números inteiros (Int1 e Int2) e imprima o
quociente e o resto da divisão inteira de Int1 por Int2.

SINTESE
    ENTRADA: int1 e int2
    PROCESSAMENTO: int1 div int2 e int 1 mod int2
    SAIDA: resultadoDiv e resultadoMod

*/

#include <stdio.h>

int main(){
    int int1 = 0;
    int int2 = 0;
    int resultadoDiv = 0;
    int resultadoMod = 0;

    printf("Digite o valor do primeiro numero:\n");
    scanf("%d", &int1);

    printf("Digite o valor do segundo numero:\n");
    scanf("%d", &int2);

    resultadoDiv = int1 / int2;
    resultadoMod = int1 % int2;

    printf("O quociente dessa divisao inteira e de %d.\n", resultadoDiv);
    printf("O resto dessa divisao inteira e de %d.\n", resultadoMod);

}