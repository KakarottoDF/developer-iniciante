/*

Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.asm

SINTESE
    ENTRADA: valor1, valor2, valor3
    PROCESSAMENTO: menorValor
    SAIDA: menorValor

*/

#include <stdio.h>

int main(){

    int valor1;
    int valor2;
    int valor3;
    int menorValor;

    printf("Digite o primeiro valor:\n");
    scanf("%d", &valor1);

    printf("Digite o segundo valor:\n");
    scanf("%d", &valor2);

    printf("Digite o terceiro valor:\n");
    scanf("%d", &valor3);

    if(valor1 < valor2 && valor1 < valor3){
        menorValor = valor1;
    }else{
        if(valor2 < valor1 && valor2 < valor3){
            menorValor = valor2;
        }else{
            if(valor3 < valor1 && valor3 < valor2){
                menorValor = valor3;
            }
        }
    }

    printf("O menor valor e: %d\n", menorValor);
}