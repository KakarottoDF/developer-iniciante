/*
SINTESE
    ENTRADA: nomeDoCliente, quantidadeDeDiarias
    PROCESSAMENTO: totalDaConta, totalGanhoPeloHotel
    SAIDA: nomeDoCliente, totalDaConta, totalGanhoPeloHotel
*/

#include <stdio.h>
#define QUARTOS_HOTEL 3
#define DIARIA 50
#define DIARIA_MENOR_QUE_QUINZE 4.00
#define DIARIA_IGUAL_A_QUINZE 3.60
#define DIARIA_MAIOR_QUE_QUINZE 3.00

int main(){

    char nomeDoCliente[50];
    int quantidadeDeDiarias;
    float totalDaConta = 0;
    float totalGanhoPeloHotel = 0;

    for(int i = 1; i <= QUARTOS_HOTEL; i++){
        
        printf("Digite o nome do cliente: ");
        fgets(nomeDoCliente, sizeof(nomeDoCliente), stdin);
        
        printf("Digite a quantidade de diarias do cliente: ");
        scanf("%d", &quantidadeDeDiarias);
        getchar();

        if(quantidadeDeDiarias > 15){
            totalDaConta = (quantidadeDeDiarias * DIARIA) + (quantidadeDeDiarias * DIARIA_MAIOR_QUE_QUINZE);
            printf("CLIENTE: %s", nomeDoCliente);
            printf("TOTAL DA CONTA R$ %.2f\n", totalDaConta);
        }else{
            if(quantidadeDeDiarias == 15){
                totalDaConta = (quantidadeDeDiarias * DIARIA) + (quantidadeDeDiarias * DIARIA_IGUAL_A_QUINZE);                
                printf("CLIENTE: %s", nomeDoCliente);
                printf("TOTAL DA CONTA R$ %.2f\n", totalDaConta);
            }else{
                if(quantidadeDeDiarias < 15){
                    totalDaConta = (quantidadeDeDiarias * DIARIA) + (quantidadeDeDiarias * DIARIA_MENOR_QUE_QUINZE);
                    printf("CLIENTE: %s", nomeDoCliente);
                    printf("TOTAL DA CONTA R$ %.2f\n", totalDaConta);
                }
            }
        }
        totalGanhoPeloHotel += totalDaConta;
    }

    printf("O total de ganho pelo Hotel foi de R$ %.2f.\n\n", totalGanhoPeloHotel);

    
}