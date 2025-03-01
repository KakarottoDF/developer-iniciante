/*
Crie um algoritmo que calcula o desconto previdenciário de um funcionário. Dado
um salário, o programa deve retornar o valor do desconto proporcional ao
mesmo. O cálculo segue a regra: o desconto é de 11% do valor do salário,
entretanto, o valor máximo de desconto é 318,20. Sendo assim, ou o algoritmo
retorna o valor equivalente a 11% sobre o salário ou 318,20.

SINTESE
    ENTRADA: salarioFuncionario
    PROCESSAMENTO: descontoPrevidenciario
    SAIDA: descontoPrevidenciario
*/

#include <stdio.h>

int main(){

    float salarioFuncionario;
    float descontoPrevidenciario;

    printf("Informe o salario do funcionario: ");
    scanf("%f", &salarioFuncionario);

    if(salarioFuncionario * 0.11 > 318.20){
        descontoPrevidenciario = 318.20;
    }else{
        descontoPrevidenciario = salarioFuncionario * 0.11;
    }

    printf("O desconto previdenciario sera de R$ %.2f\n", descontoPrevidenciario);
    

        
}