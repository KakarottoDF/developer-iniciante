/*
SINTESE
    ENTRADA: quantidadeDeMetrosDeChico, quantidadeDeMetrosDeZe
    PROCESSAMENTO: calcular quantos anos são necessárioa para que Zé seja maior que Chico
    SAIDA: quantos anos são necessárioa para que Zé seja maior que Chico
*/

public class Exercicio118 {

    public static void main(String[] args) {

        final double METROS_EM_CM = 100.0;
        double quantidadeDeMetrosDeChico = 1.50;
        final int CENTIMETROS_QUE_CHICO_CRESCE_POR_ANO = 2;
        int quantidadeDeAnosPassadosChico = 0;

        double quantidadeDeMetrosDeZe = 1.10;
        final int CENTIMETROS_QUE_ZE_CRESCE_POR_ANO = 3;
        int quantidadeDeAnosPassadosZe = 0;

        quantidadeDeMetrosDeChico *= METROS_EM_CM;
        quantidadeDeMetrosDeZe *= METROS_EM_CM;

        while (quantidadeDeMetrosDeZe <= quantidadeDeMetrosDeChico) {
            quantidadeDeMetrosDeChico += CENTIMETROS_QUE_CHICO_CRESCE_POR_ANO;
            quantidadeDeAnosPassadosChico++;

            quantidadeDeMetrosDeZe += CENTIMETROS_QUE_ZE_CRESCE_POR_ANO;
            quantidadeDeAnosPassadosZe++;
        }

        System.out.println("A quantidade de anos que serão necessários para que Zé seja maior que Chico é de " + quantidadeDeAnosPassadosZe + " anos.");
    }
}