import java.util.ArrayList;

public class Laboratorio{
    private String local;
    private ArrayList<ResponsavelTecnico> responsaveisTecnicos;
    private ArrayList<Item> itens;

    public int contarItensByLaboratorio(String nomeLaboratorio) {
        if (this.local.equalsIgnoreCase(nomeLaboratorio)) {
            return getItens().size();
        }
        return 0;
    }

    /*public int contarItensByLaboratorio(String nomeLaboratorio){
        int contador = 0;
        for (Item item : getItens()) {
            if (getLocal().equalsIgnoreCase(nomeLaboratorio) && item.getTipo() > 0) {
                contador++;
            }
        }
        return contador;
    }*/

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
        return "\n=== GERENCIADOR DE LABORATÓRIOS ===" +
                "\nLOCAL: " + getLocal() +
                "\nResponsáveis Técnicos: " + getResponsaveisTecnicos() +
                "\nItens do Laboratório: " + getItens() + "\n";
    }
}
