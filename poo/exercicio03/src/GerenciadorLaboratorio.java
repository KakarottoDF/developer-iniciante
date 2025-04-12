import java.util.ArrayList;

public class GerenciadorLaboratorio{
    private ArrayList<Laboratorio> laboratorios;

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
