import java.util.ArrayList;

public class Governo {
    private ArrayList<Terrorista> listaDeTerroristas;

    public Governo(){
        this.listaDeTerroristas = new ArrayList<>();
    }

    public ArrayList<Terrorista> getListaDeTerroristas() {
        return this.listaDeTerroristas;
    }


    public void adicionar(Terrorista terrorista){
        getListaDeTerroristas().add(terrorista);
    }

    @Override
    public String toString() {
        return "---------- LISTA DE TERRORISTAS ----------" +
                "\n" +
                getListaDeTerroristas();
    }
}
