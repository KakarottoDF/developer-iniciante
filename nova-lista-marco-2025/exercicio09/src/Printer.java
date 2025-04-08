public class Printer {

    public static void imprimirCandidatos(Eleicao eleicao) {
        System.out.println(eleicao);
    }

    public static void imprimirCandidatosEleitos(Eleicao eleicao) {
        System.out.println("-------- CANDIDATOS REELEITOS --------");
        for (Candidato candidato : eleicao.getCandidatos()) {
            if (candidato.getReeleito()) {
                System.out.println(candidato);
            }
        }
    }

    public static void imprimirGastosNaoReeleitos(Eleicao eleicao){
        double gastoNaoReeleitos = eleicao.getCandidatos().get(0).totalGastos(eleicao, false);
        System.out.println("O total de gastos dos candidatos que não foram reeleitos é de R$ " + gastoNaoReeleitos);
    }

    public static void imprimirGastos(Eleicao eleicao){
        /*Candidato candidatoFake = eleicao.getCandidatos().get(0);
        System.out.println("A média de custos dos candidatos é de R$ " + candidatoFake.mediaGastos(eleicao));*/
        System.out.println("O total de gastos dos candidatos é de R$ " + eleicao.getCandidatos().get(0).totalGastos(eleicao));
    }

    public static void imprimirCandidatoTiririca(Eleicao eleicao){
        System.out.println("Candidatos que se chamam Tiririca:");
        for (Candidato candidato : eleicao.getCandidatos()) {
            if (candidato.getNome().equalsIgnoreCase("Tiririca")) {
                System.out.println(candidato);
            }
        }
    }

    public static void imprimirMediaCustos(Eleicao eleicao){
        /*Candidato candidatoFake = eleicao.getCandidatos().get(0);
        System.out.println("A média de custos dos candidatos é de R$ " + candidatoFake.mediaGastos(eleicao));*/
        System.out.println("A média de custos dos candidatos é de R$ " + eleicao.getCandidatos().get(0).mediaGastos(eleicao));
    }
}
