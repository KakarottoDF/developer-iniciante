/*
Crie um algoritmo que retorne verdadeiro quando um número fornecido for par.

SINTESE
    ENTRADA: numero
    PROCESSAMENTO: par
    SAIDA: par
*/

#include <stdio.h>

int main(){

    int numero;
    int par;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    if(numero % 2 == 0){
        par = 1;
    }else{
        par = 0;
    }

    if(par == 1){
        printf("O numero informado e par\n");
    }else{
        printf("O numero informado e impar\n");
    }
}