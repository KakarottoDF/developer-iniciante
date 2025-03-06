/*
SINTESE
    ENTRADA: escolha do jogador (pedra, papel ou tesoura)
    PROCESSAMENTO: o computador escolhe uma das opções aleatoriamente e compara com a escolha do jogador
    SAIDA: resultado do jogo (vitória, empate ou derrota)
*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio85 {

    public static void main(String[] args) {

        String escolhaJogador;
        String escolhaComputador;
        int resultado;

        escolhaJogador = lerEscolhaJogador("Escolha pedra, papel ou tesoura: ");

        escolhaComputador = escolherComputador();

        resultado = compararEscolhas(escolhaJogador, escolhaComputador);

        System.out.println("\nVocê escolheu: " + escolhaJogador);
        System.out.println("O computador escolheu: " + escolhaComputador);

        switch (resultado) {
            case 1:
                System.out.println("Você venceu!");
                break;
            case 0:
                System.out.println("Empate!");
                break;
            case -1:
                System.out.println("Você perdeu!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Método para ler a escolha do jogador
    public static String lerEscolhaJogador(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine().toLowerCase();
    }

    public static String escolherComputador() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        Random rand = new Random();
        int escolha = rand.nextInt(3);
        return opcoes[escolha];
    }

    public static int compararEscolhas(String escolhaJogador, String escolhaComputador) {
        if (escolhaJogador.equals(escolhaComputador)) {
            return 0;
        }

        switch (escolhaJogador) {
            case "pedra":
                return (escolhaComputador.equals("tesoura")) ? 1 : -1;
            case "papel":
                return (escolhaComputador.equals("pedra")) ? 1 : -1;
            case "tesoura":
                return (escolhaComputador.equals("papel")) ? 1 : -1;
            default:
                return -2;
        }
    }
}
