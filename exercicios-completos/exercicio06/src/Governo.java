import java.util.ArrayList;

public class Governo {
    private ArrayList<Terrorista> listaDeTerroristas;
    private ArrayList<Suicida> suicidas;
    private ArrayList<NaoSuicida> naoSuicidas;

    public Governo(){
        this.listaDeTerroristas = new ArrayList<>();
    }

    public ArrayList<Terrorista> getListaDeTerroristas() {
        return this.listaDeTerroristas;
    }

    public ArrayList<Suicida> getListaDeTerroristasSuicidas() {
        return this.suicidas;
    }

    public ArrayList<NaoSuicida> getListaDeTerroristasNaoSuicidas() {
        return this.naoSuicidas;
    }

    public void adicionar(Suicida suicida, NaoSuicida naoSuicida){
        getListaDeTerroristasSuicidas().add(suicida);
        getListaDeTerroristas().add(suicida);
        getListaDeTerroristasNaoSuicidas().add(naoSuicida);
        getListaDeTerroristas().add(naoSuicida);
    }

    @Override
    public String toString() {
        return "Governo{" +
                "listaDeTerroristas=" + getListaDeTerroristas();
    }
}
