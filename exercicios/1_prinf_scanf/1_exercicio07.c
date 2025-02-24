/*Faça um algoritmo para calcular a área de uma circunferência, considerando a
fórmula ÁREA = π * RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi =
3,14159) e os operadores aritméticos de multiplicação.*/

#include <stdio.h>
#include <math.h>

#define PI 3.14159

int main(){
    
    float raio = 0;
    float area = 0;

    printf("---- CALCULAR AREA DA CIRCUNFERENCIA ----\n");

    printf("Digite o raio:\n");
    scanf("%f", &raio);

    area = PI * pow(raio,2);

    printf("Valor da Area da Circunferencia = %f", area);

}
