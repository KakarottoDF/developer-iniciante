/*
SINTESE
    ENTRADA: numeroInteiro
    PROCESSAMENTO: mediaDosNumeros, quantidaDeNumerosImpares
    SAIDA: mediaDosNumeros, quantidaDeNumerosImpares e o array dos números digitados

Faça um programa que receba 5.000 mil dados do usuário do tipo inteiro. Sabe-se que
valores negativos não são aceitos. Após receber esses valores e popular o array, imprima
na saída padrão a média dos valores, quantos valores são ímpares e todos os valores que
foram informados. Para esta solução, utilize o maior número de métodos visualizados.
*/

public class Main{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();


            for(int i = 0; i < pessoa.TAMANHO_DO_ARRAY; i++){
                do{
                pessoa.numeroInteiro[i] = Pessoa.lerValores("Digite o "+ (i + 1) + "º valor: ");
                }while(Pessoa.validarValor(pessoa.numeroInteiro[i]));
            }

        System.out.println("MÉDIA = " + Pessoa.mediaValores(pessoa));
        System.out.println("QUANTIDADE DE NÚMEROS ÍMPARES = " + Pessoa.contarNumerosImpares(pessoa));

        System.out.println("VALORES INFORMADOS:");
            for(int i = 0; i < pessoa.TAMANHO_DO_ARRAY; i++){
                System.out.print(" | " + pessoa.numeroInteiro[i]);
            }

    }
}
