/*
Uma empresa irá dar um aumento de salário aos seus funcionários de acordo
com a categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários das categorias A, C, F, e H ganharão 10% de aumento sobre o
salário;
• Funcionários das categorias B, D, E, I, J e T ganharão 15% de aumento sobre
o salário;
• Funcionários das categorias K e R ganharão 25% de aumento sobre o salário;
• Funcionários das categorias L, M, N, O, P, Q e S ganharão 35% de aumento
sobre o salário;
• Funcionários das categorias U, V, X, Y, W e Z ganharão 50% de aumento
sobre o salário.
Faça um algoritmo que escreva nome, categoria e salário reajustado de cada
empregado.

SINTESE
    ENTRADA: nomeDoFuncionario, categoriaDoFuncionario, salarioDoFuncionario
    PROCESSAMENTO: salarioReajustado
    SAIDA: nomeDoFuncionario, categoriaDoFuncionario e salarioReajustado

*/

#include <stdio.h>

int main(){

    char nomeDoFuncionario[50];
    char categoriaDoFuncionario;
    float salarioDoFuncionario;
    float salarioReajustado = 0;

    printf("Digite o seu nome:\n");
    fgets(nomeDoFuncionario, sizeof(nomeDoFuncionario), stdin);

    printf("Qual e a sua categoria?\n");
    scanf(" %c", &categoriaDoFuncionario);

    printf("Qual e o seu salario? R$ ");
    scanf("%f", &salarioDoFuncionario);
    
    if(categoriaDoFuncionario == 'A' || categoriaDoFuncionario == 'C' || categoriaDoFuncionario == 'F' || categoriaDoFuncionario == 'H'){
        salarioReajustado = (salarioDoFuncionario * 0.10) + salarioDoFuncionario;
        }else{
            if(categoriaDoFuncionario == 'B' || categoriaDoFuncionario == 'D' || categoriaDoFuncionario == 'E' || categoriaDoFuncionario == 'I' || categoriaDoFuncionario == 'J' || categoriaDoFuncionario == 'T'){

                salarioReajustado = (salarioDoFuncionario * 0.15) + salarioDoFuncionario;

            }else{
                if (categoriaDoFuncionario == 'K' || categoriaDoFuncionario == 'R'){
                    
                    salarioReajustado = (salarioDoFuncionario * 0.25) + salarioDoFuncionario;

                }else{
                    if (categoriaDoFuncionario == 'L' || categoriaDoFuncionario == 'M' || categoriaDoFuncionario == 'N' || categoriaDoFuncionario == 'O' || categoriaDoFuncionario == 'P' || categoriaDoFuncionario == 'Q' || categoriaDoFuncionario == 'S'){
                        salarioReajustado = (salarioDoFuncionario * 0.35) + salarioDoFuncionario;
                    
                    }else{
                        if(categoriaDoFuncionario == 'U' || categoriaDoFuncionario == 'V' || categoriaDoFuncionario == 'X' || categoriaDoFuncionario == 'Y' || categoriaDoFuncionario == 'W' || categoriaDoFuncionario == 'Z'){
                            salarioReajustado = (salarioDoFuncionario * 0.5) + salarioDoFuncionario;
                        }
                    }
                }
            }
        }

    printf("\nNOME: %s", nomeDoFuncionario);
    printf("CATEGORIA: %c\n", categoriaDoFuncionario);
    printf("REAJUSTE R$ %.2f", salarioReajustado);
}