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

    public static String lerString(String msg, String msgError, String opcao1, String opcao2){
        String escolha;
        do{
            escolha = lerString(msg);
            if(!escolha.equalsIgnoreCase(opcao1) && !escolha.equalsIgnoreCase(opcao2)){
                System.out.println(msgError);
            }
        } while(!escolha.equalsIgnoreCase(opcao1) && !escolha.equalsIgnoreCase(opcao2));
        return escolha;
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

    public static char lerChar() {
        return new Scanner(System.in).next().toUpperCase().charAt(0);
    }

    public static char lerChar(String msg) {
        System.out.print(msg);
        return lerChar();
    }

    public static char lerChar(String msg, String msgError, char opcao1, char opcao2){
        char escolha;
        do{
            escolha = lerChar(msg);
            if(escolha != opcao1 && escolha != opcao2){
                System.out.println(msgError);
            }
        } while(escolha != opcao1 && escolha != opcao2);
        return escolha;
    }
}
