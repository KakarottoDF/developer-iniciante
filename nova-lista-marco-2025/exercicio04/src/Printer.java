public class Printer{

    public static void imprimirPlacas(GerenciarPlacas gerenciarPlacas){
        Placas[] arrayPlacas = gerenciarPlacas.findPlacas();

        if(arrayPlacas == null || arrayPlacas.length == 0){
            System.out.println("Nenhuma placa cadastrada!");
        }else{
            System.out.println("Lista de placas cadastradas:\n");

            for(Placas impressaoPlacas : arrayPlacas){
                if (impressaoPlacas != null) {
                    System.out.println(impressaoPlacas.toString());
                    System.out.println("-------------------------");
                }
            }
        }
    }

    public static void imprimirPlacasComMLP(GerenciarPlacas gerenciarPlacas) {
        Placas[] arrayPlacas = gerenciarPlacas.findPlacas();

        if (arrayPlacas == null || arrayPlacas.length == 0) {
            System.out.println("Nenhuma placa cadastrada!");
        } else {
            System.out.println("Lista de placas com sinal MLP:\n");

            for (Placas impressaoPlacas : arrayPlacas) {
                if (impressaoPlacas != null && impressaoPlacas.sinaisMLP) {
                    System.out.println(impressaoPlacas.toString());
                    System.out.println("-------------------------");
                }
            }
        }
    }

    public static void impimirCustoTotal(GerenciarPlacas gerenciarPlacas){
        if (gerenciarPlacas == null || gerenciarPlacas.findPlacas() == null || gerenciarPlacas.findPlacas().length == 0) {
            System.out.println("Nenhuma placa cadastrada para calcular o custo total.");
        } else {
            System.out.println("Custo total com as placas: R$ " + gerenciarPlacas.custoTotal());
        }
    }

    public static void impimirCustoPlacasSemMLP(GerenciarPlacas gerenciarPlacas) {
        if (gerenciarPlacas == null || gerenciarPlacas.findPlacas() == null || gerenciarPlacas.findPlacas().length == 0) {
            System.out.println("Nenhuma placa cadastrada para calcular o custo total.");
        } else {
            System.out.println("Custo total com as placas que não possuem MLP R$ " + gerenciarPlacas.somarPlacas());
        }
    }
}
