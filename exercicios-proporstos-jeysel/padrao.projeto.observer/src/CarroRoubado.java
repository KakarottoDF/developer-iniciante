import javax.swing.*;
import java.util.Observable;

public class CarroRoubado extends Observable implements Carro{
    private String acao = "";

    @Override
    public void frente() {
        setAcao("frente");
        JOptionPane.showMessageDialog(null, "Carro roubado segue em frente.");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        setAcao("direita");
        JOptionPane.showMessageDialog(null, "Carro roubado vira a direita.");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        setAcao("esquerda");
        JOptionPane.showMessageDialog(null, "Carro roubado vira a esquerda.");
        this.mudaEstado();
    }

    @Override
    public void para() {
        setAcao("pára");
        JOptionPane.showMessageDialog(null, "Carro roubado pára");
        this.mudaEstado();
    }

    public void mudaEstado(){
        setChanged();
        notifyObservers(getAcao());
    }

    public String getAcao() {
        return this.acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
