/*

Faça um algoritmo que leia os valores A, B e C. Mostre uma mensagem que
informe se a soma de A com B é menor, maior ou igual a C.

SINTESE
    ENTRADA: a, b e c
    PROCESSAMENTO: somar a + b e verificar se essa soma é maior, menor ou igual a c
    SAIDA: maior, menor ou igual a c


*/

#include <stdio.h>

int main(){

    int a = 0;
    int b = 0;
    int c = 0;
    int soma = 0;

    printf("Digite o valor de a:\n");
    scanf("%d", &a);

    printf("Digite o valor de b:\n");
    scanf("%d", &b);

    printf("Digite o valor de c:\n");
    scanf("%d", &c);

    soma = a + b;

    if(soma > c){
        printf("A soma de a + b = %d e maior que c = %d.\n", soma, c);
    }else if(soma < c){
        printf("A soma de a + b = %d e menor que c = %d.\n", soma, c);
    }else{
        printf("A soma de a + b = %d e igual a c = %d.\n", soma, c);
    }

}