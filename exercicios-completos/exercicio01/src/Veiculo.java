import java.util.ArrayList;

public class Veiculo {
    private String nome;
    private String marca;
    private int cavalos;
    private String placa;
    ArrayList<Carro> carros;

    private final String MARCA_CARRO = "GM";
    private final String INICIO_PLACA = "JIB";
    private final int QTD_CAVALOS = 100;

    public Veiculo(String nome, String marca, int cavalos, String placa) {
        setNome(nome);
        setMarca(marca);
        setCavalos(cavalos);
        setPlaca(placa);
    }

    public Veiculo() {
        this.carros = new ArrayList<>();
    }

    public ArrayList<Carro> getCarros() {
        return this.carros;
    }

    public void adicionar(Carro carro){
        getCarros().add(carro);
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

    public String getMARCA_CARRO() {
        return this.MARCA_CARRO;
    }

    public String getINICIO_PLACA() {
        return this.INICIO_PLACA;
    }

    public int getQTD_CAVALOS() {
        return this.QTD_CAVALOS;
    }

    public boolean placaExiste(String placa) {
        Carro novoCarro = new Carro("", "", 0, placa);
        return getCarros().contains(novoCarro);
    }

    public ArrayList<Carro> getMarcaDeCarros() {
        ArrayList<Carro> resultado = new ArrayList<>();
        for (Carro carro : getCarros()) {
            if (carro.getMarca().equalsIgnoreCase(getMARCA_CARRO())) {
                resultado.add(carro);
            }
        }
        return resultado;
    }

    public ArrayList<Carro> getCarrosAcimaDe100Cavalos() {
        ArrayList<Carro> resultado = new ArrayList<>();
        for (Carro carro : getCarros()) {
            if (carro.getCavalos() > getQTD_CAVALOS()) {
                resultado.add(carro);
            }
        }
        return resultado;
    }

    public int getQtdCarrosComPlacaEspecifica() {
        int contador = 0;
        for (Carro carro : getCarros()) {
            if (carro.getPlaca().startsWith(getINICIO_PLACA())) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "VEÍCULOS CADASTRADOS" +
                "\nLISTA DOS CARROS:" + getCarros();
    }
}
