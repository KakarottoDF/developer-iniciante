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

    /*A UCB deseja gerenciar as salas de laboratórios de toda a universidade. Os
    laboratórios são locais que a universidade emprega recursos de todos os tipos para dar prática à vida acadêmica dos estudantes. A área de logística da universidade
    contratou uma fábrica de software para criação de um sistema para gerenciar estas
    informações. O analista de requisitos da fábrica de software entendeu que um
    Laboratório tem local, responsável técnico com matrícula, nome e cargo (TECNICO OU ANALISTA) e este laboratório é composto de Itens. Cada item tem uma
    descrição, código, preço e um tipo (TECNOLOGIA OU OUTROS). O sistema deve
    permitir o cadastro dos laboratórios enquanto o usuário desejar e na sequência
    fazer o seguinte*/
}
