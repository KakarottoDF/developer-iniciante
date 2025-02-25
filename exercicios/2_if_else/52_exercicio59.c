/*
Faça um algoritmo que leia um número inteiro e mostre uma mensagem
indicando se este número é par ou ímpar e se é positivo ou negativo.

SINTESE
    ENTRADA: numero
    PROCESSAMENTO: validar se é par ou ímpar e se é negativo ou positivo
    SAIDA: este número é par ou ímpar e é positivo ou negativo
*/

#include <stdio.h>

int main()
{

    int numero;

    printf("Digite um numero inteiro:\n");
    scanf("%d", &numero);

    if (numero % 2 == 0 && numero >= 0){
        printf("Este numero e par e e positivo!\n\n");
        }else{
            if(numero % 2 == 1 && numero >= 0){
                printf("Este numero e impar e e positivo!\n\n");
            }else{
                if (numero % -2 == 0 && numero < 0){
                    printf("Este numero e par e e negativo!\n\n");
                    }else{
                        printf("Este numero e impar e e negativo!\n\n");
                        }
                }
            }
}