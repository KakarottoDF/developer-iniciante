//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        View.cadastrar(veiculo);
        Printer.imprimirVeiculos(veiculo);
        Printer.imprimirVeiculosGM(veiculo);
        Printer.imprimirVeiculosComMaisDeCemCavalos(veiculo);
        Printer.imprimirQuantidadeDePlacas(veiculo);

    }
}