/*

Uma empresa produz três tipos de peças mecânicas: parafusos, porcas e
arruelas. Têm-se os preços unitários de cada tipo de peça e sabe-se que sobre
estes preços incidem descontos de 10% para porcas, 20% para parafusos e 30%
para arruelas. Escreva um algoritmo que calcule o valor total da compra de um
cliente. Deve ser mostrado o nome do cliente. O número de cada tipo de peça
que o mesmo comprou, o total de desconto e o total a pagar pela compra.

SINTESE
    ENTRADA: nomeCliente, tipoDePeca, quantidadeDeParafusos, quantidadeDePorcas, quantidadeDeArruelas.
    PROCESSAMENTO: valorTotal
    SAIDA: nomeCliente. O número de cada tipo de peça que o mesmo comprou, o total de desconto e o total a pagar pela compra.

*/

#include <stdio.h>
#define PARAFUSO 10
#define CODIGO_PARAFUSO 1014
#define PORCA 20
#define CODIGO_PORCA 1015
#define ARRUELA 30
#define CODIGO_ARRUELA 1016

int main(){

    char nomeCliente[30];
    int quantidadeDeParafusos;
    int valorParafusos = PARAFUSO;
    int descontoParafuso;
    int quantidadeDePorcas;
    int valorPorcas = PORCA;
    int descontoPorca;
    int quantidadeDeArruelas;
    int valorArruelas = ARRUELA;
    int descontoArruela;
    int totalDesconto;
    int totalAPagar;


    printf("Digite seu primeiro nome:\n");
    fgets(nomeCliente, sizeof(nomeCliente), stdin);

    printf("Quantos parafusos o(a) senhor(a) vai querer?\n");
    scanf("%d", &quantidadeDeParafusos);

    printf("Quantas Porcas o(a) senhor(a) vai querer?\n");
    scanf("%d", &quantidadeDePorcas);

    printf("Quantas Arruelas o(a) senhor(a) vai querer?\n");
    scanf("%d", &quantidadeDeArruelas);

    if(quantidadeDeParafusos > 0){
        valorParafusos = (quantidadeDeParafusos * valorParafusos);
        descontoParafuso = valorParafusos * 0.20;
        valorParafusos = valorParafusos - descontoParafuso;
    }

    if(quantidadeDePorcas > 0){
        valorPorcas = (quantidadeDePorcas * valorPorcas);
        descontoPorca = valorPorcas * 0.10;
        valorPorcas = valorPorcas - descontoPorca;
    }

    if(quantidadeDeArruelas > 0){
        valorArruelas = (quantidadeDeArruelas * valorArruelas);
        descontoArruela = valorArruelas * 0.20;
        valorArruelas = valorArruelas - descontoArruela;
    }

    totalAPagar = valorParafusos + valorPorcas + valorArruelas;

    printf("VALOR TOTAL SEM DESCONTO R$ %d\n\n", totalAPagar);

    totalDesconto = descontoParafuso + descontoPorca + descontoArruela;
    totalAPagar = valorParafusos + valorPorcas + valorArruelas - totalDesconto;

    printf("CLIENTE: %s\n", nomeCliente);
    printf("NUMERO PARAFUSO: %d\n", CODIGO_PARAFUSO);
    printf("NUMERO PORCA: %d\n", CODIGO_PORCA);
    printf("NUMERO ARRUELA: %d\n", CODIGO_ARRUELA);
    printf("TOTAL DESCONTO R$: %d\n", totalDesconto);
    printf("TOTAL A PAGAR R$: %d\n\n", totalAPagar);

}