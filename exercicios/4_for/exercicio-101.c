/*
SINTESE
    ENTRADA: valorFatorial
    PROCESSAMENTO: fatorial
    SAIDA: fatorial
*/

#include <stdio.h>

int main() {
    int numero;
    int valorFatorial = 1;

    printf("Qual o numero que voce deseja realizar o fatorial: ");
    scanf("%d", &numero);

    if (numero < 0) {
        printf("Nao existe fatorial de numero negativo.\n");
    } else {
        for (int i = 1; i <= numero; i++) {
            valorFatorial *= i;
        }

        printf("O fatorial de %d e igual a %d\n", numero, valorFatorial);
    }
}
