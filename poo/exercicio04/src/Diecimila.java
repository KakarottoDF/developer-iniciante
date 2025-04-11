public class Diecimila {
    private String codigo;
    private int pinosDigitais;
    private boolean sinalMLP;
    private int entradaAnalogica;
    private double precoBase;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPinosDigitais() {
        return pinosDigitais;
    }

    public void setPinosDigitais(int pinosDigitais) {
        this.pinosDigitais = pinosDigitais;
    }

    public boolean isSinalMLP() {
        return sinalMLP;
    }

    public void setSinalMLP(boolean sinalMLP) {
        this.sinalMLP = sinalMLP;
    }

    public int getEntradaAnalogica() {
        return entradaAnalogica;
    }

    public void setEntradaAnalogica(int entradaAnalogica) {
        this.entradaAnalogica = entradaAnalogica;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Diecimila{" +
                "codigo='" + getCodigo() + '\'' +
                ", pinosDigitais=" + getPinosDigitais() +
                ", sinalMLP=" + (isSinalMLP() ? "Sim" : "Não") +
                ", entradaAnalogica=" + getEntradaAnalogica() +
                ", precoBase=" + getPrecoBase() +
                '}';
    }
}
