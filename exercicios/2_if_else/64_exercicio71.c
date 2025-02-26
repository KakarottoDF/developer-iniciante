/*
Crie um algoritmo que peça o nome, a altura e o peso de duas pessoas e
apresente o nome da mais pesada e o nome da mais alta.

SINTESE
    ENTRADA: nome1, altura1, peso1, nome2, altura2, peso2
    PROCESSAMENTO: maisAlta, maisPesada
    SAIDA: maisAlta, maisPesada
*/

#include <stdio.h>

int main(){

    char nome1[50];
    char nome2[50];
    float altura1;
    float altura2;
    float peso1;
    float peso2;
    char maisAlta[50];
    char maisPesada[50];

    printf("Informe o nome da primeira pessoa:");
    fgets(nome1, sizeof(nome1), stdin);
    printf("Informe a altura da primeira pessoa:");
    scanf("%f", &altura1);
    getchar();
    printf("Informe o peso da primeira pessoa:");
    scanf("%f", &peso1);
    getchar();

    printf("Informe o nome da segunda pessoa:");
    fgets(nome2, sizeof(nome2), stdin);
    printf("Informe a altura da segunda pessoa:");
    scanf("%f", &altura2);
    getchar();
    printf("Informe o peso da segunda pessoa:");
    scanf("%f", &peso2);
    getchar();

    if(altura1 > altura2){
        printf("\n\nA pessoa mais alta e %s\n", nome1);
    }else{
        printf("A pessoa mais alta e %s\n", nome2);
    }

    if(peso1 > peso2){
        printf("A pessoa mais pesada e %s\n", nome1);
    }else{
        printf("A pessoa mais pesada e %s\n", nome2);
    }
}