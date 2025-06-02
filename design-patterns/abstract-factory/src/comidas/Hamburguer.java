package comidas;

public class Hamburguer implements Comida{
    @Override
    public void removeIngrediente(String nome) {
        System.out.println("Removido o ingrediente %s do hambúrguer!".formatted(nome));
    }
}
