public class Printer {

    public void imprimirEmpresas(UnidadeAdministrativa unidades){
        Acao[] acoes = unidades.findEmpresas();

        if (acoes == null || acoes.length == 0) {
            System.out.println("Nenhuma ação cadastrada.");
        } else {
            System.out.println("Lista de ações cadastradas:\n");
            System.out.println("Nome da unidade administrativa: " + unidades.nome.toLowerCase());

            for (Acao acao : acoes) {
                System.out.println(acao.toString().toLowerCase());
                System.out.println("-------------------------");
            }
        }
    }

    public void imprimirAcoesPrioritarias(UnidadeAdministrativa unidade){
        boolean encontrouPrioritaria = false;

        System.out.println("ações prioritárias da unidade administrativa: " + unidade.nome.toLowerCase());

        for (Acao acao : unidade.acoes) {
            if (acao.isAcaoPrioritaria()) {
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

        for (Acao acao : unidade.acoes) {
            if (acao.getNomeTrimestre().equalsIgnoreCase("Terceiro")) {
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

        System.out.println("quantidade de ações que serão executadas em 2017: " + unidade.quantidadeAcoesPrioritarias(unidade));
    }
}
