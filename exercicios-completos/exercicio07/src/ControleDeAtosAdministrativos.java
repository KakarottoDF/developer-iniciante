import java.util.ArrayList;

public class ControleDeAtosAdministrativos {
    private ArrayList<AtoAdministrativo> listaAtoAdministrativos;

    public ControleDeAtosAdministrativos() {
        this.listaAtoAdministrativos = new ArrayList<>();
    }

    public ArrayList<AtoAdministrativo> getListaAtoAdministrativos() {
        return listaAtoAdministrativos;
    }

    @Override
    public String toString() {
        return "ControleDeAtosAdministrativos{" +
                "listaAtoAdministrativos=" + getListaAtoAdministrativos() +
                '}';
    }
}
