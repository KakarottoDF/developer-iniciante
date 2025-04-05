public class Printer {

    public static void print(UnidadeAdministrativa unidadeAdministrativa){
        System.out.println(unidadeAdministrativa.toString());
    }

    public static void printPriorityActions(UnidadeAdministrativa unidade) {
        boolean encontrouPrioritaria = false;

        for (Acao acao : unidade.acoes) {
            if (Acao.isPrioritaria(acao.getAno())) {
                if (!encontrouPrioritaria) {
                    System.out.println("\nAÇÕES PRIORITÁRIAS PARA: " + unidade.getNome());
                    encontrouPrioritaria = true;
                }
                System.out.println(acao.toString());
            }
        }

        if (!encontrouPrioritaria) {
            System.out.println("Não existem ações prioritárias para esta Unidade Administrativa.");
        }
    }

    public static void printThirdQuarterActions(UnidadeAdministrativa unidade) {
        boolean encontrouPrioritaria = false;

        for (Acao acao : unidade.acoes) {
            if (Acao.findQuarterAction(acao.getMes()).equalsIgnoreCase("Terceiro")) {
                if (!encontrouPrioritaria) {
                    System.out.println("\nAÇÕES DO TERCEIRO TRIMESTRE DO(A) " + unidade.getNome());
                    encontrouPrioritaria = true;
                }
                System.out.println(acao.toString());
            }
        }

        if (!encontrouPrioritaria) {
            System.out.println("Não existem ações do terceiro trimestre para esta Unidade Administrativa.");
        }
    }

    public static void printQtdAcoes(UnidadeAdministrativa unidade) {
        System.out.println("Quantidade de ações para 2017: " + Acao.quantidadeAcoes(unidade));
    }
}
