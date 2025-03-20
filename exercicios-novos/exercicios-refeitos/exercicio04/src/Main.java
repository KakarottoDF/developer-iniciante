public class Main {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        ServiceTemperatura.inserirValorCelsius(temperatura);
        ServiceTemperatura.fahrenheit(temperatura.celsius);
        Printer.printarConversao(temperatura.celsius);
    }
}