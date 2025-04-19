public class Printer {
    public static void imprimirTrianguloRetangulo(TrianguloRetangulo t) {
        System.out.println("\n[Triângulo Retângulo]");
        System.out.println("Base: " + t.getBase());
        System.out.println("Altura: " + t.getAltura());
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Hipotenusa: " + t.calcularHipotenusa());
    }

    public static void imprimirTriangulo(Triangulo r) {
        System.out.println("\n[Triângulo]");
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + r.calcularArea());
    }
}
