#include <stdio.h>

#define DEZREAIS 15
#define CEMREAIS 2
#define UMREAL 50

int main()
{
    int umReal = UMREAL;
    int dezReais = DEZREAIS;
    int cemReais = CEMREAIS;
    int valorCompra = 0;
    int valorPagamento = 0;
    int valorTroco = 0;

    printf("Você tem em caixa agora:\n");
    printf("%d notas de um real.\n", umReal);
    printf("%d notas de dez reais.\n", dezReais);
    printf("%d notas de cem reais.\n", cemReais);

    printf("Digite qual é o valor da compra: R$ ");
    scanf("%d", &valorCompra);

    printf("Digite qual é o valor que você está pagando: R$ ");
    scanf("%d", &valorPagamento);

    valorTroco = valorPagamento - valorCompra;

    if (valorTroco < 0)
    {
        printf("Você não tem dinheiro para realizar a compra!\n");
        return 0;
    }

    if (valorTroco > 400)
    {
        printf("Não temos troco suficiente.\nCompra cancelada!\n");
        return 0;
    }

    printf("A sua compra foi de R$ %d.\n", valorCompra);
    printf("Seu troco será de R$ %d.\n\n", valorTroco);

    int notasCem = valorTroco / 100;
    if (notasCem > cemReais)
    {
        notasCem = cemReais;
    }
    valorTroco = valorTroco - (notasCem * 100);

    int notasDez = valorTroco / 10;
    if (notasDez > dezReais)
    {
        notasDez = dezReais;
    }
    valorTroco = valorTroco - (notasDez * 10);

    int notasUm = valorTroco;
    if (notasUm > umReal)
    {
        notasUm = umReal;
    }
    valorTroco = valorTroco - notasUm;

    umReal = umReal - notasUm;
    dezReais = dezReais - notasDez;
    cemReais = cemReais - notasCem;

    printf("Você tinha em caixa:\n");
    printf("%d notas de 100 reais.\n", notasCem);
    printf("%d notas de 10 reais.\n", notasDez);
    printf("%d notas de 1 real.\n", notasUm);

    printf("\nVocê tem em caixa agora:\n");
    printf("%d notas de um real.\n", umReal);
    printf("%d notas de dez reais.\n", dezReais);
    printf("%d notas de cem reais.\n", cemReais);
}
