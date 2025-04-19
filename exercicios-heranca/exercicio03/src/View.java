public class View {
    public static Matematico adicionarBaseEAltura(){

        double base = Reader.lerDouble("Informe a base: ");
        double altura = Reader.lerDouble("Informe a altura: ");

        Matematico matematico = new Matematico(base, altura);

        return matematico;
    }

    public static void menu(Matematico matematico){

        System.out.println("Escolha a figura:");
        System.out.println("1 - Triângulo Retângulo");
        System.out.println("2 - Retângulo");

        int opcao = Reader.lerInt("Digite a opção: ", "Opção inválida. Tente novamente.", 1, 2);

        if (opcao == 1) {
            TrianguloRetangulo t = new TrianguloRetangulo(matematico.getBase(), matematico.getAltura());
            Printer.imprimirTrianguloRetangulo(t);
        } else {
            Triangulo r = new Triangulo(matematico.getBase(), matematico.getAltura());
            Printer.imprimirTriangulo(r);
        }
    }
}
