/*
SINTESE
    ENTRADA: nomeDoHotel, distanciaDoCentroDaCidade, numeroMedioDeVisitantesNoUltimoFeriado e tipoDeAcessoAoHotel
     (0 – acesso não asfaltado; 1 – acesso asfaltado)
    PROCESSAMENTO: a
    SAIDA:
*/

import java.util.Scanner;

public class Exercicio114 {

    public static void main(String[] args) {

        final int TIPO_DE_PESSOAS_VISITANTES = 2;
        String nomeDoHotel;
        double distanciaDoCentroDaCidade;
        int quantidadeDeHoteisComDistanciaDe15Km = 0;
        int totaisDeVisitantesNoHotel = 0;
        double quantidadeMediaDeVisitantesComAcessoNaoAsfaltado = 0.0;
        int tipoDeAcessoAoHotel;
        int acessoNaoAsfaltado = 0;
        int acessoAsfaltado = 0;
        int flag = 1;
        int controleEntradaeSaidaDaEscolhaDoTipoDeAcessoAoHotel = 1;

        Scanner scanner = new Scanner(System.in);

        while(flag==1){

            System.out.print("Digite o nome do hotel: ");
            nomeDoHotel = scanner.nextLine();

            System.out.print("Qual a distância do centro da cidade em Km: ");
            distanciaDoCentroDaCidade = scanner.nextDouble();

            if (distanciaDoCentroDaCidade > 15){
                quantidadeDeHoteisComDistanciaDe15Km++;
            }

            while (controleEntradaeSaidaDaEscolhaDoTipoDeAcessoAoHotel == 1) {

                System.out.print("Digite o total médio dos visitantes no hotel " + nomeDoHotel + ": ");
                totaisDeVisitantesNoHotel = scanner.nextInt();

                System.out.println("Qual o tipo de acesso ao hotel:");
                System.out.println("[1] Acesso NÃO asfaltado");
                System.out.println("[2] Acesso asfaltado");
                tipoDeAcessoAoHotel = scanner.nextInt();

                if (tipoDeAcessoAoHotel == 1) {
                    acessoNaoAsfaltado++;
                    controleEntradaeSaidaDaEscolhaDoTipoDeAcessoAoHotel = 2;
                } else {
                    if (tipoDeAcessoAoHotel == 2) {
                        acessoAsfaltado++;
                        controleEntradaeSaidaDaEscolhaDoTipoDeAcessoAoHotel = 2;
                    } else {
                        System.out.println("Escolha inválida, tente novamente!");
                        totaisDeVisitantesNoHotel = 0;
                    }
                }
            }

            //O nome e a distância do centro em Km, de todos os hoteis de acesso
            //asfaltado que tiveram menos de 1.000 visitantes.

            if(acessoAsfaltado >=1 && totaisDeVisitantesNoHotel < 1000){
                System.out.println("O hotel " + nomeDoHotel + "tem " + distanciaDoCentroDaCidade + " do centro da cidade e tiveram " + totaisDeVisitantesNoHotel + " visitantes.");
            }

            if(acessoNaoAsfaltado >= 1) {
                quantidadeMediaDeVisitantesComAcessoNaoAsfaltado = totaisDeVisitantesNoHotel / acessoNaoAsfaltado;
            }

            System.out.print("Deseja continuar? [1]Sim [2]Não: ");
            flag = scanner.nextInt();

            if(flag == 1){
                nomeDoHotel = "";
                distanciaDoCentroDaCidade = 0;
                tipoDeAcessoAoHotel = 0;
                controleEntradaeSaidaDaEscolhaDoTipoDeAcessoAoHotel = 1;
                scanner.nextLine();
            }else{
                continue;
            }
        }
        System.out.println("O número de hoteis que distam mais de 15km do centro é igual a " + quantidadeDeHoteisComDistanciaDe15Km);
        System.out.println("A quantidade média de visitantes no último feriado, nos hoteis com acesso não asfaltado é igual a " + quantidadeMediaDeVisitantesComAcessoNaoAsfaltado);
    }
}