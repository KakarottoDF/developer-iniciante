package fabricas;

import bebidas.Bebida;
import bebidas.Refrigerante;
import comidas.Comida;
import comidas.Pizza;

public class PizzariaFactory implements DeliveryFactory{
    @Override
    public Comida criarComida() {
        return new Pizza();
    }

    @Override
    public Bebida criarBebida() {
        return new Refrigerante();
    }
}
