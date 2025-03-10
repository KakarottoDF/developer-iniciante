import java.util.Scanner;

public class MyMath {
    int primeiroValor;
    int segundoValor;

    public static int lerValores(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerValores(String msg){
        System.out.print(msg);
        return lerValores();
    }

    public static int fatorial(int num1) {
        int fatorial = 1;
        System.out.println("FATORIAL:");
        if (num1 < 0) {
            System.out.println("Nao existe fatorial de numero negativo.");
        } else {
            for (int i = 1; i <= num1; i++) {

                fatorial *= i;
            }

            System.out.print(num1 + "! = ");
        }
        return fatorial;
    }
}
