import java.util.Scanner;

public class Pessoa{
    final int TAMANHO_DO_ARRAY = 4;
    int []numeroInteiro = new int[TAMANHO_DO_ARRAY];

    public static int lerValores(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerValores(String msg){
        System.out.print(msg);
        return lerValores();
    }

    public static boolean validarValor(int numero){
        if(numero < 0){
            System.out.println("Não é aceito inserir valor negativo!");
            return true;
        }else{
            return false;
        }
    }

    public static double mediaValores(Pessoa pessoa){
        int total = 0;
        double media;
        for(int i = 0; i < pessoa.TAMANHO_DO_ARRAY; i++){
            total += pessoa.numeroInteiro[i];
        }

        media = (double) total / pessoa.TAMANHO_DO_ARRAY;
        return media;
    }

    public static int contarNumerosImpares(Pessoa pessoa) {
        int quantidadeImpares = 0;
        for (int i = 0; i < pessoa.TAMANHO_DO_ARRAY; i++) {
            if (pessoa.numeroInteiro[i] % 2 != 0) {
                quantidadeImpares++;
            }
        }
        return quantidadeImpares;
    }
}


