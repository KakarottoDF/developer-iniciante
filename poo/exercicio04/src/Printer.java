public class Printer {
    public static void imprimirPlacas(ControleDePlaca arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println(arduino);
        }
    }

    public static void imprimirCustoTotalComAsPlacas(ControleDePlaca arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else {
            System.out.println("O custo total com as placas é de R$ " + arduino.custoTotalPlacas());
        }
    }

    public static void imprimirPlacasQueProduzemSinalMLP(ControleDePlaca arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println("Lista de placas com sinal MLP:\n");

            for(Placa placa : arduino.getPlaca()){
                if(placa != null && placa.isSinalMLP()){
                    System.out.println(placa);
                }
            }
        }
    }

    public static void imprimirCustoDePlacasSemSinalMLP(ControleDePlaca controleDePlaca){
        if(controleDePlaca.getPlaca() == null || controleDePlaca.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else {
            System.out.println("O custo total com as placas que não produzem sinal MLP é de R$ " + controleDePlaca.custoPlacasQueNaoProduzemSinalMLP());
        }
    }
}
