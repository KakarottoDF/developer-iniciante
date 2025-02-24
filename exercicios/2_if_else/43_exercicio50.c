/*

Suponha que o conceito de um aluno seja determinado em função da sua nota.
Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100,
conforme a seguinte faixa:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 a 100 Ótimo
Crie um algoritmo que apresente o conceito e a nota do aluno.a

SINTESE
    ENTRADA: nota
    PROCESSAMENTO: conceito
    SAIDA: conceito e nota
*/

#include <stdio.h>

int main(){

    int nota;
    char conceito;

    printf("Digite a nota do aluno:\n");
    scanf("%d", &nota);

    if(nota >= 0 && nota <= 49){
        conceito = 'I';
    }else{
        if(nota >= 50 && nota <= 64){
            conceito = 'R';
        }else{
            if(nota >= 65 && nota <= 84){
                conceito = 'B';
            }else{
                if(nota >= 85 && nota <= 100){
                    conceito = 'O';
                }
            }
        }
    } 
    
}