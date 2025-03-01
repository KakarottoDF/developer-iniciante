/*
SINTESE
    ENTRADA: quantidadeDeFuncionarios, nomeDoFuncionario, salarioDoFuncionario
    PROCESSAMENTO: mediaDosSalariosDosFuncionarios, salarioMaisAlto, salarioMaisBaixo
    SAIDA: mediaDosSalariosDosFuncionarios, salarioMaisAlto, salarioMaisBaixo
*/

#include <stdio.h>

int main(){

    int quantidadeDeFuncionarios;
    char nomeDoFuncionario[50];
    float salarioDoFuncionario;
    float totalValorDosSalarioDosFuncionarios = 0;
    float mediaDosSalariosDosFuncionarios = 0;
    float salarioMaisAlto = 0;
    float salarioMaisBaixo = 0;

    printf("Digite a quantidade de funcionarios: ");
    scanf("%d", &quantidadeDeFuncionarios);

    for(int i = 1; i <= quantidadeDeFuncionarios; i++){
        printf("Digite o nome do funcionario %d: ", i);
        getchar();
        fgets(nomeDoFuncionario, sizeof(nomeDoFuncionario), stdin);

        printf("Digite o salario deste funcionario R$ ");
        scanf("%f", &salarioDoFuncionario);

        totalValorDosSalarioDosFuncionarios += salarioDoFuncionario;

        if(salarioDoFuncionario > salarioMaisAlto){
            salarioMaisAlto = salarioDoFuncionario;
        }else{
            if(salarioMaisBaixo < salarioMaisAlto && salarioMaisBaixo < salarioDoFuncionario){
                salarioMaisBaixo = salarioDoFuncionario;
            }
        }
        printf("NOME DO FUNCIONARIO %d: %s\n", i, nomeDoFuncionario);
    }

    mediaDosSalariosDosFuncionarios = totalValorDosSalarioDosFuncionarios / quantidadeDeFuncionarios;

    printf("A media salarial de todos os funcionarios e de R$ %.2f\n", mediaDosSalariosDosFuncionarios);
    printf("O salario mais alto e de R$ %.2f", salarioMaisAlto);
    printf("O salario mais baixo e de R$ %.2f", salarioMaisBaixo);
    
}