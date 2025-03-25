public class Printer{
    public static void imprimirPlacas(Placas[] placasList) {
        if (placasList == null || placasList.length == 0) {
            System.out.println("Nenhuma placa cadastrada.");
        } else {
            System.out.println("Lista de Placas Cadastradas:");

            for (Placas placa : placasList) {
                if (placa != null) {
                    System.out.println("Código do Fabricante: " + placa.codigoFabricante);
                    System.out.println("Quantidade de Pinos Digitais: " + placa.qtdPinosDigitais);
                    System.out.println("Possui Sinais MLP: " + (placa.sinaisMLP ? "Sim" : "Não"));
                    System.out.println("Quantidade de Entradas Analógicas: " + placa.qtdEntradasAnalogicas);
                    System.out.println("Preço Base: R$ " + placa.precoBase);
                    System.out.println("---------------------------");
                }
            }
        }
    }
}
