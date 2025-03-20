public class MyMath{
    public static int fatorial(int numero){
        int fatorial = 1;
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static int maiorNumero(int primeiroNumero, int segundoNumero){
        int maiorNumero = primeiroNumero > segundoNumero ? primeiroNumero : segundoNumero;
        return maiorNumero;
    }

    public static boolean numeroPar(int numero){
        boolean par = numero % 2 == 0 ? true : false;
        return par;
    }

    public static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean controlarSaidaDoPrograma(String escolha){
        escolha = Leitor.lerString("Deseja continuar com o programa? [S]Sim [N]Não: ");
        return escolha.equals("S");
    }


}
