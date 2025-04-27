import java.util.ArrayList;

public class Veiculo {
    private String nome;
    private String marca;
    private int cavalos;
    private String placa;
    ArrayList<Carro> carros;

    public Veiculo(String nome, String marca, int cavalos, String placa) {
        setNome(nome);
        setMarca(marca);
        setCavalos(cavalos);
        setPlaca(placa);
    }

    public Veiculo() {
        this.carros = new ArrayList<>();
    }

    public void adicionar(Carro carro){
            getCarros().add(carro);
    }

    public ArrayList<Carro> getCarros() {
        return this.carros;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCavalos() {
        return this.cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "VEÍCULOS CADASTRADOS" +
                "\nLISTA DOS CARROS:" + getCarros();
    }
}
