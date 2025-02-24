/*Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente
convertida em graus Celsius. A fórmula de conversão é C = (F – 32) * ( 5 / 9), na
qual F é a temperatura em Fahrenheit e C é a temperatura em Celcius*/

#include <stdio.h>

int main(){
    float temperature, toCelsius;

    printf("Digite a teperatura em Fahrenheit: \n");
    scanf("%f", &temperature);

    toCelsius = (temperature - 32) * ( 5.0 / 9.0);

    printf("A temperatura em Celsius sera %.2fC.", toCelsius);
}
