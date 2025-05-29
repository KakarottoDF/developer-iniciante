import java.util.ArrayList;

public class GerenciadorBanca{
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
    public String toString() {
        return "GerenciadorBanca{" +
                "moradores=" + getListaMoradores() +
                ", bancas=" + getListaBancas() +
                '}';
    }
}
