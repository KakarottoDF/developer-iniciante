/*

Leia um código de cinco algarismos (variável Codigo) e gere o digito verificador
(DigitoV) módulo 7 para o mesmo.
Supondo que os cinco algarismos do código são ABCDE, uma forma de calcular
o dígito desejado, com módulo 7 é:
DigitoV = resto da divisão de S por 7, onde
S = 6*A + 5*B + 4*C + 3*D + 2*E

SINTESE
    ENTRADA:codigo
    PROCESSAMENTO: (6*(codigo / 10000)) + (5*((codigo / 1000) % 10)) + (4*((codigo / 100) % 10)) + (3*((codigo / 10) % 10)) + (2*(codigo % 10)) e depois digitoV = S % 7
    SAIDA: digitoV

*/

#include <stdio.h>

int main(){
    
    int s = 0;
    int codigo = 0;
    int digitoV = 0;

    printf("Digite um código de 5 algarismos:\n");
    scanf("%d", &codigo);

    s = (6*(codigo / 10000)) + (5*((codigo / 1000) % 10)) + (4*((codigo / 100) % 10)) + (3*((codigo / 10) % 10)) + (2*(codigo % 10));

    digitoV = s % 7;

    printf("O digito verificador e igual a %d", digitoV);

}