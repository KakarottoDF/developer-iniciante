/*
Elaborar um algoritmo que lê dois valores a e b e os escreve com a mensagem:
“São múltiplos” ou “Não são múltiplos”.

SINTESE
    ENTRADA: a e b
    PROCESSAMENTO: verificar se são múltiplos
    SAIDA: “São múltiplos” ou “Não são múltiplos”
*/

#include <stdio.h>

int main(){

    int a;
    int b;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &a);

    printf("Digite o segundo numero:\n");
    scanf("%d", &b);

    if(a % b == 0){
        printf("Sao multiplos");
        }else{
            printf("Nao sao multiplos");
        }

}