/*

Dado um número de três algarismos N = CDU (onde C é o algarismo das
centenas, D é o algarismo das dezenas e U o algarismo das unidades),
considere o número M constituído pelos algarismos de N em ordem inversa, isto
é, M = UDC. Gerar M a partir de N (p.ex.: N = 123 -> M = 321)

SINTESE
    ENTRADA: n
    PROCESSAMENTO: (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
    SAIDA: n -> m

*/

#include <stdio.h>

int main(){
    
    int n = 0;
    int m = 0;

    printf("Digite um numero com tres algarismos:\n");
    scanf("%d", &n);

    m = (n % 10) * 100 + 
    ((n / 10) % 10) * 10 + 
    (n / 100);

/*
(N % 10): Obtém o último dígito (unidade).
Exemplo: Se N = 123, então 123 % 10 = 3.

* 100: Move esse dígito para a posição das centenas.
Exemplo: 3 * 100 = 300.

(N / 10) % 10: Obtém o dígito do meio (dezena).
Exemplo: 123 / 10 = 12, depois 12 % 10 = 2.

* 10: Move esse dígito para a posição das dezenas.
Exemplo: 2 * 10 = 20.

(N / 100): Obtém o primeiro dígito (centena).
Exemplo: 123 / 100 = 1.

Soma tudo:
Exemplo: M = 300 + 20 + 1 = 321.
*/

    printf("N = %d -> M = %d", n, m);
}