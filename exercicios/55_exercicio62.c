/*
Um banco concederá um crédito especial aos seus clientes, variável com o saldo
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e
calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem
informando o saldo médio e o valor do crédito.
Saldo médio Percentual
de 0 a 200 nenhum crédito
de 201 a 400 20% do valor do saldo médio
de 401 a 600 30% do valor do saldo médio
acima de 601 40% do valor do saldo médio

SINTESE
    ENTRADA: saldoMedio
    PROCESSAMENTO: valorDoCredito
    SAIDA: saldoMedio, valorDoCreditoa
*/

#include <stdio.h>

int main(){

    float saldoMedio;
    float valorDoCredito = 0;

    printf("Digite o saldo medio do cliente: ");
    scanf("%f", &saldoMedio);

    if(saldoMedio >= 0 && saldoMedio <= 200){
        printf("Saldo medio: %.2f\n", saldoMedio);
        printf("Nenhum credito disponivel.");
    }else{
        if(saldoMedio >= 201 && saldoMedio <= 400){
            valorDoCredito = saldoMedio * 0.20;
            printf("Saldo medio: %.2f\n", saldoMedio);
            printf("Valor do credito: %.2f", valorDoCredito);
        }else{
            if(saldoMedio >= 401 && saldoMedio <= 600){
                valorDoCredito = saldoMedio * 0.30;
                printf("Saldo medio: %.2f\n", saldoMedio);
                printf("Valor do credito: %.2f", valorDoCredito);
            }else{
                if(saldoMedio > 600){
                    valorDoCredito = saldoMedio * 0.40;
                    printf("Saldo medio: %.2f\n", saldoMedio);
                    printf("Valor do credito: %.2f", valorDoCredito);
                }
            }
        }
    }
}