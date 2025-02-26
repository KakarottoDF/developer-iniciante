/*
SINTESE
    ENTRADA: numero
    PROCESSAMENTO: valorDeA += (numero + ((numero - (i) / i +1)))
    SAIDA: valorDeA
*/

#include <stdio.h>

int main(){

    int numero;
    float valorDeA = 0;

    printf("Digite um numero inteiro positivo: ");
    scanf("%d", &numero);

    valorDeA = numero;

    for(int i = 2; i <= numero; i++){
        valorDeA += (float)(numero - (i - 1)) / i;
    }

    printf("\nO valor de A = %.2f", valorDeA);
    
}