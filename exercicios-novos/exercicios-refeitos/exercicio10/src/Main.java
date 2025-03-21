public class Main {
    public static void main(String[] args) {

        Corrida corrida = Corrida.iniciarCorrida();
        corrida.mediaTempo = ServiceCorrida.calcularMedia(corrida);
        ServiceCorrida.rankearPilotos(corrida);
        ServiceCorrida.atribuirMaisLento(corrida);
        ServiceCorrida.atribuirMaisRapido(corrida);
        Printer.printCorrida(corrida);


    }
}