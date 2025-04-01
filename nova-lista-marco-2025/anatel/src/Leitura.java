import java.util.Scanner;
public class Leitura {
    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }
    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }
    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }
    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
    public static int lerInt(String msg, String errorMsg, int min, int max){
        int valor;
        do {
            valor = lerInt(msg);
            if( valor > max || valor < min ){
                System.out.println(errorMsg);
            }
        } while (valor < min || valor > max);
        return valor;
    }
}
