/*
Um usuário deseja um algoritmo pelo qual possa escolher que tipo de média
deseja calcular a partir de três notas. Faça um algoritmo que leia as notas, a
opção escolhida pelo usuário e calcule a média:
1- aritmética
2- ponderada (pesos 3, 3, 4)

SINTESE
    ENTRADA: escolhaDaMedia, primeiraNota, segundaNota, terceiraNota
    PROCESSAMENTO: calcular media aritmética ou ponderada
    SAIDA: resultado da média escolhida
*/

#include <stdio.h>
#define ESCOLHA_MEDIA_ARITMETICA 1
#define ESCOLHA_MEDIA_PONDERADA 2
#define MEDIA_ARITMETICA 3
#define MEDIA_PONDERADA 10
#define PESO_UM 3
#define PESO_DOIS 3
#define PESO_TRES 4

int main(){
    int escolhaDaMedia;
    float primeiraNota;
    float segundaNota;
    float terceiraNota;
    float media = 0;
    
    printf("Escolha uma das opcoes para realizacao da media:\n %d - Media Aritmetica\n %d - Media Ponderada\n", ESCOLHA_MEDIA_ARITMETICA, ESCOLHA_MEDIA_PONDERADA);
    scanf("%d", &escolhaDaMedia);

    if(escolhaDaMedia != ESCOLHA_MEDIA_ARITMETICA && escolhaDaMedia != ESCOLHA_MEDIA_PONDERADA){
        printf("Opcao invalida. Programa encerrado!");
        return 0;
    }

    printf("Digite a primeira nota: ");
    scanf("%f", &primeiraNota);

    printf("Digite a segunda nota: ");
    scanf("%f", &segundaNota);

    printf("Digite a terceira nota: ");
    scanf("%f", &terceiraNota);

    if(escolhaDaMedia == ESCOLHA_MEDIA_ARITMETICA){
        media = (primeiraNota + segundaNota + terceiraNota) / MEDIA_ARITMETICA;
        printf("A media aritmetica dessas notas sera de %.2f", media);
        }else{
            media = ((primeiraNota * PESO_UM) + (segundaNota * PESO_DOIS) + (terceiraNota * PESO_TRES)) / MEDIA_PONDERADA;
            printf("A media ponderada dessas notas sera de %.2f", media);
            }
}