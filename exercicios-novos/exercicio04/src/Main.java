import java.util.Scanner;

/*
SINTESE
    ENTRADA: temperaturaEmCelsius
    PROCESSAMENTO: converterEmFahrenheit
    SAIDA: converterEmFahrenheit

  Implemente um programa em Java, que receba a temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
 FAR = (9 * CEL + 160) / 5,
 sendo FAR a temperatura em Fahrenheit e CEL em Celsius. Esta conversão deve ser feita por meio de um metodo com a seguinte assinatura: public static double fahrenheit(double celsius).
 O metodo deve receber a temperatura em celsius e retornar em fahrenheit. Crie outros métodos que julgar necessários.
*/
public class Main{
    public static void main(String[] args) {
        double celsius;
        double conversao;

        celsius = lerNumeros("Digite o valor da temperatura em Celsius: ");
        conversao = fahrenheit(celsius);

        System.out.println("O valor " + celsius + "ºC em Fahrenheit é igual a " + conversao + "ºF.");
    }

    public static double fahrenheit(double celsius){
        double converterFahrenheit;
        converterFahrenheit = ((9 * celsius) + 160) / 5;

        return converterFahrenheit;
    }

    public static double lerNumeros(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerNumeros(String msg){
        System.out.print(msg);
        return lerNumeros();
    }
}
