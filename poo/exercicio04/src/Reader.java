import java.util.Scanner;

public class Reader{
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static int lerInt(String msg, String msgError, int inicio, int fim){
        int escolha;
        do{
            escolha = lerInt(msg);
            if(escolha < inicio || escolha > fim) {
                System.out.println(msgError);
            }
        } while(escolha < inicio || escolha > fim);
        return escolha;
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.print(msg);
        return lerDouble();
    }

    public static String lerString(){
        return new Scanner(System.in).nextLine().trim().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }

    public static boolean lerBoolean(){
        return new Scanner(System.in).nextBoolean();
    }

    public static boolean lerBoolean(String msg){
        System.out.print(msg);
        return lerBoolean();
    }

    public static boolean lerBoolean(String msg, String msgError, String yes, String no){
        String escolha;
        do{
            escolha = lerString(msg);
            if(escolha.equalsIgnoreCase(yes)) {
                return true;
            } else if(escolha.equalsIgnoreCase(no)) {
                return false;
            } else {
                System.out.println(msgError);
            }
        } while(true);
    }
}
