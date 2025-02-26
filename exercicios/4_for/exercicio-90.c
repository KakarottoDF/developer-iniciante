/*
SINTESE
    ENTRADA: o for fará a entrada
    PROCESSAMENTO: verificar os múltiplos positivos de 7 e inferiores a 1000
    SAIDA: múltiplos positivos de 7 e inferiores a 1000
*/

#include <stdio.h>

int main(){

    for(int i = 1; i <= 1000; i++){
        if(i % 7 == 0){
            printf("%d\n", i);
        }
    }
    
}