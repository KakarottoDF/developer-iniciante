/*
Crie um algoritmo chamado Zodiaco. Este algoritmo deve ler a data do seu
aniversário e atribuir um valor para a variável inteira chamada signo, conforme
lista abaixo:
a) 1o signo do zodíaco: Aquário (21/jan a 19/fev)
b) 2o signo do zodíaco: Peixes (20/fev a 20/mar)
c) 3o signo do zodíaco: Áries (21/mar a 20/abr)
d) 4o signo do zodíaco: Touro (21/abr a 20/mai)
e) 5o signo do zodíaco: Gêmeos (21/mai a 20/jun)
f) 6o signo do zodíaco: Câncer (21/jun a 21/jul)
g) 7o signo do zodíaco: Leão (22/jul a 22/ago)
h) 8o signo do zodíaco: Virgem (23/ago a 22/set)
i) 9o signo do zodíaco: Libra (23/set a 22/out)
j) 10o signo do zodíaco: Escorpião (23/out a 21/nov)
k) 11o signo do zodíaco: Sagitário (22/nov a 21/dez)
l) 12o signo do zodíaco: Capricórnio (22/dez a 20/jan)

O algoritmo deve imprimir uma mensagem, como o exemplo: "Você é do seguinte
signo do zodíaco: Libra".

SINTESE
    ENTRADA: dia, mes
    PROCESSAMENTO: signo
    SAIDA: signo
*/

#include <stdio.h>

int main(){

    int dia, mes;
    int signo;

    printf("Informe o dia do seu aniversario: ");
    scanf("%d", &dia);
    printf("Informe o mes do seu aniversario: ");
    scanf("%d", &mes);

    if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)){
        printf("Voce e do seguinte signo do zodiaco: Aquario\n");
        }else{
            if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)){
                printf("Voce e do seguinte signo do zodiaco: Peixes\n");
                }else{
                    if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)){
                        printf("Voce e do seguinte signo do zodiaco: Aries\n");
                        }else{
                            if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)){
                                printf("Voce e do seguinte signo do zodiaco: Touro\n");
                                }else{
                                    if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)){
                                        printf("Voce e do seguinte signo do zodiaco: Gemeos\n");
                                        }else{
                                            if ((dia >= 21 && mes == 6) || (dia <= 21 && mes == 7)) {
                                                printf("Voce e do seguinte signo do zodiaco: Cancer\n");
                                                }else{
                                                    if ((dia >= 22 && mes == 7) || (dia <= 22 && mes == 8)) {
                                                        printf("Voce e do seguinte signo do zodiaco: Leao\n");
                                                        }else{
                                                            if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
                                                                printf("Voce e do seguinte signo do zodiaco: Virgem\n");
                                                                }else{
                                                                    if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
                                                                        printf("Voce e do seguinte signo do zodiaco: Libra\n");
                                                                        }else{
                                                                            if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)){
                                                                                printf("Voce e do seguinte signo do zodiaco: Escorpiao\n");
                                                                                }else{
                                                                                    if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
                                                                                        printf("Voce e do seguinte signo do zodiaco: Sagitario\n");
                                                                                        }else{
                                                                                            printf("Voce e do seguinte signo do zodiaco: Capricornio\n");
                                                                                            }
                                                                                        }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
}