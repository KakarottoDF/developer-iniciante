import java.util.ArrayList;

public class Arduino{

    public final String VERSAO_ARDUINO = "DIECIMILA";
    public final double ACRESCIMO_MLP = 0.50;
    public final int LIMITE_ENTRADAS_ANALOGICAS = 3;
    public final int QUANTIFICADOR_PRECO = 3;
    private ArrayList<Placa> placa;

    public Arduino(){
        this.placa = new ArrayList<>();
    }

    public ArrayList<Placa> getPlaca() {
        return this.placa;
    }

    public void adicionar(Placa placa){
        getPlaca().add(placa);
    }

    public double custoTotalPlacas(){
        double precoTotal = 0;

        for(Placa placa : getPlaca()){
            if(placa.isSinalMLP()){
                precoTotal += placa.getPrecoBase() + (placa.getQuantidadeDePinosDigitais() * ACRESCIMO_MLP);
            }else{
                if(placa.getQuantidadeDeEntradasAnalogicas() > QUANTIFICADOR_PRECO){
                    precoTotal += placa.getPrecoBase() * LIMITE_ENTRADAS_ANALOGICAS;
                }else{
                    precoTotal += placa.getPrecoBase();
                }
            }
        }
        return precoTotal;
    }

    public double custoPlacasQueNaoProduzemSinalMLP(){
        double precoTotal = 0;

        for(Placa placa : getPlaca()){
            if(!placa.isSinalMLP()){
                precoTotal += placa.getPrecoBase();
            }
        }
        return precoTotal;
    }

    public boolean placasRepetidas(Placa novaPlaca) {
        for (Placa placa : getPlaca()) {
            if (placa.getCodigoFabricante().equalsIgnoreCase(novaPlaca.getCodigoFabricante())) {
                System.out.println("Placa já cadastrada.");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Arduino: " +
                VERSAO_ARDUINO + getPlaca();
    }
}
