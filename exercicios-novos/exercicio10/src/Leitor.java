import java.util.Random;
import java.util.Scanner;

public class Leitor{
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.print(msg);
        return lerDouble();
    }

    public static void lerPiloto(Piloto piloto, int quantidadeDeVoltas) {

        for (int i = 0; i < quantidadeDeVoltas; i++) {
            piloto.nome[i] = lerString("Informe o nome do " + (i + 1) + "º piloto: ");
            piloto.escuderia[i] = lerString("Informe a escuderia do " + (i + 1) + "º piloto: ");

        }
    }

    public static void lerTempoDeVolta(Corrida corrida, int quantidadeDeVoltas){
        Random random = new Random();
        for(int i = 0; i < quantidadeDeVoltas; i++){
            corrida.tempoDeVolta[i] = random.nextDouble();
        }
    }
}
