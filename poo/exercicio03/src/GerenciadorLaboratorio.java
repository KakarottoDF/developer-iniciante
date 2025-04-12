import java.util.ArrayList;

public class GerenciadorLaboratorio{
    private ArrayList<Laboratorio> laboratorios;

    public int contarTipo(int tipo){
        int contador = 0;
        for(Laboratorio laboratorio : getLaboratorios()){
                for(Item item : laboratorio.getItens()) {
                    if (item.getTipo() == tipo) {
                        contador++;
                    }
                }
            }
        return contador;
    }

    public double custoTotalLaboratorios(){
        double custoTotal = 0;

        for(Laboratorio laboratorio : getLaboratorios()) {
            for (Item item : laboratorio.getItens()) {
                custoTotal += item.getPreco();
            }
        }

        return custoTotal;
    }

    public GerenciadorLaboratorio(){
        this.laboratorios = new ArrayList<>();
    }

    public ArrayList<Laboratorio> getLaboratorios() {
        return this.laboratorios;
    }

    public void adicionar(Laboratorio laboratorio){
        getLaboratorios().add(laboratorio);
    }

    public void setLaboratorios(ArrayList<Laboratorio> laboratorios) {
        this.laboratorios = laboratorios;
    }

    @Override
    public String toString() {
        return "GerenciadorLaboratorio{" +
                "laboratorios=" + getLaboratorios() +
                '}';
    }
}
