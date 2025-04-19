public class Matematico{
    private double base;
    private double altura;

    public Matematico(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double calcularArea() {
        return getBase() * getAltura();
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
