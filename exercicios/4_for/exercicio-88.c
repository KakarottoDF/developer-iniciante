/*
SINTESE
    ENTRADA: o for fará a entrada
    PROCESSAMENTO: somarNumeros
    SAIDA: somarNumeros
*/

#include <stdio.h>

int main(){

    int somaNumeros = 0;
    
    for(int i = 1; i <= 100; i++){
        somaNumeros += i;
    }

    printf("A soma dos numeros de 1 a 100 e igual a %d", somaNumeros);
    
}