import java.util.Scanner;

public class Leitor {

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
        System.out.print(msg);
        return lerInt();
    }
}
