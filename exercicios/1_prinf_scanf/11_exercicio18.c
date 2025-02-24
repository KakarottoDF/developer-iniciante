/*

Faça um algoritmo que leia os valores de COMPRIMENTO, LARGURA e
ALTURA e apresente o valor do volume de uma caixa retangular. Utilize para o
cálculo a fórmula VOLUME = COMPRIMENTO * LARGURA * ALTURA.

SINTESE
    ENTRADA: COMPRIMENTO, LARGURA e ALTURA
    PROCESSAMENTO: COMPRIMENTO * LARGURA * ALTURA
    SAIDA: VOLUME

*/

#include <stdio.h>

int main(){
    float comprimento = 0.0;
    float largura = 0.0;
    float altura = 0.0;
    float volume = 0.0;

    printf("Digite o valor do comprimento:\n");
    scanf("%f", &comprimento);

    printf("Digite o valor da largura:\n");
    scanf("%f", &largura);

    printf("Digite o valor da altura:\n");
    scanf("%f", &altura);

    volume = comprimento * largura * altura;

    printf("O volume de uma caixa retangular é igual a %.2f.\n", volume);
}