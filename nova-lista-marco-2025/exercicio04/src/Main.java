public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Placas[] placasCadastradas = reader.preencherPlacas();

        reader.preencherPlacas();
        Printer.imprimirPlacas(placasCadastradas);



    }
}