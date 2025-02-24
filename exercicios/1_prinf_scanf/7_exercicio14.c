/*Faça um algoritmo que calcule e apresente o valor do volume de uma lata de
óleo, utilizando a fórmula VOLUME = 3,14159 * RAIO2 * ALTURA*/

#include <stdio.h>
#define PI 3.14159

int main(){
    float raio, altura, volume;

    printf("Digite o raio da lata de oleo:\n");
    scanf("%f", &raio);

    printf("Digite a altura da lata de oleo:\n");
    scanf("%f", &altura);

    volume = PI * (raio * raio) * altura;

    printf("O valor do volume de uma lata de oleo e de %.2f.", volume);
}
