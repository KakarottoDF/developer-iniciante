public class Main {
    public static void main(String[] args) {
        Corrida corrida = Leitor.lerCorrida();
        corrida.mediaTempo = ServiceCorrida.calcularMedia(corrida);
        ServiceCorrida.rankearPilotos(corrida);
        ServiceCorrida.atribuirMaisLento(corrida);
        ServiceCorrida.atribuirMaisRapido(corrida);
        Resultado.printCorrida(corrida);
    }
}