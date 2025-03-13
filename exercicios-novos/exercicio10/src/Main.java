public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        corrida.quantidadeDeVoltas = Leitor.lerInt("Digite a quantidade de voltas: ");

        Piloto pilotos = new Piloto();

        Inicializador.iniciarArrays(pilotos, corrida);
        Leitor.lerPiloto(pilotos, corrida.quantidadeDeVoltas);

        Resultado.resultdoDaCorrida(pilotos, corrida);
    }
}