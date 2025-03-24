public class Printer {

    public void imprimirEmpresas(UnidadeAdministrativa unidades){
        if (unidades.acoes == null || unidades.acoes.length == 0) {
            System.out.println("nenhuma ação cadastrada.");
        }

        System.out.println("lista de ações cadastradas:\n");
        System.out.println("nome da unidade administrativa: " + unidades.nome.toLowerCase());

        for (Acoes acoes : unidades.acoes) {
            System.out.println(acoes.toString().toLowerCase());
            System.out.println("-------------------------");
        }
    }

    public void imprimirAcoesPrioritarias(UnidadeAdministrativa unidade){
        boolean encontrouPrioritaria = false;

        System.out.println("ações prioritárias da unidade administrativa: " + unidade.nome.toLowerCase());

        for (Acoes acao : unidade.acoes) {
            if (acao.acaoPrioritaria) {
                System.out.println(acao.toString().toLowerCase());
                System.out.println("-------------------------");
                encontrouPrioritaria = true;
            }
        }

        if (!encontrouPrioritaria) {
            System.out.println("Nenhuma ação prioritária registrada.");
        }
    }

    public void imprimirAcoesTerceiroTrimestre(UnidadeAdministrativa unidade) {
        boolean encontrouTerceiroTrimestre = false;

        System.out.println("ações do terceiro trimestre da unidade administrativa: " + unidade.nome.toLowerCase());

        for (Acoes acao : unidade.acoes) {
            if (acao.trimestre.equalsIgnoreCase("Terceiro")) {
                System.out.println(acao.toString().toLowerCase());
                System.out.println("-------------------------");
                encontrouTerceiroTrimestre = true;
            }
        }

        if (!encontrouTerceiroTrimestre) {
            System.out.println("Nenhuma ação do terceiro trimestre registrada.");
        }
    }

    public void imprimirAcoes2017(UnidadeAdministrativa unidade) {
        Acoes acoes = new Acoes();

        int quantidadeAcoes2017 = acoes.contarAcoes2017(unidade);

        System.out.println("quantidade de ações que serão executadas em 2017: " + quantidadeAcoes2017);
    }
}
