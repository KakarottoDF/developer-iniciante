import java.util.Scanner;

public class Software {

    public static final double MEDIA_APROVACAO = 7.0;

    public static void main (String args[]){
        double notaUm = lerDouble("Informe nota 1: ");

        double notaDois = lerDouble("Informe a nota 2: ");
//        //1
        double media = calcularMedia(notaUm, notaDois);
        if(isAprovado(media)) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("A média é: "+media);


    }
    public static boolean isAprovado(double media){
        if(media >= MEDIA_APROVACAO){
            return true;
        }else{
            return false;
        }
    }

    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    /** Centralizar o ponto de manutenção
     *  ENCAPSULAR a complexidade do calculo da média
     *  Permitir o reaproveitamento
     *
     */

    //BAIXO ACOPLAMENTO (É O QUANTO VOCÊ TEM QUE SABER DO MÉTODO PARA CONSEGUIR USAR) E ALTA COESÃO (O MÉTODO DEVE FAZER ESTRITAMENTE O QUE É PRA FAZER)

    //1
    public static double calcularMedia(double valorUm, double valorDois){
        return (valorUm * 0.2 + valorDois * 0.8) / 2;
    }

    //2
    public static void media(double valorUm, double valorDois){
        double media = (valorUm + valorDois)/2;
        System.out.println(media);
    }
}