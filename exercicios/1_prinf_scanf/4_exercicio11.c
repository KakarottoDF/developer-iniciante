/*Faça um algoritmo que:
a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
b) Obtenha o valor para a variável VH (valor hora trabalhada):
c) Obtenha o valor para a variável PD (percentual de desconto);
d) Calcule o salário bruto => SB = HT * VH;
e) Calcule o total de desconto => TD = (PD/100)*SB;
f) Calcule o salário líquido => SL = SB – TD;
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
Liquido.*/

#include <stdio.h>
//#include <Windows.h>

int main(){
    /*Estou fazendo o que o exercício pede, porém se fosse para eu fazer doo meu jeito, colocaria
    variáveis como horasTrabalhadas ou valorHora...*/
    float HT,VH,PD;
    double SB, TD, SL;

    printf("Digite o total de suas horas trabalhadas no mes:\n");
    scanf("%f", &HT);

    printf("Digite o valor da hora trabalhada:\n");
    scanf("%f", &VH);

    printf("Digite o percentual de desconto:\n");
    scanf("%f", &PD);

    SB = HT * VH;
    TD = (PD/100)*SB;
    SL = SB - TD;

    // printf("Gerando relatorio:\n");
    // Sleep(2000);

    printf("Voce possui %.2f horas trabalhadas no mes.\n", HT);
    printf("Voce ira receber R$ %.2f de salario bruto.\n", SB);
    printf("Houve um desconto de %.0f%%.\n", PD);
    printf("Seu salario liquido sera de R$ %.2f.", SL);
}
