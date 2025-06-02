package clientes;

import bebidas.Bebida;
import comidas.Comida;
import fabricas.DeliveryFactory;

public class Cliente {

    private DeliveryFactory factory;

    public Cliente(DeliveryFactory factory){
        this.factory = factory;
    }

    public void criarPedido(String ingrediente){
        Comida comida = factory.criarComida();
        Bebida bebida = factory.criarBebida();

        comida.removeIngrediente(ingrediente);
        bebida.escolheSemAcucar();
    }

}
