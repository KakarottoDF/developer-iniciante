/*
SINTESE
    ENTRADA: numero
    PROCESSAMENTO: multiplicação
    SAIDA: multiplicação de 1 até 13
*/

#include <stdio.h>
#define REPETICOES 13

int main(){

    int leituraNumero;

    printf("Digite um numero: ");
    scanf("%d", &leituraNumero);

    for(int i = 1; i<= REPETICOES; i++){
        printf("%d X %d = %d\n", i, leituraNumero, i * leituraNumero);
    }
    
}