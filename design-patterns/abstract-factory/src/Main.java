import clientes.Cliente;
import fabricas.DeliveryFactory;
import fabricas.HamburgueriaFactory;
import fabricas.PizzariaFactory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        DeliveryFactory factory;

        if(Objects.equals(args[0], "pizzaria")){
            factory = new PizzariaFactory();
        }else{
            if(Objects.equals(args[0], "hamburgueria")){
                factory = new HamburgueriaFactory();
            }else{
                throw new Exception("Tipo do estabelecimento é obrigatório");
            }
        }
        Cliente cliente = new Cliente(factory);
        cliente.criarPedido("cebola");
    }
}