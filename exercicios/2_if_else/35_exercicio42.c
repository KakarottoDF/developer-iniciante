/*
Uma pessoa comprou quatro artigos em uma loja. Para cada artigo, tem-se
nome, preço e percentual de desconto. Faça um algoritmo que imprima nome,
preço e preço com desconto de cada artigo e o total a pagar.

SINTESE
    ENTRADA: nomeProduto, preco, percentualDeDesconto
    PROCESSAMENTO: totalDesconto, totalAPagar
    SAIDA: nome,preço, precoComDesconto e totalAPagar
*/

#include <stdio.h>

int main(){

    char nomeProduto[50];
    float preco;
    int percentualDeDesconto;
    float precoComDesconto;
    float totalAPagar;

    printf("Digite o nome do produto:\n");
    fgets(nomeProduto, sizeof(nomeProduto), stdin);

    printf("Qual e o preco deste produto? R$ ");
    scanf("%f", preco);

    printf("Qual e o percentual de desconto deste produto?\n");
    scanf("%d", percentualDeDesconto);

    //ESTE EXERCÍCIO NÃO SERIA MAIS APROPRIADO COM O FOR?
    
}