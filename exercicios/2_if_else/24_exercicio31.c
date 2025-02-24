/*

Faça um algoritmo que leia dois números A e B e imprima o maior deles.

SINTESE
    ENTRADA: a e b
    PROCESSAMENTO: comparar se a é maior que b senão b é o maior
    SAIDA: maior número

*/

#include <stdio.h>

int main(){
    int a = 0;
    int b = 0;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &a);

    printf("Digite o segundo numero:\n");
    scanf("%d", &b);

    if(a > b){
        printf("Dos dois numeros digitados, o primeiro foi o maior deles: %d", a);
    }else{
        printf("Dos dois numeros digitados, o segundo foi o maior deles: %d", b);
    }

}