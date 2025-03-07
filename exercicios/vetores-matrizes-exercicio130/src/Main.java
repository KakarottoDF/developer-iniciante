/*
SINTESE
    ENTRADA: vetorGabaritoLoteriaEsportiva, quantidadeDeApostadores, vetorApostador
    PROCESSAMENTO: Verificar quantos números foram certos
    SAIDA: Mostrar se a pessoa ganhou ou não e mostrar o números de acertos do jogo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int []vetorGabaritoLoteriaEsportiva = new int[4];
        int quantidadeDeApostadores;
        int []vetorApostador = new int[4];
        boolean validarNumeroDoGabarito;
        boolean validarJogador;
        int somaJogada = 0;

        for(int i = 0; i < vetorGabaritoLoteriaEsportiva.length; i++){
            validarNumeroDoGabarito = true;
            while(validarNumeroDoGabarito){
                vetorGabaritoLoteriaEsportiva[i] = lerNumerosDoVetor("Digite o " + (i + 1) + " número do gabarito: ");
                if(vetorGabaritoLoteriaEsportiva[i] == 1 || vetorGabaritoLoteriaEsportiva[i] == 2 || vetorGabaritoLoteriaEsportiva[i] == 3){
                  validarNumeroDoGabarito = false;
                }else{
                    System.out.println("Número inválido, digite somente o valor 1, 2 ou 3.");
                }
            }
        }

        quantidadeDeApostadores = lerNumerosDoVetor("Digite a quantidade de apostadores do jogo: ");

        for(int i = 0; i < quantidadeDeApostadores; i++){
            System.out.println("Jogador " + (i + 1));
            for(int j = 0; j < vetorApostador.length; j++) {
                validarJogador = true;
                while (validarJogador) {
                    vetorApostador[j] = lerNumerosDoVetor("Digite o " + (j + 1) + " número do gabarito: ");
                    if (vetorApostador[j] == 1 || vetorApostador[j] == 2 || vetorApostador[j] == 3) {
                        validarJogador = false;
                    } else {
                        System.out.println("Número inválido, digite somente o valor 1, 2 ou 3.");
                    }
                }
                if(vetorApostador[j] == vetorGabaritoLoteriaEsportiva[j]){
                    somaJogada++;
                }
            }
            if(somaJogada == vetorGabaritoLoteriaEsportiva.length){
                System.out.println("GANHADOR, PARABÉNS! VOCÊ TEVE " + somaJogada + " ACERTOS");
                somaJogada = 0;
            }else{
                System.out.println("NÃO FOI DESTA VEZ! VOCÊ TEVE " + somaJogada + " ACERTOS");
                somaJogada = 0;
            }
        }

        System.out.println("GABARITO DA LOTERIA ESPORTIVA:");
        for(int i = 0; i < vetorGabaritoLoteriaEsportiva.length; i++){
            System.out.print(vetorGabaritoLoteriaEsportiva[i] + " | ");
        }

    }

    public static int lerNumerosDoVetor(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerNumerosDoVetor(String msg){
        System.out.print(msg);
        return lerNumerosDoVetor();
    }
}