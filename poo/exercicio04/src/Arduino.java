import java.util.ArrayList;

public class Arduino{

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
        return "Arduino{" +
                "placa=" + getPlaca() +
                '}';
    }
}
