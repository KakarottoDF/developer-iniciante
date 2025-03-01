/*Faça um algoritmo que leia quatro números e apresente os resultados de adição
e multiplicação dos valores entre si, baseando-se na utilização da propriedade
distributiva, ou seja, se forem lidas as variáveis A, B, C e D, devem ser somadas
e multiplicadas A com B, A com C e A com D; B com C, B com D e por último C
com D

SINTESE
    ENTRADA: A, B, C e D
    PROCESSAMENTO: Realizar adição e multiplicação
    SAIDA: X

    (A + B) * (A + C) * (A + D) * (B + C) * (B + D) * (C + D)

*/

#include <stdio.h>

int main(){
    int X = 0;
    int A = 0;
    int B = 0;
    int C = 0;
    int D = 0;

    printf("Digite o primeiro valor:\n");
    scanf("%d", &A);

    printf("Digite o segundo valor:\n");
    scanf("%d", &B);

    printf("Digite o terceiro valor:\n");
    scanf("%d", &C);

    printf("Digite o quarto valor:\n");
    scanf("%d", &D);

    X = (A + B) * (A + C) * (A + D) * (B + C) * (B + D) * (C + D);
    
    printf("------- ADICAO E MULTIPLICACAO DOS VALORES ENTRE SI -------\n");
    printf("RESULTADO = %d.\n", X);

}