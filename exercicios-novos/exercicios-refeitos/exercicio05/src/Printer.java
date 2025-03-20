public class Printer {
    public static void resultadoAdicao(double primeiroValor, double segundoValor){
        System.out.println(primeiroValor + " + " + segundoValor + " = " + ServiceUsuario.adicao(primeiroValor, segundoValor));
    }

    public static void resultadoSubtracao(double primeiroValor, double segundoValor){
        System.out.println(primeiroValor + " - " + segundoValor + " = " + ServiceUsuario.subtracao(primeiroValor, segundoValor));
    }

    public static void resultadoDivisao(double primeiroValor, double segundoValor){
        System.out.println(primeiroValor + " / " + segundoValor + " = " + ServiceUsuario.divisao(primeiroValor, segundoValor));
    }

    public static void resultadoMultiplicacao(double primeiroValor, double segundoValor){
        System.out.println(primeiroValor + " * " + segundoValor + " = " + ServiceUsuario.multiplicacao(primeiroValor, segundoValor));
    }

    public static void resultadoFatorial(double primeiroValor){
        System.out.print(primeiroValor + "! = " + ServiceUsuario.fatorial(primeiroValor));
    }

    public static void resultadoExponenciacao(double primeiroValor, double segundoValor){
        System.out.print(primeiroValor + " ^ " + segundoValor + " = " + ServiceUsuario.expoente(primeiroValor, segundoValor));
    }
}
