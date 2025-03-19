import java.util.Scanner;

public class Leitor{
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt(String msg, String msgError, int inteiroPositivo){
        do{
            inteiroPositivo = lerInt(msg);
            if(inteiroPositivo < 0){
                System.out.println(msgError);
            }
        }while(inteiroPositivo < 0);
        return inteiroPositivo;
    }
}
