/*Faça um algoritmo que calcule a quantidade de litros de combustível gasta em
uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o
cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média
durante ela. Desta forma, será possível obter a distância percorrida com a
fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância,
basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os
valores da velocidade média, tempo gasto na viagem, a distância percorrida e a
quantidade de litros utilizada na viagem.*/

#include <stdio.h>

int main(){
    float tempoDeViagem, distancia, litrosUsados;
    int velocidadeMedia;

    printf("Informe quanto tempo tera a viagem: ");
    scanf("%f", &tempoDeViagem);

    printf("Informe a velocidade media desta viagem: ");
    scanf("%d", &velocidadeMedia);

    distancia = tempoDeViagem * velocidadeMedia;
    litrosUsados = distancia /12;

    printf("Velocidade media = %dKm\n", velocidadeMedia);
    printf("Tempo gasto na viagem = %.2fh\n", tempoDeViagem);
    printf("Distancia percorrida = %.2fKm\n", distancia);
    printf("Quantidade de litros utilizada na viagem = %.2fL", litrosUsados);    
}
