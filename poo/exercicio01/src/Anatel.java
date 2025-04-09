import java.util.ArrayList;

public class Anatel {
    private ArrayList<Franquia> franquias;

    public Anatel(){
        this.franquias = new ArrayList<>();
    }

    public ArrayList<Franquia> getFranquias() {
        return this.franquias;
    }

    public void adicionar(Franquia franquia){
        getFranquias().add(franquia);
    }

    public double precoTotal(){
        double total = 0.0;

        for(Franquia franquia : getFranquias()){
            total += franquia.getPreco();
        }
        return total;
    }

    public double media(){
        return precoTotal() / getFranquias().size();
    }

    public String franquiaMaisBarata(){
        String franquia = "";
        double menorPreco = 0.0;
        int cont = 1;

        for(Franquia franquias : getFranquias()){
            if(cont == 1){
                franquia = franquias.getNome();
                menorPreco = franquias.getPreco();
                cont++;
            }

            if(franquias.getPreco() < menorPreco) {
                franquia = franquias.getNome();
                menorPreco = franquias.getPreco();
            }
        }

        return franquia;
    }

    public int contarQuantidadeDeFranquias(String nome){
        int cont = 0;

        for(Franquia franquia : getFranquias()){

            if(franquia.getNome().equalsIgnoreCase(nome)) {
                cont++;
            }
        }
        return cont;
    }

    public int contarQuantidadeDeFranquias(int qtdGiga){
        int cont = 0;

        for(Franquia franquias : getFranquias()){
            if(franquias.getQuantidadeDeGB() > qtdGiga) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Anatel:" +
                "\nSistema de Controle de Franquias\n" + getFranquias();
    }
}
