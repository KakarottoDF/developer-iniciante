/*

Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos
lados de um triângulo, e se forem, verificar se é um triângulo equilátero, isóscele
ou escaleno. Se eles não formarem um triângulo, escrever uma mensagem.
Antes da elaboração do algoritmo, torna-se necessário a revisão de algumas
propriedades e definições.
Propriedade – o comprimento de cada lado de um triângulo é menor do que a
soma dos comprimentos dos outros dois lados.
Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos
três lados iguais;
Definição 2 - chama-se de triângulo isóscele o triângulo que tem os
comprimentos de dois lados iguais;
Definição 3 - chama-se triângulo escaleno o triângulo que tem os
comprimentos dos três lados diferentes.

SINTESE
    ENTRADA: X, Y, Z
    PROCESSAMENTO: verificar se os valores formam um triangulo e qual tipo de triangulo e
    SAIDA: tipo de triangulo ou mensagem de nao formacao de triangulo

*/

#include <stdio.h>

int main(){

    float X;
    float Y;
    float Z;

    printf("Digite o valor de X:\n");
    scanf("%f", &X);

    printf("Digite o valor de Y:\n");
    scanf("%f", &Y);

    printf("Digite o valor de Z:\n");
    scanf("%f", &Z);

    if(X < Y + Z && Y < X + Z && Z < X + Y){
        if(X == Y && Y == Z){
            printf("Os valores formam um triangulo equilatero!\n");
        }else{
            if(X == Y || Y == Z || X == Z){
                printf("Os valores formam um triangulo isosceles!\n");
            }else{
                if(X != Y && Y != Z && X != Z){
                    printf("Os valores formam um triangulo escaleno!\n");
                }
            }
        }
    }else{
        printf("Os valores nao formam um triangulo!\n");
    }
}