/*

Faça um algoritmo que leia um número N e imprima “F1”, “F2” ou “F3”, conforme
a condição:
• “F1”, se N <= 10
• “F2”, se N > 10 e N <= 100
• “F3”, se n > 100

SINTESE
    ENTRADA: n
    PROCESSAMENTO: verificar as condiçoes de n
    SAIDA: "F1" ou "F2" ou "F3"

*/

#include <stdio.h>

int main(){

    int n = 0;

    printf("Digite um numero:\n");
    scanf("%d", &n);

    if(n <= 10){
        printf("F1");
    }else if(n > 10 && n <= 100){
        printf("F2");
    }else{
        printf("F3");
    }

}