public class Printer {
    public static void imprimirAcoes(Administracao administracao){
        System.out.println(administracao);
    }

    public static void imprimirAcoesPrioritarias(Administracao administracao){
        System.out.println("\nações prioritárias:\n");
        administracao.findByPrioridade(true);
    }

    public static void imprimirAcoesPorTrimestre(Administracao administracao){
        System.out.println("\nações para o " + Main.TRIMESTRE_DESEJADO + "º trimestre:\n");
        administracao.findByTrimestre(Main.TRIMESTRE_DESEJADO);
    }

    public static void imprimirAcoesPorAno(Administracao administracao){
        System.out.println("\nações para " + Main.ANO_DESEJADO);
        administracao.findByAno(Main.ANO_DESEJADO);
    }


}
