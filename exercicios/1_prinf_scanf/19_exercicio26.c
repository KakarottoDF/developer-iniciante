/*

Considere a seguinte situação: descontam-se inicialmente 10% do salário bruto
do trabalhador como contribuição à previdência social. Após esse desconto, há
um outro desconto de 5% sobre o valor restante do salário bruto, a título de um
determinado imposto. Faça um algoritmo que leia o salário bruto de um cidadão e
imprima o seu salário líquido.

SINTESE
    ENTRADA: salarioBruto
    PROCESSAMENTO: (salarioBruto - (salarioBruto * 0.10)) - (salarioBruto * 0.05)
    SAIDA: salarioLiquido

*/

#include <stdio.h>

int main(){
    float salarioBruto = 0;
    float salarioLiquido = 0;

    printf("Digite o valor de seu salário bruto:\n");
    printf("R$:");
    scanf("%f", &salarioBruto);

    salarioLiquido = (salarioBruto - (salarioBruto * 0.10)) - (salarioBruto * 0.05);

    printf("O seu salario liquido e de R$ %.2f.\n", salarioLiquido);
}