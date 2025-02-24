/*

Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de
serviços é de:
• R$ 5.50 por diária, se o número de diárias for maior que 15;
• R$ 6.00 por diária, se o número de diárias for igual a 15;
• R$ 8.00 por diária, se o número de diárias for menor que 15.
Construa um algoritmo que mostre o nome e o total da conta de um cliente.

SINTESE
    ENTRADA: nomeDoCliente, numeroDeDiarias
    PROCESSAMENTO: totalConta
    SAIDA: nomeDoCliente e totalConta

*/

#include <stdio.h>

int main(){
    
    char nomeDoCliente[50];
    int numeroDeDiarias;
    float totalConta = 0.0;

    printf("Digite o seu nome:\n");
    fgets(nomeDoCliente, sizeof(nomeDoCliente), stdin);

    printf("Quantas diarias voce deseja?\n");
    scanf("%d", &numeroDeDiarias);

    if(numeroDeDiarias > 15){
        totalConta = (numeroDeDiarias * 60.00) + (numeroDeDiarias * 5.50);
        printf("Ola %s. O total da sua conta e de R$ %.2f\n", nomeDoCliente, totalConta);
    }else{
        if(numeroDeDiarias == 15){
            totalConta = (numeroDeDiarias * 60.00) + (numeroDeDiarias * 6.00);
            printf("Ola %s. O total da sua conta e de R$ %.2f\n", nomeDoCliente, totalConta);
        }else{
            if(numeroDeDiarias < 15){
                totalConta = (numeroDeDiarias * 60.00) + (numeroDeDiarias * 8.00);
                printf("Ola %s. O total da sua conta e de R$ %.2f\n", nomeDoCliente, totalConta);
            }
        }
    }
}