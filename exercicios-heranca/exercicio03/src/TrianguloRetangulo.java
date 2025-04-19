public class TrianguloRetangulo extends Matematico{
    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nÁREA: " + calcularArea() +
                "\nHIPOTENUSA: " + calcularHipotenusa();
    }

}
