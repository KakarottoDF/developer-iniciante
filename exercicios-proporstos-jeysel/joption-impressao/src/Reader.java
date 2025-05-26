import java.util.Scanner;

public class Reader {
    public static String lerString(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
}
