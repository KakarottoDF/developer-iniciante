import java.util.Observable;

public class Revista extends Observable {
    private String nome;
    private double valor;
    private int qtdRevistas;

    public Revista(String nome, double valor, int qtdRevistas) {
        setNome(nome);
        setValor(valor);
        setQtdRevistas(qtdRevistas);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdRevistas() {
        return this.qtdRevistas;
    }

    public void setQtdRevistas(int qtdRevistas) {
        this.qtdRevistas = qtdRevistas;
    }

    public void mudaEstado(){
        setChanged();
        notifyObservers(getNome());
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nome='" + getNome() + '\'' +
                ", valor=" + getValor() +
                ", qtdRevistas=" + getQtdRevistas() +
                '}';
    }
}
