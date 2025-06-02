package fabricas;

import bebidas.Bebida;
import bebidas.MilkShake;
import bebidas.Refrigerante;
import comidas.Comida;
import comidas.Hamburguer;

public class HamburgueriaFactory implements DeliveryFactory{
    @Override
    public Comida criarComida() {
        return new Hamburguer();
    }

    @Override
    public Bebida criarBebida() {
        return new MilkShake();
    }
}
