/*

Sem utilizar a operação de multiplicação, escreva um programa que multiplique
dois números inteiros. Por exemplo: 2 * 2 = 2 + 2.

SINTESE
    ENTRADA: numero1, numero2
    PROCESSAMENTO: resultado
    SAIDA: resultado

*/

#include <stdio.h>

int main(){

    int numero1;
    int numero2;
    int resultado = 0;

    printf("Digite o primeiro numero: ");
    scanf("%d", &numero1);

    printf("Digite o segundo numero: ");
    scanf("%d", &numero2);

    for(int i = 1; i <= numero2; i++){
        resultado += numero1;
    }

    printf("O resultado da multiplicacao foi de %d.\n", resultado);
    
}