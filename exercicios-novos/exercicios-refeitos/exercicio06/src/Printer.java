public class Printer {
    public static void printarFatorial(int primeiroNumero){
        System.out.println("O fatorial de " + primeiroNumero + " é " + MyMath.fatorial(primeiroNumero));
    }

    public static void printarMaiorNumero(int primeiroNumero, int segundoNumero){
        System.out.println("O maior número digitado foi " + MyMath.maiorNumero(primeiroNumero, segundoNumero));
    }

    public static void printarPar(int numero){
        System.out.println(MyMath.numeroPar(numero));
    }

    public static void printarPrimo(int numero){
        if(MyMath.isPrimo(numero) == true){
            System.out.println("O número é primo");
        }else{
            System.out.println("O número não é primo");
        }
    }
}
