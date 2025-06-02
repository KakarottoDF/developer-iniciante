package comidas;

public class Pizza implements Comida{
    @Override
    public void removeIngrediente(String nome) {
        System.out.println("Removido o ingrediente %s da pizza!".formatted(nome));
    }
}
