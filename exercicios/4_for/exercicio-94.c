/*
SINTESE
    ENTRADA: escolha
    PROCESSAMENTO: moduloNumeros
    SAIDA: moduloNumeros
*/

#include <stdio.h>
#define EXECUCAO 10
#define DIVISAO_CONJUNTO 50

int main(){
    
    int a;
    int b;
    int escolha;
    int moduloNumeros = 0;
    int quantidadeDeExecucoes;


    printf("Faca a sua escolha:\n1 - Executar o conjunto 10 vezes\n2 - Nao executar nenhuma vez\n3 - Executar o conjunto 100 vezes\n4 - Executar com sua escolha de quantas vezes voce deseja que seja executado.\nDigite sua escolha agora: ");
    scanf("%d", &escolha);

    if(escolha == 1){
    for(int i=1; i <= EXECUCAO; i++){
        printf("Digite o primeiro numero: ");
        scanf("%d", &a);

        printf("Digite o segundo numero: ");
        scanf("%d", &b);

        moduloNumeros = a % b;

        printf("\nO resto da divisao %d dividido por %d e igual a %d\n\n", a, b, moduloNumeros);
        }

    }else{
        if(escolha == 2){
            printf("Você escolheu a opcao de nao executar nenhuma vez. Ate logo!");
            }else{
                if(escolha == 3){
                    for(int i=1; i <= DIVISAO_CONJUNTO; i++){
                        printf("Digite o primeiro numero: ");
                        scanf("%d", &a);
                    
                        printf("Digite o segundo numero: ");
                        scanf("%d", &b);
                    
                        moduloNumeros = a % b;
                    
                        printf("\nO resto da divisao %d dividido por %d e igual a %d\n\n", a, b, moduloNumeros);
                }
                for(int i=1; i <= DIVISAO_CONJUNTO; i++){
                    printf("Digite o primeiro numero: ");
                    scanf("%d", &a);
                
                    printf("Digite o segundo numero: ");
                    scanf("%d", &b);
                
                    moduloNumeros = a % b;
                
                    printf("\nO resto da divisao %d dividido por %d e igual a %d\n\n", a, b, moduloNumeros);
                    }
            }
            if(escolha == 4){
                printf("Digite a quantidade de vezes voce deseja que o programa seja executado: ");
                scanf("%d", &quantidadeDeExecucoes);

                for(int i=1; i <=quantidadeDeExecucoes; i++){
                    printf("Digite o primeiro numero: ");
                    scanf("%d", &a);
                
                    printf("Digite o segundo numero: ");
                    scanf("%d", &b);
                
                    moduloNumeros = a % b;
                
                    printf("\nO resto da divisao %d dividido por %d e igual a %d\n\n", a, b, moduloNumeros);
                    }
            }
        }
    }
}