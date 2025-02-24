/*Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
ÁܴREA = (BASE * ALTURA) / 2. Utilize as variáveis AREA, BASE e ALTURA e os
operadores aritméticos de multiplicação e divisão.*/

#include <stdio.h>

int main(){
    
    float area = 0;
    float base = 0;
    float altura = 0;

    printf("Digite a base:\n");
    scanf("%f", &base);
    printf("Digite a altura:\n");
    scanf("%f", &altura);

    area = (base * altura) /2;

    printf("A area desse trinagulo e de %.2f.\n", area);

}
