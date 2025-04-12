public class Placa {
    private final String CODIGO_FABRICANTE;
    private int quantidadeDePinosDigitais;
    private boolean sinalMLP;
    private int quantidadeDeEntradasAnalogicas;
    private double precoBase;

    public Placa(String codigoFabricante) {
        this.CODIGO_FABRICANTE = codigoFabricante;
    }

    public String getCodigoFabricante() {
        return this.CODIGO_FABRICANTE;
    }

    public int getQuantidadeDePinosDigitais() {
        return this.quantidadeDePinosDigitais;
    }

    public void setQuantidadeDePinosDigitais(int quantidadeDePinosDigitais) {
        this.quantidadeDePinosDigitais = quantidadeDePinosDigitais;
    }

    public boolean isSinalMLP() {
        return this.sinalMLP;
    }

    public void setSinalMLP(boolean sinalMLP) {
        this.sinalMLP = sinalMLP;
    }

    public int getQuantidadeDeEntradasAnalogicas() {
        return this.quantidadeDeEntradasAnalogicas;
    }

    public void setQuantidadeDeEntradasAnalogicas(int quantidadeDeEntradasAnalogicas) {
        this.quantidadeDeEntradasAnalogicas = quantidadeDeEntradasAnalogicas;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "\nPlaca:" +
                "\nCódigo do Fabricante:" + getCodigoFabricante() +
                "\nQuantidade de Pinos Digitais: " + getQuantidadeDePinosDigitais() +
                "\nTem Sinal MLP? " + (isSinalMLP() ? "Sim" : "Não") +
                "\nQuantidade de Entradas Analógicas: " + getQuantidadeDeEntradasAnalogicas() +
                "\nPreço Base R$ " + getPrecoBase();
    }
}
