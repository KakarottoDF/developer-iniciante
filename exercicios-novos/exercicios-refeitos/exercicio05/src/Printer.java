public class Printer {
    public static void resultadoAdicao(Usuario usuario){
        System.out.println(usuario.getPrimeiroValor() + " + " + usuario.getSegundoValor() + " = " + ServiceUsuario.adicao(usuario.getPrimeiroValor(), usuario.getSegundoValor()));
    }

    public static void resultadoSubtracao(Usuario usuario){
        System.out.println(usuario.getPrimeiroValor() + " - " + usuario.getSegundoValor() + " = " + ServiceUsuario.subtracao(usuario.getPrimeiroValor(), usuario.getSegundoValor()));
    }

    public static void resultadoDivisao(Usuario usuario){
        System.out.println(usuario.getPrimeiroValor() + " / " + usuario.getSegundoValor() + " = " + ServiceUsuario.divisao(usuario.getPrimeiroValor(), usuario.getSegundoValor()));
    }

    public static void resultadoMultiplicacao(Usuario usuario){
        System.out.println(usuario.getPrimeiroValor() + " * " + usuario.getSegundoValor() + " = " + ServiceUsuario.multiplicacao(usuario.getPrimeiroValor(), usuario.getSegundoValor()));
    }

    public static void resultadoFatorial(Usuario usuario){
        System.out.print(usuario.getPrimeiroValor() + "! = " + ServiceUsuario.fatorial(usuario.getPrimeiroValor()));
    }

    public static void resultadoExponenciacao(Usuario usuario){
        System.out.print(" O expoente de " + usuario.getPrimeiroValor() + " = " + ServiceUsuario.expoente(usuario.getPrimeiroValor()));
    }
}
