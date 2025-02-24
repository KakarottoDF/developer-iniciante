/*
Faça um algoritmo que leia dois valores para as variáveis A e B e efetue a troca
dos valores de forma que a variável A passe a possuir o valor da variável B e a
variável B passe a possuir o valor da variável A. Apresente os valores trocados

SINTESE
    ENTRADA: Ler A e B
    PROCESSAMENTO: Troca dos valores
    SAIDA: A e B
*/

#include <stdio.h>

int main(){

    int A = 0;
    int B = 0;
    int C = 0;

    printf("Digite o valor de A:\n");
    scanf("%d", &A);

    printf("Digite o valor de B:\n");
    scanf("%d", &B);

    C = A;
    A = B;
    B = C;

    printf("Novo valor de A = %d.\n", A);
    printf("Novo valor de B = %d.\n", B);

}
