public class Carro extends Veiculo{
    public Carro(String nome, String marca, int cavalos, String placa) {
        super(nome, marca, cavalos, placa);
    }

    @Override
    public String toString() {
        return "\nCARRO:" +
                "\nNOME: " + getNome() +
                "\nMARCA: " + getMarca() +
                "\nQUANTIDADE DE CAVALOS: " + getCavalos() +
                "\nPLACA: " + getPlaca() +
                "\n";
    }
}
