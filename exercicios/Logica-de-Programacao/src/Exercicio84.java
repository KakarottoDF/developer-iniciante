/*
SINTESE
    ENTRADA: operação desejada (depósito ou retirada), valor a ser depositado ou retirado
    PROCESSAMENTO: dependendo da operação escolhida, o saldo da conta é atualizado
    SAIDA: o saldo atualizado da conta
*/

import java.util.Scanner;

public class Exercicio84 {

    public static void main(String[] args) {

        String nomeTitular;
        int opcao;
        double saldo = 0.0;
        double valorDeposito;
        double valorRetirada;

        nomeTitular = lerNome("Digite o nome do titular da conta: ");

        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Depósito");
        System.out.println("2 - Retirada");
        opcao = lerOperacao("Digite a operação desejada (1 - Depósito, 2 - Retirada): ");

        switch (opcao) {
            case 1:
                valorDeposito = lerValor("Digite o valor a ser depositado: ");
                saldo = depositar(saldo, valorDeposito);
                System.out.println("Depósito realizado com sucesso!");
                break;

            case 2:
                valorRetirada = lerValor("Digite o valor a ser retirado: ");
                saldo = retirar(saldo, valorRetirada);
                break;

            default:
                System.out.println("Opção inválida! O programa será encerrado.");
                return;
        }

        System.out.println("\nSaldo atual da conta de " + nomeTitular + ": R$ " + saldo);
    }

    public static String lerNome(String msg){
        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }

    public static int lerOperacao(String msg){
        System.out.print(msg);
        return new Scanner(System.in).nextInt();
    }

    public static double lerValor(String msg){
        System.out.print(msg);
        return new Scanner(System.in).nextDouble();
    }

    public static double depositar(double saldo, double valor){
        return saldo + valor;
    }

    public static double retirar(double saldo, double valor){
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para a retirada!");
            return saldo; // Retorna o saldo inalterado
        } else {
            return saldo - valor;
        }
    }
}