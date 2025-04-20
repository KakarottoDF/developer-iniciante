public enum ClasseSocial {
    A1(14400.00),
    A2(8100.00),
    B(4600.00),
    C(2300.00),
    D(1400.00),
    E(950.00),
    F(400.00);

    private final double rendaMinima;

    ClasseSocial(double rendaMinima) {
        this.rendaMinima = rendaMinima;
    }

    public double getRendaMinima() {
        return this.rendaMinima;
    }

    @Override
    public String toString() {
        return name();
    }
}
