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

    public double calcularPercentualNaoArabes() {
        int total = listaDeTerroristas.size();
        int naoArabes = 0;

        for (Terrorista t : listaDeTerroristas) {
            if (t instanceof NaoSuicida) {
                NaoSuicida ns = (NaoSuicida) t;
                if (!ns.getPaisDeOrigem().equalsIgnoreCase("ARÁBIA")) {
                    naoArabes++;
                }
            }
        }

        if (total == 0){
            return 0.0;
        }else{
            return (naoArabes * 100.0) / total;
        }
    }


    @Override
    public String toString() {
        return "---------- LISTA DE TERRORISTAS ----------" +
                "\n" +
                getListaDeTerroristas();
    }
}
