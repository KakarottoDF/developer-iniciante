/*
Um vendedor necessita de um algoritmo que calcule o preço total devido por um
cliente. O algoritmo deve receber o código de um produto e a quantidade
comprada e calcular o preço total, usando a tabela abaixo:
Código do produto Preço unitário
1001 5,32
1324 6,45
6548 2,37
0987 5,32
7623 6,45

SINTESE
    ENTRADA: codigoDoProduto, quantidadeComprada
    PROCESSAMENTO: precoTotal
    SAIDA: precoTotal

*/

#include <stdio.h>
#define CODIGO_1001 1001
#define CODIGO_1324 1324
#define CODIGO_6548 6548
#define CODIGO_0987 987
#define CODIGO_7623 7623
#define PRECO_1001 5.32
#define PRECO_1324 6.45
#define PRECO_6548 2.37
#define PRECO_0987 5.32
#define PRECO_7623 6.45

int main(){

    int codigoDoProduto;
    int quantidadeComprada;
    float precoTotal = 0;

    printf("Digite o codigo do produto:  (%d, %d, %d, %d ou %d): ", CODIGO_1001, CODIGO_1324, CODIGO_6548, CODIGO_0987, CODIGO_7623);
    scanf("%d", &codigoDoProduto);

    if(codigoDoProduto != CODIGO_1001 && codigoDoProduto != CODIGO_1324 && codigoDoProduto != CODIGO_6548 && codigoDoProduto != CODIGO_0987 && codigoDoProduto != CODIGO_7623){
        printf("Codigo Invalido! Compra Encerrada.");
        return 0;
    }

    printf("Digite a quantidade deste produto: ");
    scanf("%d", &quantidadeComprada);

    if (codigoDoProduto == CODIGO_1001){
        precoTotal = PRECO_1001 * quantidadeComprada;
        printf("O valor de %d produto(s) %d a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_1001, precoTotal);
    }else{
        if(codigoDoProduto == CODIGO_1324){
            precoTotal = PRECO_1324 * quantidadeComprada;
            printf("O valor de %d produto(s) %d a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_1324, precoTotal);
        }else{
            if(codigoDoProduto == CODIGO_6548){
                precoTotal = PRECO_6548 * quantidadeComprada;
                printf("O valor de %d produto(s) %d a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_6548, precoTotal);
            }else{
                if(codigoDoProduto == CODIGO_0987){
                    precoTotal = PRECO_0987 * quantidadeComprada;
                    printf("O valor de %d produto(s) %d a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_0987, precoTotal);
                }else{
                    if(codigoDoProduto == CODIGO_7623){
                        precoTotal = PRECO_7623 * quantidadeComprada;
                        printf("O valor de %d produto(s) %d a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_7623, precoTotal);
                    }
                }
            }
        }
    }
}