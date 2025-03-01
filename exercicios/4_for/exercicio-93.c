/*
SINTESE
    ENTRADA: o for irá fazer a entrada
    PROCESSAMENTO: 
    SAIDA: 
*/

#include <stdio.h>

int main(){

    double grao = 1;
    double total = 1;

    for (int i = 2; i <= 64; i++) {
        grao *= 2;
        total += grao;
    }

    printf("O total de graos e: %.0f\n", total);
    
}