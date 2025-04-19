public class Triangulo extends Matematico{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nÁREA DO TRIÂNGULO: " + calcularArea();
    }

}
