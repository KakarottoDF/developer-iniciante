/*
SINTESE
    ENTRADA: o for fará toda a entrada
    PROCESSAMENTO: verificar os números pares entre 85 e 907 e calcular esses valores
    SAIDA: valoresEntre85E907
*/

#include <stdio.h>

int main(){

    int valoresEntre85E907;

    for(int i = 1; i < 1000; i++){
        if(i % 2 == 0 && i >= 85 && i <= 907){
            valoresEntre85E907 += i;
            printf("%d\n", i);
        }
    }
    printf("\nA soma do valores pares entre 85 e 907 e igual a %d", valoresEntre85E907);
    
}