/*

Admitindo que uma data é lida pelo algoritmo em uma variável inteira, e não em
uma variável do tipo data, crie um algoritmo que leia uma data no formato
DDMMAA e imprima essa data no formato AAMMDD, onde:
• A letra D corresponde a dois algarismos representando o dia;
• A letra M corresponde a dois algarismos representando o mês;
• A letra A corresponde aos dois últimos algarismos representando o ano.

SINTESE
    ENTRADA: data
    PROCESSAMENTO: ((((data / 10) %10 * 10) + (data % 10)) * 10000) + ((((data / 1000) %10 * 10) + (data /100 % 10)) * 100) + (((data / 100000) %10 * 10) + (data /10000 % 10))
    SAIDA: dataEmOutroFormato

*/

#include <stdio.h>

int main(){
    int data = 0;
    int dataEmOutroFormato = 0;
    
    printf("Digite uma data no formato DDMMAA:\n");
    scanf("%d", &data);

    dataEmOutroFormato = 
    ((((data / 10) %10 * 10) + (data % 10)) * 10000) + 
    ((((data / 1000) %10 * 10) + (data /100 % 10)) * 100) + 
    (((data / 100000) %10 * 10) + (data /10000 % 10));

    printf("A data no formato AAMMDD = %d.\n", dataEmOutroFormato);
    
}