import java.util.Scanner;

public class Reader{
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int getInt(String msg){
        System.out.println(msg);
        return getInt();
    }

    public static double getDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double getDouble(String msg){
        System.out.println(msg);
        return getDouble();
    }

    public static String getString(){
        return new Scanner(System.in).nextLine().trim().toLowerCase();
    }

    public static String getString(String msg){
        System.out.println(msg);
        return getString();
    }
}
