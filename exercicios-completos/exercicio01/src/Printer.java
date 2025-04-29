public class Printer {

    public static void imprimirVeiculos(Veiculo veiculo) {
        System.out.println("\n--- TODOS OS VEÍCULOS CADASTRADOS ---");
        System.out.println(veiculo);
    }

    public static void imprimirVeiculosGM(Veiculo veiculo) {
        System.out.println("\n--- VEÍCULOS DA " + veiculo.getMARCA_CARRO() + " ---");
        for (Carro carro : veiculo.getMarcaDeCarros()) {
            System.out.println(carro);
        }
    }

    public static void imprimirVeiculosComMaisDeCemCavalos(Veiculo veiculo) {
        System.out.println("\n--- VEÍCULOS COM MAIS DE " + veiculo.getQTD_CAVALOS() + " CAVALOS ---");
        for (Carro carro : veiculo.getCarrosAcimaDe100Cavalos()) {
            System.out.println(carro);
        }
    }

    public static void imprimirQuantidadeDePlacas(Veiculo veiculo) {
        System.out.println("\n--- QUANTIDADE DE PLACAS QUE COMEÇAM COM " + veiculo.getINICIO_PLACA() + " : " + veiculo.getQtdCarrosComPlacaEspecifica());
    }
}
