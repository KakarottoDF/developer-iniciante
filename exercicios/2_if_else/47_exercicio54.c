/*

Faça um algoritmo que leia quatro números (Opção , Num1 , Num2 e Num3) e
mostre o valor de Num1 se Opção for igual a 2; o valor de Num2 se Opção for
igual a 3; e o valor de Num3 se Opção for igual a 4. Os únicos valores possíveis
para a variável Opção são 2, 3 e 4.

SINTESE
    ENTRADA: opcao , num1 , num2 e num3
    PROCESSAMENTO: verificar se a opção é válida e se for, mostrar o número correto
    SAIDA: num1 ou num2 ou num3

*/


#include <stdio.h>

int main(){

    int num1;
    int num2;
    int num3;
    int opcao;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &num1);

    printf("Digite o segundo numero:\n");
    scanf("%d", &num2);

    printf("Digite o terceiro numero:\n");
    scanf("%d", &num3);

    printf("Digite a opcao (2 ou 3 ou 4):\n");
    scanf("%d", &opcao);

    if(opcao == 2){
        printf("Nesta opcao o numero que voce digitou foi o primeiro: %d\n\n", num1);
        }else{
            if(opcao == 3){
                printf("Nesta opcao o numero que voce digitou foi o segundo: %d\n\n", num2);
                }else{
                    if (opcao == 4){
                        printf("Nesta opcao o numero que voce digitou foi o terceiro: %d\n\n", num3);
                        }else{
                            printf("Opcao invalida! Programa encerrado.");
                    }
                }
            }

}