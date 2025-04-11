public class Printer {
    public static void imprimirPlacas(Arduino arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println(arduino.getPlaca());
        }
    }

    public static void imprimirCustoTotalComAsPlacas(Arduino arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else {
            System.out.println("O custo total com as placas é de R$ " + arduino.custoTotalPlacas());
        }
    }

    public static void imprimirPlacasQueProduzemSinalMLP(Arduino arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println("Lista de placas com sinal MLP:\n");

            for(Placa placa : arduino.getPlaca()){
                if(placa != null && placa.isSinalMLP()){
                    System.out.println(arduino.getPlaca());
                }
            }
        }
    }

    public static void imprimirCustoDePlacasSemSinalMLP(Arduino arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else {
            System.out.println("O custo total com as placas que não produzem sinal MLP é de R$ " + arduino.custoPlacasQueNaoProduzemSinalMLP());
        }
    }
}
