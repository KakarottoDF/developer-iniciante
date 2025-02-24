/*
Construa um algoritmo que receba como entrada três valores e os imprima em
ordem crescente

SINTESE
    ENTRADA: primeiroNumero, segundoNumero, terceiroNumero
    PROCESSAMENTO: verificar qual é o maior número, o segundo maior e o terceiro
    SAIDA: Imprimir ordem crescente os números
*/

#include <stdio.h>

int main(){
    int primeiroNumero = 0;
    int segundoNumero = 0;
    int terceiroNumero = 0;

    printf("Digite o valor do primeiro numero:\n");
    scanf("%d", &primeiroNumero);

    printf("Digite o valor do segundo numero:\n");
    scanf("%d", &segundoNumero);

    printf("Digite o valor do terceiro numero:\n");
    scanf("%d", &terceiroNumero);

    if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero){
        printf("%d, %d, %d", terceiroNumero, segundoNumero, primeiroNumero);
    }else if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero){
        printf("%d, %d, %d", segundoNumero, terceiroNumero, primeiroNumero);
    }

    if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && primeiroNumero > terceiroNumero){
        printf("%d, %d, %d", terceiroNumero, primeiroNumero, segundoNumero);
    }else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero){
        printf("%d, %d, %d", primeiroNumero, terceiroNumero, segundoNumero);
    }

    if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && primeiroNumero > segundoNumero){
        printf("%d, %d, %d", segundoNumero, primeiroNumero, terceiroNumero);
    }else if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && segundoNumero > primeiroNumero){
        printf("%d, %d, %d", primeiroNumero, segundoNumero, terceiroNumero);
    }
}