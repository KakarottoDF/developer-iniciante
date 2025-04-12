public class Printer {
    public static void imprimirPlacas(ControleDePlaca placas){
        if(placas.getPlaca() == null || placas.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println(placas);
        }
    }

    public static void imprimirCustoTotalComAsPlacas(ControleDePlaca placas){
        if(placas.getPlaca() == null || placas.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else {
            System.out.println("O custo total com as placas é de R$ " + placas.custoTotalPlacas());
        }
    }

    public static void imprimirPlacasQueProduzemSinalMLP(ControleDePlaca placas){
        if(placas.getPlaca() == null || placas.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println("Lista de placas com sinal MLP:\n");

            for(Placa placa : placas.getPlaca()){
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
