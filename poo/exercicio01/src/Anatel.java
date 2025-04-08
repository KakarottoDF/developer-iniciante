import java.util.ArrayList;

public class Anatel {
    private ArrayList<Franquia> franquia;

    public Anatel(){
        this.franquia = new ArrayList<>();
    }

    public ArrayList<Franquia> getFranquia() {
        return this.franquia;
    }

    public void adicionar(Franquia franquia){
        getFranquia().add(franquia);
    }

    @Override
    public String toString() {
        return "Anatel:" +
                "\nSistema de Controle de Franquias\n" + getFranquia();
    }
}
