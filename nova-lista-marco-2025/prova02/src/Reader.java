import java.util.Scanner;

public class Reader{
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static int lerInt(String msg, String msgError, int min, int max){
        int entrada;
        do {
            entrada = lerInt(msg);
            if (entrada < min || entrada > max) {
                System.out.println(msgError);
            }
        }while(entrada < min || entrada > max);
        return entrada;
    }

    public static String lerString(){
        return new Scanner(System.in).nextLine().trim().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
}
