/*
Escreva um algoritmo que determine o número de dias que uma pessoa já viveu.
Considere que um mês tenha 30 dias.

SINTESE
    ENTRADA: dataNascimento
    PROCESSAMENTO: calcular dias em que a pessoa viveu
    SAIDA: total de dias em que a pessoa viveu

*/

#include <stdio.h>

#define qtdDiasMes 30

int main(){

    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int diaHoje;
    int totalDias;

    printf("Digite o dia em que voce nasceu: ");
    scanf("%d", &diaNascimento);

    printf("Digite o mes em que voce nasceu: ");
    scanf("%d", &mesNascimento);

    printf("Digite o ano em que voce nasceu: ");
    scanf("%d", &anoNascimento);

    printf("Digite o dia de hoje: ");
    scanf("%d", &diaHoje);

    totalDias = ((2025 - anoNascimento) * 365) + ((mesNascimento - 1) * 30) + (diaHoje - diaNascimento -30);


    

    printf("%d\n", totalDias);

}