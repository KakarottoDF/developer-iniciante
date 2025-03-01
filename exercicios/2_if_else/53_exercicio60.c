/*
O cardápio de uma lanchonete é o seguinte:
Especificação Preço unitário
100 Cachorro quente 1,10
101 Bauru simples 1,30
102 Bauru c/ovo 1,50
103 Hamburger 1,10
104 Cheeseburger 1,30
105 Refrigerante 1,00
Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule
o valor a ser pago por aquele lanche. Considere que a cada execução somente
será calculado um item.

SINTESE
    ENTRADA: CODIGODEALGUMITEM, quantidadeDoItem
    PROCESSAMENTO: valorASerPago
    SAIDA: valorASerPago
*/

#include <stdio.h>
#define CODIGO_CACHORRO_QUENTE 100
#define VALOR_CACHORRO_QUENTE 1.10
#define CODIGO_BAURU_SIMPLES 101
#define VALOR__BAURU_SIMPLES 1.30
#define CODIGO_BAURU_COM_OVO 102
#define VALOR_BAURU_COM_OVO 1.50
#define CODIGO_HAMBURGUER 103
#define VALOR_HAMBURGUER 1.10
#define CODIGO_CHEESEBURGUER 104
#define VALOR_CHEESEBURGUER 1.30
#define CODIGO_REFRIGERANTE 105
#define VALOR_REFRIGERANTE 1.00

int main(){

    int codigoItem;
    int quantidade;
    float valorASerPago = 0;

    printf("Digite o codigo do item:  (%d, %d, %d, %d, %d ou %d): ", CODIGO_CACHORRO_QUENTE, CODIGO_BAURU_SIMPLES, CODIGO_BAURU_COM_OVO, CODIGO_HAMBURGUER, CODIGO_CHEESEBURGUER, CODIGO_REFRIGERANTE);
    scanf("%d", &codigoItem);

    if(codigoItem != CODIGO_CACHORRO_QUENTE && codigoItem != CODIGO_BAURU_SIMPLES && codigoItem != CODIGO_BAURU_COM_OVO && codigoItem != CODIGO_HAMBURGUER && codigoItem != CODIGO_CHEESEBURGUER && codigoItem != CODIGO_REFRIGERANTE){
        printf("Codigo Invalido! Compra Encerrada.");
        return 0;
    }

    printf("Digite a quantidade deste item: ");
    scanf("%d", &quantidade);

    if (codigoItem == CODIGO_CACHORRO_QUENTE){
        valorASerPago = VALOR_CACHORRO_QUENTE * quantidade;
        printf("O valor de %d Cachorro Quente a ser pago sera de R$ %.2f", quantidade, valorASerPago);
    }else{
        if(codigoItem == CODIGO_BAURU_SIMPLES){
            valorASerPago = VALOR__BAURU_SIMPLES * quantidade;
            printf("O valor de %d Bauru Simples a ser pago sera de R$ %.2f", quantidade, valorASerPago);
        }else{
            if(codigoItem == CODIGO_BAURU_COM_OVO){
                valorASerPago = VALOR_BAURU_COM_OVO * quantidade;
                printf("O valor de %d Bauru com Ovo a ser pago sera de R$ %.2f", quantidade, valorASerPago);
            }else{
                if(codigoItem == CODIGO_HAMBURGUER){
                    valorASerPago = VALOR_HAMBURGUER * quantidade;
                    printf("O valor de %d Hamburguer a ser pago sera de R$ %.2f", quantidade, valorASerPago);
                }else{
                    if(codigoItem == CODIGO_CHEESEBURGUER){
                        valorASerPago = VALOR_CHEESEBURGUER * quantidade;
                        printf("O valor de %d Cheeseburguer a ser pago sera de R$ %.2f", quantidade, valorASerPago);
                    }else{
                        if(codigoItem == CODIGO_REFRIGERANTE){
                            valorASerPago = VALOR_REFRIGERANTE * quantidade;
                            printf("O valor de %d Refrigerante a ser pago sera de R$ %.2f", quantidade, valorASerPago);
                        }
                    }
                }
            }
        }
    }
}