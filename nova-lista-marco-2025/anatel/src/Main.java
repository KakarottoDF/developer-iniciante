

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Anatel anatel = View.lerAnatel();
        int qtd2GB = anatel.countFranquiasByGB(2);
        System.out.println("A QUANTIDADE DE FRANQUIAS É:" + qtd2GB);
        System.out.println("--------TODAS AS FRANQUIAS--------");
        for (Franquia f : anatel.getFranquias()) {
            System.out.println(f);
        }
    }
}