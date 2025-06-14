import java.util.ArrayList;

public class GerenciadorBanca implements Validador{
    private ArrayList<Morador> listaMoradores;
    private ArrayList<Banca> listaBancas;

    public GerenciadorBanca(){
        this.listaMoradores = new ArrayList<>();
        this.listaBancas = new ArrayList<>();
    }

    public void adicionar(Morador morador){
        getListaMoradores().add(morador);
    }

    public void adicionar(Banca banca){
        getListaBancas().add(banca);
    }

    public ArrayList<Morador> getListaMoradores() {
        return this.listaMoradores;
    }

    public ArrayList<Banca> getListaBancas() {
        return this.listaBancas;
    }

    @Override
    public boolean moradorExiste(String nome){
        for(Morador morador : getListaMoradores()){
            if(morador.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean revistaExiste(String nome) {
        for (Banca banca : getListaBancas()) {
            for (Revista revista : banca.getRevistas()) {
                if (revista.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "--- SISTEMA GERENCIADOR DE BANCA ---" +
                "\nLISTA DOS MORADORES" + getListaMoradores() +
                "\nLISTA DE BANCAS" + getListaBancas() +
                "\n";
    }
}
