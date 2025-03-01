/*
Um determinado material radioativo perde metade de sua massa a cada 50
segundos. Dada a massa inicial, em gramas, faça um programa que determine o
tempo necessário para que essa massa se torne menor que 0,05 gramas.

SINTESE
    ENTRADA: massaInicial
    PROCESSAMENTO: tempoNecessario
    SAIDA: tempoNecessario
*/

#include <stdio.h>

int main(){

    float massaInicial;
    int tempoNecessario = 0;

    printf("Digite a massa inicial do material radioativo: ");
    scanf("%f", &massaInicial);

    while(massaInicial > 0.05){
        massaInicial /= 2;
        tempoNecessario += 50;
    }

    printf("O tempo necessario para que a massa se torne menor que 0,05 gramas foi de %d segundos.\n", tempoNecessario);
    
}