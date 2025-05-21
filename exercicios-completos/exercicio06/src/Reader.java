import java.util.Scanner;

public class Reader{
    public static String lerString(){
        return new Scanner(System.in).nextLine().trim().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }

    public static String lerString(String msg, String msgError, String entrada, String saida){
        String leitor;

        do{
            leitor = lerString(msg);
            if(!leitor.equals(entrada) || !leitor.equals(saida)){
                System.out.println(msgError);
            }
        }while(!leitor.equals(entrada) && !leitor.equals(saida));
        return leitor;
    }

    public static boolean lerBoolean(){
        return new Scanner(System.in).nextBoolean();
    }

    public static boolean lerBoolean(String msg){
        System.out.print(msg);
        return lerBoolean();
    }

    public static boolean lerBoolean(String msg, String msgError, String entrada, String saida){
        String leitor;
        boolean resultado = true;

        do{
            leitor = lerString(msg);
            if(!leitor.equals(entrada) && !leitor.equals(saida)){
                System.out.print(msgError);
            }else{
                if(leitor.equals(entrada)){
                    resultado = true;
                }else{
                    if(leitor.equals(saida)){
                        resultado = false;
                    }
                }
            }
        }while(!leitor.equals(entrada) && !leitor.equals(saida));
        return resultado;
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static int lerInt(String msg, String msgError, int min, int max){
        int leitor;

        do{
            leitor = lerInt(msg);
            if(leitor < min || leitor > max) {
                System.out.print(msgError);
            }
        }while(leitor < min || leitor > max);
        return leitor;
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.print(msg);
        return lerDouble();
    }

}
