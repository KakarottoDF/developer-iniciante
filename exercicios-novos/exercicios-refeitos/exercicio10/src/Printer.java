public class Printer {

    public static void printPiloto(Piloto piloto){
        System.out.println("Nome do piloto: " + piloto.nome);
        System.out.println("Escuderia: " + piloto.escuderia);
        System.out.println("Tempo de volta: " + piloto.tempoDeVolta);
    }

    public static void printCorrida(Corrida corrida){
        for (Piloto piloto : corrida.pilotos) {
            printPiloto(piloto);
        }

        System.out.println(String.format("O tempo médio da corrida foi de: " + corrida.mediaTempo));
        System.out.println("O piloto mais rápido foi " + corrida.pilotoMaisRapido.nome + " com o tempo de " + corrida.pilotoMaisRapido.tempoDeVolta + " minutos.");
        System.out.println("O piloto mais lento foi " + corrida.pilotoMaisLento.nome + " com o tempo de " + corrida.pilotoMaisLento.tempoDeVolta + " minutos.");
    }

}
