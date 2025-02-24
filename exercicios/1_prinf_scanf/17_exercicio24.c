/*

Faça um algoritmo que leia a velocidade de um veículo em km/h e calcule e
imprima a velocidade em m/s (metros por segundo).

SINTESE
    ENTRADA: velocidade
    PROCESSAMENTO: velocidade / 3.6
    SAIDA: valorVelocidade

*/

#include <stdio.h>

int main(){
    float velocidade = 0;
    float valorVelocidade = 0;

    printf("Digite o valor da velocidade em Km/h:\n");
    scanf("%f", &velocidade);

    valorVelocidade = velocidade / 3.6;

    printf("A velocidade em m/s e de %.2f", valorVelocidade);
}