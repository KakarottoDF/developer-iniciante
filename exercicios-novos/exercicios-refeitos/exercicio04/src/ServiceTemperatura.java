public class ServiceTemperatura{
    public static Temperatura inserirValorCelsius(Temperatura temperatura){
      temperatura.celsius = Leitor.lerDouble("Insira o valor em Celsius: ");
      return temperatura;
    }

    public static double fahrenheit(double celsius){
        double farenheit;
        farenheit = (9 * celsius + 160) / 5;
        return farenheit;
    }
}
