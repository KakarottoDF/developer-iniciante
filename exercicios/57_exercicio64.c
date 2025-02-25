/*
Um vendedor precisa de um algoritmo que calcule o preço total devido por um
cliente. O algoritmo deve receber o código de um produto e a quantidade
comprada e calcular o preço total, usando a tabela abaixo. Mostre uma
mensagem no caso de código inválido.
Código Preço Unitário
'ABCD' R$ 5,30
'XYPK' R$ 6,00
'KLMP' R$ 3,20
'QRST' R$ 2,50

SINTESE
    ENTRADA: codigoDoProduto, quantidadeComprada
    PROCESSAMENTO: precoTotal
    SAIDA: precoTotal
*/

#include <stdio.h>
#define CODIGO_ABCD "ABCD"
#define CODIGO_XYPK "XYPK"
#define CODIGO_KLMP "KLMP"
#define CODIGO_QRST "QRST"
#define PRECO_ABCD 5.30
#define PRECO_XYPK 6.00
#define PRECO_KLMP 3.20
#define PRECO_QRST 2.50

int main(){

    char codigoDoProduto[5];
    int quantidadeComprada;
    float precoTotal = 0;

    printf("Digite o codigo do produto:  (%s, %s, %s, %s): ", CODIGO_ABCD, CODIGO_XYPK, CODIGO_KLMP, CODIGO_QRST);
    scanf("%s", codigoDoProduto);

    if(strcmp(codigoDoProduto, CODIGO_ABCD) != 0 && strcmp(codigoDoProduto, CODIGO_XYPK) != 0 && strcmp(codigoDoProduto, CODIGO_KLMP) != 0 && strcmp(codigoDoProduto, CODIGO_QRST) != 0){
        printf("Codigo Invalido! Compra Encerrada.");
        return 0;
    }

    printf("Digite a quantidade deste produto: ");
    scanf("%d", &quantidadeComprada);

    if (strcmp(codigoDoProduto, CODIGO_ABCD) == 0){
        precoTotal = PRECO_ABCD * quantidadeComprada;
        printf("O valor de %d produto(s) %s a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_ABCD, precoTotal);
    }else{
        if(strcmp(codigoDoProduto, CODIGO_XYPK) == 0){
            precoTotal = PRECO_XYPK * quantidadeComprada;
            printf("O valor de %d produto(s) %s a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_XYPK, precoTotal);
        }else{
            if(strcmp(codigoDoProduto, CODIGO_KLMP) == 0){
                precoTotal = PRECO_KLMP * quantidadeComprada;
                printf("O valor de %d produto(s) %s a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_KLMP, precoTotal);
            }else{
                if(strcmp(codigoDoProduto, CODIGO_QRST) == 0){
                    precoTotal = PRECO_QRST * quantidadeComprada;
                    printf("O valor de %d produto(s) %s a ser pago sera de R$ %.2f", quantidadeComprada, CODIGO_QRST, precoTotal);
                }
            }
        }
    }
}