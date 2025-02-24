/*
Faça um algoritmo que leia dois números e indique se são iguais ou se são
diferentes. Mostre o maior e o menor (nesta sequência).

SINTESE
    ENTRADA: primeiroNumero, segundoNumero
    PROCESSAMENTO: comparação
    SAIDA: maior e menor número

*/

#include <stdio.h>

int main(){

    int primeiroNumero;
    int segundoNumero;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &primeiroNumero);

    printf("Digite o segundo numero:\n");
    scanf("%d", &segundoNumero);

    if(primeiroNumero == segundoNumero){
        printf("Os numeros sao iguais!\n\n");
    }else{
        printf("Os numeros sao diferentes!\n");
        if(primeiroNumero > segundoNumero){
            printf("O primeiro numero digitado %d, e maior que o segundo digitado %d\n\n", primeiroNumero, segundoNumero);
        }else{
            printf("O segundo numero digitado %d, e maior que o primeiro digitado %d\n\n", segundoNumero, primeiroNumero);
        }
    }
}