/*
O sistema de avaliação de determinada disciplina, é composto por três provas. A
primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Faça
um algoritmo para calcular a média final de um aluno desta disciplina.

SINTESE
    ENTRADA: primeiraNota, segundaNota, terceiraNota
    PROCESSAMENTO: soma dos resultados e depois realizar a média ponderada
    SAIDA: mostra a média do aluno e mostrar se está aprovado ou reprovado
*/

#include <stdio.h>

int main(){
    float primeiraNota = 0.0;
    float segundaNota = 0.0;
    float terceiraNota = 0.0;
    float calularNotas = 0.0;
    float mediaPonderada = 0.0;

    printf("Digite a primeira nota:\n");
    scanf("%f", &primeiraNota);

    printf("Digite a segunda nota:\n");
    scanf("%f", &segundaNota);

    printf("Digite a terceira nota:\n");
    scanf("%f", &terceiraNota);
      
   calularNotas = (primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5);
   mediaPonderada = calularNotas / 10;

   if(mediaPonderada >= 6){
    printf("ALUNO APROVADO!\n");
    printf("NOTA = %.2f\n", mediaPonderada);
   }else{
    printf("ALUNO REPROVADO.\n");
    printf("NOTA = %.2f\n", mediaPonderada);
   }
}