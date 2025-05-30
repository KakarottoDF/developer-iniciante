import java.util.Observable;

public class Revista extends Observable {
    private String nome;
    private double valor;
    private int qtdEmEstoque;
    private final String REVISTA = "ISTO É";

    public Revista(String nome, double valor, int qtdEmEstoque) {
        setNome(nome);
        setValor(valor);
        setQtdEmEstoque(qtdEmEstoque);
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

    public int getQtdEmEstoque() {
        return this.qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public void mudaEstado(){
        if (getNome().equals(REVISTA)) {
            setChanged();
            notifyObservers("Nova edição da revista ISTO É disponível!");
            }

    }

    @Override
    public boolean equals(Object obj){
        Revista revista = (Revista) obj;
        return getNome().equals(revista.getNome());
    }

    @Override
    public String toString() {
        return "\nREVISTA: " + getNome() +
                "\nVALOR R$ " + getValor() +
                "\nESTOQUE: " + getQtdEmEstoque() +
                "\n";
    }
}
