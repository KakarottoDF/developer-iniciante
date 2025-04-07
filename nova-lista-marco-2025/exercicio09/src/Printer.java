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
}
