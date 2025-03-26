public class Placas {
    public String codigoFabricante;
    public int qtdPinosDigitais;
    public boolean sinaisMLP;
    public int qtdEntradasAnalogicas;
    public double precoBase;

    public boolean isCodigoFaricante(){
        boolean validador;
        if(this.codigoFabricante == null || this.codigoFabricante.isEmpty()){
            System.out.println("Você tem que digitar o código do fabricante!");
            validador = true;
        }else{
            validador = false;
        }
        return validador;
    }

    public String toString(){
        String placas =
                "Código do Fabricante: " + this.codigoFabricante +
                        "\nQuantidade de pinos digitais: " + this.qtdPinosDigitais +
                        "\nA placa tem sinal MLP? " + (this.sinaisMLP ? "Sim" : "Não") +
                        "\nQuantidade de entradas Analógicas: " + this.qtdEntradasAnalogicas +
                        "\nPreço base R$ " + this.precoBase;

        return placas;
    }

}
