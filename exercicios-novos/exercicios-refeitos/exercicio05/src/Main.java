public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        ServiceUsuario.inserirPrimeiroValor(usuario);
        ServiceUsuario.escolherOperador(usuario);

        switch(usuario.getOperador()){
            case 1:
                System.out.println("ADIÇÃO");
                ServiceUsuario.inserirSegundoValor(usuario);
                Printer.resultadoAdicao(usuario);
                break;
            case 2:
                System.out.println("SUBTRAÇÃO");
                ServiceUsuario.inserirSegundoValor(usuario);
                Printer.resultadoSubtracao(usuario);
                break;
            case 3:
                System.out.println("DIVISÃO");
                ServiceUsuario.inserirSegundoValor(usuario);
                ServiceUsuario.validarDivisao(usuario);
                Printer.resultadoDivisao(usuario);
                break;
            case 4:
                System.out.println("MULTIPLICAÇÃO");
                ServiceUsuario.inserirSegundoValor(usuario);
                Printer.resultadoMultiplicacao(usuario);
                break;
            case 5:
                System.out.println("FATORIAL");
                ServiceUsuario.validarFatorial(usuario);
                Printer.resultadoFatorial(usuario);
                break;
            case 6:
                System.out.println("EXPOENTE");
                Printer.resultadoExponenciacao(usuario);
                break;
            default:
                System.out.println("Algo inesperado aconteceu.");
                break;
        }
    }
}