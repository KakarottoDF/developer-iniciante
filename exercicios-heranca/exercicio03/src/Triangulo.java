public class Triangulo extends Matematico{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        return getBase() * getAltura();
    }
}
