/*
Uma empresa de vendas tem três corretores. A empresa paga ao corretor uma
comissão calculada de acordo com o valor de suas vendas. Se o valor da venda
de um corretor for maior que R$ 50.000.00 a comissão será de 12% do valor
vendido. Se o valor da venda do corretor estiver entre R$ 30.000.00 e R$
50.000.00 (incluindo extremos) a comissão será de 9.5%. Em qualquer outro
caso, a comissão será de 7%. Escreva um algoritmo que gere um relatório
contendo nome, valor da venda e comissão de cada um dos corretores. O
relatório deve mostrar também o total de vendas da empresa.

SINTESE
    ENTRADA: valorDaVenda, totalDeVendas
    PROCESSAMENTO: verificar valor da venda e calcular a comissão
    SAIDA: nome, valor da venda, comissão de cada um dos corretores e total de vendas da empresa

*/

#include <stdio.h>

int main(){

    char primeiroCorretor[10];
    char segundoCorretor[10];
    char terceiroCorretor[10];
    float valorDaVendaDoPrimeiroCorretor = 0.0;
    float valorDaVendaDoSegundoCorretor = 0.0;
    float valorDaVendaDoTerceiroCorretor = 0.0;
    float comissaoPrimeiroCorretor = 0.0;
    float comissaoSegundoCorretor = 0.0;
    float comissaoTerceiroCorretor = 0.0;
    float totalDeVendas = 0.0;

    printf("Digite o nome do primeiro corretor:\n");
    scanf("%s", &primeiroCorretor);

    printf("Digite o valor da venda do(a) %s:\n");
    scanf("%f", &valorDaVendaDoPrimeiroCorretor);

    printf("Digite o nome do segundo corretor:\n");
    scanf("%s", &segundoCorretor);

    printf("Digite o valor da venda do(a) %s:\n");
    scanf("%f", &valorDaVendaDoSegundoCorretor);

    printf("Digite o nome do terceiro corretor:\n");
    scanf("%s", &terceiroCorretor);

    printf("Digite o valor da venda do(a) %s:\n");
    scanf("%f", &valorDaVendaDoTerceiroCorretor);

    if(valorDaVendaDoPrimeiroCorretor > 50.000 || valorDaVendaDoSegundoCorretor > 50.000 || valorDaVendaDoTerceiroCorretor > 50.000){
        comissaoPrimeiroCorretor = valorDaVendaDoPrimeiroCorretor * 0.12;
        comissaoSegundoCorretor = valorDaVendaDoSegundoCorretor * 0.12;
        comissaoTerceiroCorretor = valorDaVendaDoTerceiroCorretor * 0.12;
    }else if(valorDaVendaDoPrimeiroCorretor > 30.000 && valorDaVendaDoPrimeiroCorretor <= 50.000 || valorDaVendaDoSegundoCorretor > 30.000 && valorDaVendaDoPrimeiroCorretor <= 50.000 || valorDaVendaDoTerceiroCorretor > 30.000 && valorDaVendaDoPrimeiroCorretor <= 50.000){
        comissaoPrimeiroCorretor = valorDaVendaDoPrimeiroCorretor * 0.095;
        comissaoSegundoCorretor = valorDaVendaDoSegundoCorretor * 0.095;
        comissaoTerceiroCorretor = valorDaVendaDoTerceiroCorretor * 0.095;
    }else{
        comissaoPrimeiroCorretor = valorDaVendaDoPrimeiroCorretor * 0.07;
        comissaoSegundoCorretor = valorDaVendaDoSegundoCorretor * 0.07;
        comissaoTerceiroCorretor = valorDaVendaDoTerceiroCorretor * 0.07;
    }

    totalDeVendas = valorDaVendaDoPrimeiroCorretor + valorDaVendaDoSegundoCorretor + valorDaVendaDoTerceiroCorretor;


    printf("------------------------------- RELATORIO -------------------------------\n");
    printf("NOME: %s\n", primeiroCorretor);
    printf("VALOR DA VENDA: R$ %.3f\n", valorDaVendaDoPrimeiroCorretor);
    printf("COMISSAO: R$ %.3f\n\n", comissaoPrimeiroCorretor);
    printf("NOME: %s\n", segundoCorretor);
    printf("VALOR DA VENDA: R$ %.3f\n", valorDaVendaDoSegundoCorretor);
    printf("COMISSAO: R$ %.3f\n\n", comissaoSegundoCorretor);
    printf("NOME: %s\n", terceiroCorretor);
    printf("VALOR DA VENDA: R$ %.3f\n", valorDaVendaDoTerceiroCorretor);
    printf("COMISSAO: R$ %.3f\n", comissaoTerceiroCorretor);
    printf("-------------------------------------------------------------------------\n");
    printf("TOTAL DE VENDAS DA EMPRESA: R$ %.3f", totalDeVendas);
}