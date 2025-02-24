/*
Faça um algoritmo que leia dois números e mostre qual o maior dos dois.

SINTESE
    ENTRADA: primeiroNumero, segundoNumero
    PROCESSAMENTO: comparação
    SAIDA: maior número

*/

#include <stdio.h>

int main(){

    int primeiroNumero;
    int segundoNumero;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &primeiroNumero);

    printf("Digite o segundo numero:\n");
    scanf("%d", &segundoNumero);

    if(primeiroNumero > segundoNumero){
        printf("O primeiro numero digitado %d, e maior que o segundo digitado %d\n", primeiroNumero, segundoNumero);
    }else{
        printf("O segundo numero digitado %d, e maior que o primeiro digitado %d\n", segundoNumero, primeiroNumero);
    }
}