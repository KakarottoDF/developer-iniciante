import java.util.Scanner;

public class MyMath {
    int primeiroValor;
    int segundoValor;
    String continuarPrograma = "S";

    public static int lerValores(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerValores(String msg){
        System.out.print(msg);
        return lerValores();
    }

    public static String lerContinuarPrograma(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public static String lerContinuarPrograma(String msg){
        System.out.print(msg);
        return lerContinuarPrograma();
    }

    public static String validarContinuarPrograma(String escolha){
        MyMath usuario = new MyMath();
        if(escolha.equals("S")){
            return usuario.continuarPrograma = "S";
        }else{
            System.out.println("O programa será encerrado!");
            return usuario.continuarPrograma = "N";
        }
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

    public static int maiorNumero(int numero1, int numero2){
        return Math.max(numero1, numero2);
    }

    public static boolean numeroPar(int numero){
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static String numeroPrimo(int numero) {
        if (numero <= 1) {
            return "O número " + numero + " não é primo";
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "O número " + numero + " não é primo";
            }
        }
        return "O número " + numero + " é primo";
    }
}