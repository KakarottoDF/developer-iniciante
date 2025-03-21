public class Main {
    public static void main(String[] args) {

        Corrida corrida = Leitor.lerCorrida();
        corrida.mediaTempo = ServiceCorrida.calcularMedia(corrida);
        ServiceCorrida.rankearPilotos(corrida);
        Corrida.atribuirMaisLento(corrida);
        Corrida.atribuirMaisRapido(corrida);
        Printer.printCorrida(corrida);


    }
}