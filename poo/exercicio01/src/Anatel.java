import java.util.ArrayList;

public class Anatel {
    private ArrayList<Franquia> franquias;

    public ArrayList<Franquia> getFranquias() {
        return this.franquias;
    }

    public void adicionar(Franquia franquia){
        this.franquias.add(franquia);
    }

    @Override
    public String toString() {
        return "Anatel:" +
                "\nSistema de Controle de Franquias\n" + getFranquias();
    }
}
