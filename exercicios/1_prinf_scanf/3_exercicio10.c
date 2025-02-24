/*Faça um algoritmo que:
a) Leia um número inteiro;
b) Leia um segundo número inteiro;
c) Efetue a adição dos dois valores;
d) Apresente o valor calculado*/

#include <stdio.h>

int main(){
    int primeiroNumero;
    int segundoNumero;
    int adicao;

    printf("Digite o valor do primeiro numero:\n");
    scanf("%d", &primeiroNumero);

    printf("Digite o valor do segundo numero:\n");
    scanf("%d", &segundoNumero);

    adicao = primeiroNumero + segundoNumero;

    printf("O resultado desta adicao e igua a %d.", adicao);
}
