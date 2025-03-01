/*
SINTESE
    ENTRADA: o for fará a entrada
    PROCESSAMENTO: quadrados e cubos
    SAIDA: tabela com quadrados e cubos
*/

#include <stdio.h>
#define REPETICOES 10

int main(){

    printf("NUMERO------QUADRADO------CUBO\n");

    for(int i = 0; i <= REPETICOES; i++){
        printf("  %d            %d           %d\n", i, i * i, i * i * i);
    }

    
}