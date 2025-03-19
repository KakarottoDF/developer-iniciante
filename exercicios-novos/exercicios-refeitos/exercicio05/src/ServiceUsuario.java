public class ServiceUsuario{
    public static double inserirPrimeiroValor(Usuario usuario){
        usuario.setPrimeiroValor(Leitor.lerDouble("Insira o primeiro valor: "));
        return usuario.getPrimeiroValor();
    }

    public static int escolherOperador(Usuario usuario){
        System.out.println("Escolha uma operação:");
        System.out.printf("[1]Adição\n[2]Subtração\n[3]Divisão\n[4]Multiplicação\n[5]Fatorial\n[6]Exponenciação\n");
        do {
            usuario.setOperador(Leitor.lerInt("Escolha uma operação: ", "Tem que ser um número entre 1 e 6", 1, 6));
        }while(usuario.getOperador() <= 1 && usuario.getOperador() >= 6);
        return usuario.getOperador();
    }

    public static double inserirSegundoValor(Usuario usuario){
        usuario.setSegundoValor(Leitor.lerDouble("Insira o segundo valor: "));
        return usuario.getSegundoValor();
    }

    public static double adicao(double primeiroValor, double segundoValor){
        return primeiroValor + segundoValor;
    }

    public static double subtracao(double primeiroValor, double segundoValor){
        return primeiroValor - segundoValor;
    }

    public static double validarDivisao(Usuario usuario){
        double segundoValor;
        do {
            segundoValor = Leitor.lerDouble("Insira o segundo valor (não pode ser zero para divisão): ");
            if (segundoValor == 0.0) {
                System.out.println("Não existe divisão por zero.");
            }
        } while(segundoValor == 0.0);
        usuario.setSegundoValor(segundoValor);
        return segundoValor;
    }

    public static double divisao(double primeiroValor, double segundoValor){
        return primeiroValor / segundoValor;
    }

    public static double multiplicacao(double primeiroValor, double segundoValor){
        return primeiroValor * segundoValor;
    }

    public static double fatorial(double primeiroValor) {
        int fatorial = 1;
            for (int i = 1; i <= primeiroValor; i++) {
                fatorial *= i;
            }
        return fatorial;
    }

    public static double validarFatorial(Usuario usuario){
        double primeiroValor;
        do {
            primeiroValor = Leitor.lerDouble("Insira o primeiro valor (não existe fatorial de número negativo): ");
            if (primeiroValor < 0.0) {
                System.out.println("Não existe fatorial de número negativo.");
            }
        } while(primeiroValor < 0.0);
        usuario.setPrimeiroValor(primeiroValor);
        return primeiroValor;
    }

    public static double expoente(double primeiroValor){
        double resultado = 1;
        for(int i = 0; i < primeiroValor; i++){
            resultado *= primeiroValor;
        }
        return resultado;
    }
}
