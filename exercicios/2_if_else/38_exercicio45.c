/*

Escreva um algoritmo que, para uma conta bancária, leia o seu número, o saldo,
o tipo de operação a ser realizada (depósito ou retirada) e o valor da operação.
Após, determine e mostre o novo saldo. Se o novo saldo ficar negativo, deve ser
mostrada, também, a mensagem “conta estourada”.

SINTESE
    ENTRADA: numeroDaConta, saldo, tipoOperacao, valorOperacao
    PROCESSAMENTO: novoSaldo
    SAIDA: novoSaldo e mensagemContaEstourada

*/

#include <stdio.h>

int main(){
    
    int numeroDaConta;
    float saldo;
    char tipoOperacao;
    float valorOperacao;
    float novoSaldo = 0;

    printf("Digite o numero da sua conta:\n");
    scanf("%d", &numeroDaConta);

    printf("Digite o saldo da sua conta:\n");
    scanf("%f", &saldo);

    printf("Digite o tipo de operacao que deseja realizar (D para deposito e R para retirada):\n");
    scanf(" %c", &tipoOperacao);

    printf("Digite o valor da operacao:\n");
    scanf("%f", &valorOperacao);

    if(tipoOperacao == 'D'){
        novoSaldo = saldo + valorOperacao;
        printf("O novo saldo da conta %d e de R$ %.2f\n", numeroDaConta, novoSaldo);
    }else{
        if(tipoOperacao == 'R'){
            novoSaldo = saldo - valorOperacao;
            if(novoSaldo < 0){
                printf("O novo saldo da conta %d e de R$ %.2f. Conta estourada!\n", numeroDaConta, novoSaldo);
            }else{
                printf("O novo saldo da conta %d e de R$ %.2f\n", numeroDaConta, novoSaldo);
            }
        }
    }
}