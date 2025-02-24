/*Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5,
na qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius;*/

#include <stdio.h>

int main(){
    float temperature;
    float toFahrenheit;

    printf("Digite a teperatura em Celsius: \n");
    scanf("%f", &temperature);

    toFahrenheit = (9 * temperature + 160) / 5;

    printf("A temperatura em Fahrenheit sera %.2fF.", toFahrenheit);
}
