import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro{
    @Override
    public void frente() {
        JOptionPane.showMessageDialog(null, "Viatura segue em frente.");
    }

    @Override
    public void direita() {
        JOptionPane.showMessageDialog(null, "Viatura vira a direita.");
    }

    @Override
    public void esquerda() {
        JOptionPane.showMessageDialog(null, "Viatura vira a esquerda.");
    }

    @Override
    public void para() {
        JOptionPane.showMessageDialog(null, "Viatura vira a pára.");
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        CarroRoubado carroObservado = (CarroRoubado)arg0;
        String acao = String.valueOf(arg1);

        JOptionPane.showMessageDialog(null, "DEBUG: Ação atual do carro roubado: " + carroObservado.getAcao());

        if(acao.equals("frente")){
            this.frente();
        }else{
            if(acao.equals("direita")){
                this.direita();
            }else{
                if(acao.equals("esquerda")){
                    this.esquerda();
                }else{
                    this.para();
                }
            }
        }

    }

}
