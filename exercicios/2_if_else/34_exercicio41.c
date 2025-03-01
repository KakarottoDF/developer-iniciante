/*
A revendedora de carros Pica-Pau Ltda. paga aos seus funcionários vendedores
dois salários mínimos fixos, mais uma comissão fixa de R$ 50,00 por carro
vendido e mais 5% do valor das vendas. Faça um algoritmo que determine o
salário total de um vendedor.

SINTESE
    ENTRADA: quantidadeDeCarroVendidos
    PROCESSAMENTO: valorDasVendas
    SAIDA: salarioTotalDoVendedor

*/

#include <stdio.h>

#define SALARIO_MINIMO 1518 * 2
#define COMISSAO 50
#define VALOR_CARRO 100000
#define PORCENTAGEM_VALOR_VENDA 0.05

int main(){

    int quantidadeDeCarrosVendidos;
    int valorDasVendas;
    int salarioTotalDoVendedor;

    printf("Digite a quantidade de carros que você vendeu:\n");
    scanf("%d", &quantidadeDeCarrosVendidos);

    if(quantidadeDeCarrosVendidos <= 0){
        printf("Voce nao vendeu nenhum carro!\n\n");
        return 0;
    }else{
        valorDasVendas = (VALOR_CARRO * quantidadeDeCarrosVendidos) * PORCENTAGEM_VALOR_VENDA;
        salarioTotalDoVendedor = SALARIO_MINIMO + (COMISSAO * quantidadeDeCarrosVendidos) + valorDasVendas;
    }

    printf("O salario totoal do vendedor sera de R$ %d\n\n", salarioTotalDoVendedor);
    
}