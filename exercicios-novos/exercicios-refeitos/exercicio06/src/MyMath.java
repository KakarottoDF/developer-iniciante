public class MyMath{
    public static int fatorial(int numero){
        int fatorial = 1;
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static boolean controlarSaidaDoPrograma(String escolha){
        escolha = Leitor.lerString("Deseja continuar com o programa? [S]Sim [N]Não: ");
        return escolha.equals("S");
    }


}
