/*
Escreva um algoritmo que leia o código de um aluno e suas três notas. Calcule a
média ponderada do aluno, considerando que o peso para a maior nota seja 4 e
para as duas restantes, 3. Mostre o código do aluno, suas três notas, a média
calculada e uma mensagem: "APROVADO" se a média for maior ou igual a 5 e
"REPROVADO" se a média for menor que 5.

SINTESE
    ENTRADA: codigoAluno, primeiraNota, segundaNota, terceiraNota
    PROCESSAMENTO: mediaPonderdaDoAluno
    SAIDA: codigoAluno, primeiraNota, segundaNota, terceiraNota, mediaPonderadaDoAluno, “APROVADO” ou “REPROVADO”
*/

#include <stdio.h>
#define PESO_UM 4
#define PESO_DOIS 3
#define PESO_TRES 3

int main()
{

    char codigoAluno[20];
    float primeiraNota;
    float segundaNota;
    float terceiraNota;
    float mediaPonderadaDoAluno = 0;

    printf("Digite o codigo do aluno:\n");
    fgets(codigoAluno, sizeof(codigoAluno), stdin);

    printf("Digite a primeira nota do aluno:\n");
    scanf("%f", &primeiraNota);

    printf("Digite a segunda nota do aluno:\n");
    scanf("%f", &segundaNota);

    printf("Digite a terceira nota do aluno:\n");
    scanf("%f", &terceiraNota);

    if (primeiraNota > segundaNota && primeiraNota > terceiraNota){
        mediaPonderadaDoAluno = ((primeiraNota * PESO_UM) + (segundaNota * PESO_DOIS) + (terceiraNota * PESO_TRES)) / (PESO_UM + PESO_DOIS + PESO_TRES);
    }else{
        if (segundaNota > primeiraNota && segundaNota > terceiraNota){
            mediaPonderadaDoAluno = ((primeiraNota * PESO_DOIS) + (segundaNota * PESO_UM) + (terceiraNota * PESO_TRES)) / (PESO_UM + PESO_DOIS + PESO_TRES);
        }else{
            mediaPonderadaDoAluno = ((primeiraNota * PESO_DOIS) + (segundaNota * PESO_TRES) + (terceiraNota * PESO_UM)) / (PESO_UM + PESO_DOIS + PESO_TRES);
        }
    }

    printf("---------- RELATÓRIO ESCOLAR ----------\n\n");
    printf("CODIGO DO ALUNO: %s", codigoAluno);
    printf("PRIMEIRA NOTA: %.2f\n", primeiraNota);
    printf("SEGUNDA NOTA: %.2f\n", segundaNota);
    printf("TERCEIRA NOTA: %.2f\n", terceiraNota);
    printf("MEDIA DO ALUNO: %.2f\n", mediaPonderadaDoAluno);

    if(mediaPonderadaDoAluno >= 5){
        // codigoAluno, primeiraNota, segundaNota, terceiraNota, mediaPonderadaDoAluno, “APROVADO” ou “REPROVADO”
        printf("RESULTADO: APROVADO!\n\n");
    }else{
        printf("RESULTADO: REPROVADO!\n\n");
    }

}