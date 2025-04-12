import java.util.ArrayList;

public class Laboratorio{
    private String local;
    private ArrayList<ResponsavelTecnico> responsaveisTecnicos;
    private ArrayList<Item> itens;

    public Laboratorio(){
        this.responsaveisTecnicos = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public ArrayList<ResponsavelTecnico> getResponsaveisTecnicos() {
        return this.responsaveisTecnicos;
    }

    public ArrayList<Item> getItens() {
        return this.itens;
    }

    public void adicionar(ResponsavelTecnico responsavelTecnico, Item item){
        getResponsaveisTecnicos().add(responsavelTecnico);
        getItens().add(item);
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setResponsaveisTecnicos(ArrayList<ResponsavelTecnico> responsaveisTecnicos) {
        this.responsaveisTecnicos = responsaveisTecnicos;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "local='" + getLocal() + '\'' +
                ", responsaveisTecnicos=" + getResponsaveisTecnicos() +
                ", itens=" + getItens() +
                '}';
    }
}
