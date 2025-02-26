/*
Crie o algoritmo Funcionario para calcular o aumento salarial de um empregado.
Por padrão, o aumento será de 15%. Entretanto, deve ser aplicada uma regra
diferente para cada faixa salarial. Regras:
a) se 1.500,00 <= salarioAtual < 1.750,00: aumento igual a 12%
b) se 1.750,00 <= salarioAtual < 2.000,00: aumento igual a 10%
c) se 2.000,00 <= salarioAtual < 3.000,00: aumento igual a 7%
d) se salarioAtual acima de 3.000,00: aumento igual a 5%.

SINTESE
    ENTRADA: salarioEmpregado
    PROCESSAMENTO: aumentoSalarial
    SAIDA: aumentoSalarial
*/

#include <stdio.h>

int main(){

    float salarioEmpregado;
    float aumentoSalarial;

    printf("Informe o salario do empregado: ");
    scanf("%f", &salarioEmpregado);

    if(salarioEmpregado >= 1500 && salarioEmpregado < 1750){
        aumentoSalarial = salarioEmpregado * 0.12;
    }else{ 
        if(salarioEmpregado >= 1750 && salarioEmpregado < 2000){
        aumentoSalarial = salarioEmpregado * 0.10;
        }else{
            if(salarioEmpregado >= 2000 && salarioEmpregado < 3000){
                aumentoSalarial = salarioEmpregado * 0.07;
            }else{
                if(salarioEmpregado >= 3000){
                    aumentoSalarial = salarioEmpregado * 0.05;
                }else{
                    aumentoSalarial = salarioEmpregado * 0.15;
                }
            }
        }
    }
    printf("O aumento salarial sera de R$ %.2f\n", aumentoSalarial);
}