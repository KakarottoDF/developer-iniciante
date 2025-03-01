/*
SINTESE
    ENTRADA: o for fará a entrada
    PROCESSAMENTO: produto dos número ímpares de 1 a 15
    SAIDA: produtoDosNumerosImpares
*/

#include <stdio.h>
#define REPETICOES 15

int main(){

    float produtoDOsNumerosImpares;

    for(int i = 1; i <= REPETICOES; i++){
        if(i % 2 == 1 && i <= 13){
            produtoDOsNumerosImpares = i;
            produtoDOsNumerosImpares *= i;
        }
    }

    printf("O produto dos inteiros ímpares de 1 a 15 e de %.2f.\n", produtoDOsNumerosImpares);
    
}