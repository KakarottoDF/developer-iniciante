import java.util.Scanner;

public class Leitor{
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

    public static int lerInt(String msg, String msgError, int min, int max){
        int valor;
        do{
            valor = lerInt(msg);
            if(valor < min || valor > max){
                System.out.println(msgError);
            }
        }while(valor < min || valor > max);
        return valor;
    }
}
