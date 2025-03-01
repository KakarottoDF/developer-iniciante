/*
SINTESE
    ENTRADA: 
    PROCESSAMENTO: 
    SAIDA: 
*/

#include <stdio.h>

int main(){

    int conjuntoDeNumeros;
    int numeroDigitado;
    float somaDosNumeros = 0;
    float media = 0;
    int sentinela;

    while(sentinela != 9999){

        printf("Quantos numeros voce quer fazer a media? Digite: ");
        scanf("%d", &conjuntoDeNumeros);

        if(conjuntoDeNumeros == 1){
            printf("A media e o proprio numero que voce digitou = %d.\n\n", conjuntoDeNumeros);
        }else{
            for(int i = 1; i <= conjuntoDeNumeros; i++){
                printf("Digite o %d numero: ", i);
                scanf("%d", &numeroDigitado);

                somaDosNumeros += numeroDigitado;
            }
            media = somaDosNumeros / conjuntoDeNumeros;

            printf("A soma dos numeros digitados e de %.2f.\n", somaDosNumeros);
            printf("A media desses numeros e de %.2f.\n\n", media);
        }

        printf("Deseja continuar com o programa? Digite 9999 para parar: ");
        scanf("%d", &sentinela);

        conjuntoDeNumeros = 0;
        numeroDigitado = 0;
        somaDosNumeros = 0;
        media = 0;
    }
    
}