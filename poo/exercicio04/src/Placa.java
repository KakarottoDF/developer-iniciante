public class Placa {
    private String codigoFabricante;
    private int quantidadeDePinosDigitais;
    private boolean sinalMLP;
    private int quantidadeDeEntradasAnalogicas;
    private double precoBase;

    public boolean isCodigoFabricante(){
        if(getCodigoFabricante() == null || getCodigoFabricante().isEmpty()){
            System.out.println("Você tem que digitar o código do fabricante!");
            return true;
        }
        return false;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public int getQuantidadeDePinosDigitais() {
        return quantidadeDePinosDigitais;
    }

    public void setQuantidadeDePinosDigitais(int quantidadeDePinosDigitais) {
        this.quantidadeDePinosDigitais = quantidadeDePinosDigitais;
    }

    public boolean isSinalMLP() {
        return sinalMLP;
    }

    public void setSinalMLP(boolean sinalMLP) {
        this.sinalMLP = sinalMLP;
    }

    public int getQuantidadeDeEntradasAnalogicas() {
        return quantidadeDeEntradasAnalogicas;
    }

    public void setQuantidadeDeEntradasAnalogicas(int quantidadeDeEntradasAnalogicas) {
        this.quantidadeDeEntradasAnalogicas = quantidadeDeEntradasAnalogicas;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Placa{" +
                "codigo='" + getCodigoFabricante() + '\'' +
                ", pinosDigitais=" + getQuantidadeDePinosDigitais() +
                ", sinalMLP=" + (isSinalMLP() ? "Sim" : "Não") +
                ", entradaAnalogica=" + getQuantidadeDeEntradasAnalogicas() +
                ", precoBase=" + getPrecoBase() +
                '}';
    }
}
