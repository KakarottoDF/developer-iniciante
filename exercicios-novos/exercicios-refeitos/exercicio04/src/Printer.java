public class Printer{
    public static void printarConversao(Temperatura temperatura){
        System.out.println("A conversão de " + temperatura.celsius + "ºC em Fahrenheit é: " + ServiceTemperatura.fahrenheit(temperatura.celsius) + "ºF");
    }
}
