/*
Faça um algoritmo que leia três números e mostre-os em ordem decrescente.

SINTESE
    ENTRADA: primeiroNumero, segundoNumero, terceiroNumero
    PROCESSAMENTO: comparação
    SAIDA: mostrar em ordem decrescente
*/

#include <stdio.h>

int main(){
    int primeiroNumero;
    int segundoNumero;
    int terceiroNumero;

    printf("Digite o primeiro numero:\n");
    scanf("%d", &primeiroNumero);

    printf("Digite o segundo numero:\n");
    scanf("%d", &segundoNumero);

    printf("Digite o terceiro numero:\n");
    scanf("%d", &terceiroNumero);

    if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero){
        printf("%d, %d, %d", primeiroNumero, segundoNumero, terceiroNumero);
        }else{
            if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero){
                printf("%d, %d, %d", primeiroNumero, terceiroNumero, segundoNumero);
                }else{
                    if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && primeiroNumero > terceiroNumero){
                        printf("%d, %d, %d", segundoNumero, primeiroNumero, terceiroNumero);
                    }else{
                        if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero){
                            printf("%d, %d, %d", segundoNumero, terceiroNumero, primeiroNumero);
                        }else{
                            if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && primeiroNumero > segundoNumero){
                                printf("%d, %d, %d", terceiroNumero, primeiroNumero, segundoNumero);
                                }else{
                                    if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && segundoNumero > primeiroNumero){
                                        printf("%d, %d, %d", terceiroNumero, segundoNumero, primeiroNumero);
                                    }
                                }
                            }
                        }
                    }
            }
}