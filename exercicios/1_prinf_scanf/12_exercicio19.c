/*

Faça um algoritmo que leia um valor inteiro e apresente os resultados do
quadrado e do cubo do valor lido.

SINTESE
    ENTRADA: valorInteiro
    PROCESSAMENTO: valorInteiro * valorInteiro e valorInteiro * valorInteiro * valorInteiro
    SAIDA: resultadoQuadrado e resultadoCubo

*/

#include <stdio.h>

int main(){
    int valorInteiro = 0;
    int resultadoQuadrado = 0;
    int resultadoCubo = 0;

    printf("Digite o valor de um numero:\n");
    scanf("%d", &valorInteiro);

    resultadoQuadrado = valorInteiro * valorInteiro;
    resultadoCubo = valorInteiro * valorInteiro * valorInteiro;

    printf("O quadrado do número digitado e igual a %d.\n", resultadoQuadrado);
    printf("O cubo do número digitado e igual a %d.\n", resultadoCubo);
}