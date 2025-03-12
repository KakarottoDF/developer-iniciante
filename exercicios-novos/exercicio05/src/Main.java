/*
SINTESE
    ENTRADA: primeiroNumero, segundoNumero
    PROCESSAMENTO: adicionar, subtrair, dividir, multiplicar, fatorial e expoente
    SAIDA: resultado (adicionar, subtrair, dividir, multiplicar, fatorial e expoente)
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean flag;
        Usuario usuario = new Usuario();

        usuario.primeiroValor = lerValor("Digite o primeiro valor: ");
        operadores();
        usuario.operador = lerValor("Qual é o tipo de operação escolhida? ");

        switch(usuario.operador){
            case 1:
                usuario.segundoValor = lerValor("Digite o segundo valor: ");
                System.out.println(adicao(usuario.primeiroValor, usuario.segundoValor));
                break;
            case 2:
                usuario.segundoValor = lerValor("Digite o segundo valor: ");
                System.out.println(subtracao(usuario.primeiroValor, usuario.segundoValor));
                break;
            case 3:
                do {
                    usuario.segundoValor = lerValor("Digite o segundo valor: ");
                    if(usuario.segundoValor == 0){
                        System.out.println("Não existe divisão por zero!");
                        flag = true;
                    }else{
                        if(usuario.segundoValor < 0){
                            System.out.println("O sistema ainda não suporta divisão por número negativo.");
                            flag = true;
                        }else{
                            flag = false;
                        }
                    }
                }while(flag);

                System.out.println(divisao(usuario.primeiroValor, usuario.segundoValor));
                break;
            case 4:
                usuario.segundoValor = lerValor("Digite o segundo valor: ");
                System.out.println(multiplicacao(usuario.primeiroValor, usuario.segundoValor));
                break;
            case 5:
                System.out.println(fatorial(usuario.primeiroValor));
                break;
            case 6:
                usuario.segundoValor = lerValor("Digite o expoente desejado: ");
                System.out.println(expoente(usuario.segundoValor));
                break;
            default:
                System.out.println("Escolha inválida. O sistema irá encerrar!");
                break;
        }

    }

    public static int adicao(int num1, int num2){
        System.out.println("ADIÇÃO:");
        System.out.print(num1 + " + " + num2 + " = ");
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2){
        System.out.println("SUBTRAÇÃO:");
        System.out.print(num1 + " - " + num2 + " = ");
        return num1 - num2;
    }

    public static int divisao(int num1, int num2){
        System.out.println("DIVISÃO:");
        System.out.print(num1 + " / " + num2 + " = ");
        return num1 / num2;
    }

    public static int multiplicacao(int num1, int num2){
        System.out.println("MULTIPLICAÇÃO:");
        System.out.print(num1 + " * " + num2 + " = ");
        return num1 * num2;
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

    public static int expoente(int num2){
        int resultado = 1;
        for(int i = 0; i < num2; i++){
            resultado *= num2;
        }
        System.out.println("O resultado dessa exponenciação é ");
        return resultado;
    }

    public static int lerValor(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerValor(String msg){
        System.out.print(msg);
        return lerValor();
    }

    public static String operadores(){
        System.out.println("ESCOLHA UMA OPÇÃO:");
        System.out.println("1 - ADIÇÃO");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        System.out.println("5 - FATORIAL");
        System.out.println("6 - EXPONENCIAÇÃO");

        return "";
    }
}

class Usuario{
    int primeiroValor;
    int operador;
    int segundoValor;
}
