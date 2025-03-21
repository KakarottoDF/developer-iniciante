public class Corrida{
    Piloto[] pilotos;
    Piloto pilotoMaisRapido;
    Piloto pilotoMaisLento;
    double mediaTempo;

    public static void atribuirMaisRapido(Corrida corrida){
        corrida.pilotoMaisRapido = corrida.pilotos[0];
    }

    public static void atribuirMaisLento(Corrida corrida){
        corrida.pilotoMaisLento = corrida.pilotos[corrida.pilotos.length - 1];
    }
}

