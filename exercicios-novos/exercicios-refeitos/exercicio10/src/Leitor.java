import java.util.Scanner;

public class Leitor{
    public static String lerString(){
        return new Scanner(System.in).nextLine().trim().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble(String msg, String msgError, double min, double max){
        double valor;
        do {
            valor = lerDouble(msg);
            if(valor < min || valor > max){
                System.out.println(msgError);
            }
        }while (valor < min || valor > max);
        return valor;
    }
}
