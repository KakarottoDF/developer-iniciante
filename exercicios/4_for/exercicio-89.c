/*
SINTESE
    ENTRADA: valorInteiros
    PROCESSAMENTO: soma de números positivos e quantidade de valores negativos
    SAIDA: soma de números positivos e quantidade de valores negativos
*/

#include <stdio.h>

int main(){

    int numero;
    int quantidadeDeValoresNegativos = 0;
    int somaDeNumerosPositivos = 0;

    for (int i = 0; i < 5; i++){
        printf("Digite o %d numero: \n", i + 1);
        scanf("%d", &numero);

        if(numero % 2 == 0){
            somaDeNumerosPositivos += numero;
            }else{
                if(numero < 0){
                    quantidadeDeValoresNegativos++;
                }
            }
        }

        printf("A soma dos numeros positivos e de %d\n", somaDeNumerosPositivos);
        printf("A quantidade de valores negativos foi de %d\n", quantidadeDeValoresNegativos);
}