/*

Suponha que uma escola utilize, como código de matrícula, um número inteiro
no formato AASDDD, onde:
• Os dois primeiros dígitos, representados pela letra A, são os dois últimos
algarismos do ano da matrícula;
• O terceiro dígito, representado pela letra S, vale 1 ou 2, conforme o aluno
tenha se matriculado no 1º ou 2º semestre;
• Os quatro últimos dígitos, representados pela letra D, correspondem à ordem
da matrícula do aluno, no semestre e no ano em questão.
Crie um algoritmo que leia o número de matrícula de um aluno e imprima o ano
e o semestre em que ele foi matriculado.

SINTESE
    ENTRADA: matricula
    PROCESSAMENTO: 
    SAIDA: ano e semestre


*/

#include <stdio.h>

int main(){
    
    int matricula = 0;
    int ano = 0;
    int semestre = 0;
    
    printf("Digite a matricula do aluno (AASDDD):\n");
    scanf("%d", &matricula);

    ano = ((matricula / 100000) * 10) + (matricula / 10000) % 10;
    semestre = (matricula / 1000) % 10;

    printf("Ano da matricula = %d\nSemestre que o aluno foi matriculado = %d", ano, semestre);
}