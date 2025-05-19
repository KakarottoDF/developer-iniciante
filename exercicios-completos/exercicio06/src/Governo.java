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
        getListaDeTerroristasNaoSuicidas().add(naoSuicida);
        getListaDeTerroristas().add(suicida);
        getListaDeTerroristas().add(naoSuicida);
    }

    public void setListaDeTerroristas(ArrayList<Terrorista> listaDeTerroristas) {
        this.listaDeTerroristas = listaDeTerroristas;
    }

    public ArrayList<Suicida> getSuicidas() {
        return suicidas;
    }

    public void setSuicidas(ArrayList<Suicida> suicidas) {
        this.suicidas = suicidas;
    }

    public ArrayList<NaoSuicida> getNaoSuicidas() {
        return naoSuicidas;
    }

    public void setNaoSuicidas(ArrayList<NaoSuicida> naoSuicidas) {
        this.naoSuicidas = naoSuicidas;
    }
}
