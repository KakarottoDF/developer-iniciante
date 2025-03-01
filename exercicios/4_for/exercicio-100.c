/*
SINTESE
    ENTRADA: 10 numeros inteiros
    PROCESSAMENTO: media, maior e menor
    SAIDA: media, maior e menor número
*/

#include <stdio.h>
#define REPETICOES 3

int main(){
    
    int numeroInteiro;
    int totalNumerosInteiros = 0;
    float mediaNumerosInteiros = 0;
    int maioNumeroInteiro = 0;
    int menorNumeroInteiro = 0;

    for(int i = 1; i <= REPETICOES; i++){
        printf("Digite o %d numero: ", i);
        scanf("%d", &numeroInteiro);

        totalNumerosInteiros += numeroInteiro;

        if(numeroInteiro > maioNumeroInteiro){
            maioNumeroInteiro = numeroInteiro;
        }else{
            if(menorNumeroInteiro < maioNumeroInteiro && menorNumeroInteiro < numeroInteiro){
                menorNumeroInteiro = numeroInteiro;
            }
        }
    }

    mediaNumerosInteiros = totalNumerosInteiros / REPETICOES;
    
    printf("A media dos numeros e igual a %.2f.\n", mediaNumerosInteiros);
    printf("O maior numero digitado foi %d.\n", maioNumeroInteiro);
    printf("O menor numero digitado foi %d.\n", menorNumeroInteiro);
}