/*
Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé do tipo 1 é
vendido por R$ 0.50, o do tipo 2 por R$ 0.60 e o do tipo 3 por R$ 0.75, faça um
algoritmo que, para cada tipo de picolé, mostre a quantidade vendida e o total
arrecadado.

SINTESE
    ENTRADA: tipoPicole, quantidadeVendida
    PROCESSAMENTO: totalArrecadado
    SAIDA: quantidadeVendida e totalArrecadado
*/

#include <stdio.h>

int main(){
    
    int tipoPicole;
    int quantidadeVendida;
    float totalArrecadado = 0.0;

    printf("Qual e o tipo do picole que voce deseja comprar? (1, 2 ou 3)\n");
    scanf("%d", &tipoPicole);

    printf("Quantos picoles voce deseja comprar?\n");
    scanf("%d", &quantidadeVendida);

    if(tipoPicole == 1){
        totalArrecadado = quantidadeVendida * 0.50;
        printf("Voce comprou %d picole(s) do tipo %d e o total arrecadado foi de R$ %.2f\n", quantidadeVendida, tipoPicole, totalArrecadado);
    }else{
        if(tipoPicole == 2){
            totalArrecadado = quantidadeVendida * 0.60;
            printf("Voce comprou %d picole(s) do tipo %d e o total arrecadado foi de R$ %.2f\n", quantidadeVendida, tipoPicole, totalArrecadado);
        }else{
            if(tipoPicole == 3){
                totalArrecadado = quantidadeVendida * 0.75;
                printf("Voce comprou %d picole(s) do tipo %d e o total arrecadado foi de R$ %.2f\n", quantidadeVendida, tipoPicole, totalArrecadado);
            }
        }
    }
}