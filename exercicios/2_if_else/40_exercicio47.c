/*

Construir um algoritmo que tome como entradas três valores distintos e os
apresente (imprima) em ordem crescente (menor para o maior).

SINTESE
    ENTRADA: valor1, valor2, valor3
    PROCESSAMENTO: ordenar valores
    SAIDA: valores ordenados

*/

#include <stdio.h>

int main(){

    float valor1;
    float valor2;
    float valor3;

    printf("Digite o primeiro valor:\n");
    scanf("%f", &valor1);

    printf("Digite o segundo valor:\n");
    scanf("%f", &valor2);

    printf("Digite o terceiro valor:\n");
    scanf("%f", &valor3);

    if(valor1 < valor2 && valor1 < valor3){
        if(valor2 < valor3){
            printf("%.2f, %.2f, %.2f\n", valor1, valor2, valor3);
        }else{
            printf("%.2f, %.2f, %.2f\n", valor1, valor3, valor2);
        }
    }else{
        if(valor2 < valor1 && valor2 < valor3){
            if(valor1 < valor3){
                printf("%.2f, %.2f, %.2f\n", valor2, valor1, valor3);
            }else{
                printf("%.2f, %.2f, %.2f\n", valor2, valor3, valor1);
            }
        }else{
            if(valor3 < valor1 && valor3 < valor2){
                if(valor1 < valor2){
                    printf("%.2f, %.2f, %.2f\n", valor3, valor1, valor2);
                }else{
                    printf("%.2f, %.2f, %.2f\n", valor3, valor2, valor1);
                }
            }
        }
    }
}