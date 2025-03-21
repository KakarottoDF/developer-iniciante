public class Corrida{
    Piloto[] pilotos;
    Piloto pilotoMaisRapido;
    Piloto pilotoMaisLento;
    double mediaTempo;

    public static Corrida iniciarCorrida(){
        int qtdPilotos = Leitor.lerInt("Quantos pilotos participaram da corrida? ");
        return iniciarCorrida(qtdPilotos);
    }

    public static Corrida iniciarCorrida(int qtdPilotos){
        Corrida corrida = new Corrida();
        corrida.pilotos = new Piloto[qtdPilotos];
        for (int i = 0; i < corrida.pilotos.length; i++) {
            corrida.pilotos[i] = Piloto.setPiloto();
        }
        return corrida;
    }
}

