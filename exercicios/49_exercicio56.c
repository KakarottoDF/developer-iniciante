/*
Elaborar um algoritmo que lê três valores a, b, c e os escreve. A seguir, encontre
o maior dos três valores e o escreva com a mensagem : "É o maior”.

SINTESE
    ENTRADA: a, b, c
    PROCESSAMENTO: verifical qual dos três números é o maior
    SAIDA: É o maior
*/

#include <stdio.h>

int main(){
    int a;
    int b;
    int c;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &a);

    printf("Digite o segundo numero:\n");
    scanf("%d", &b);

    printf("Digite o terceiro numero:\n");
    scanf("%d", &c);

    if(a > b && a > c){
        printf("O primeiro numero e o maior");
        }else{
            if(b > a && b > c){
                printf("O segundo numero e o maior");
                }else{
                    printf("O terceiro numero e o maior");
            }
        }
}