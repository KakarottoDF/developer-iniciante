public class TrianguloRetangulo extends Matematico{
    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
    }
}
