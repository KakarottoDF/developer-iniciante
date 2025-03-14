import java.util.Scanner;

public class Leitor {

    public static Corrida lerCorrida(){
        int qtdPilotos = lerInt("Quantos pilotos participaram da corrida? ");
        return lerCorrida(qtdPilotos);
    }

    public static Piloto lerPiloto() {
        Piloto piloto = new Piloto();
        piloto.nome = lerString("Informe o nome do piloto: ");
        piloto.escuderia = lerString("Informe a escuderia do piloto: ");
        piloto.tempoDeVolta = lerDouble("Informe o tempo do piloto em minutos: ", "Tempo inválido!", 1, 60);
        return piloto;
    }

    public static double lerDouble(String msg, String msgError, double min, double max){
        double valor;
        do {
            valor = lerDouble(msg);
            if(valor < min || valor > max){
                System.out.println(msgError);
            }
        }while (valor < min || valor > max);
        return valor;
    }

    public static Corrida lerCorrida(int qtdPilotos){
        Corrida corrida = new Corrida();
        corrida.pilotos = new Piloto[qtdPilotos];
        for (int i = 0; i < corrida.pilotos.length; i++) {
            corrida.pilotos[i] = lerPiloto();
        }
        return corrida;
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.print(msg);
        return lerDouble();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }
}