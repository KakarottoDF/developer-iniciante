public class Printer {
    public static void imprimirAcoes(Administracao administracao){
        System.out.println(administracao);
    }

    public static void imprimirAcoesPrioritarias(Administracao administracao){
        System.out.println("AÇÕES PRIORITÁRIAS:\n\n".toLowerCase());
        administracao.findByPrioridade(true);
    }

    public static void imprimirAcoesPorTrimestre(Administracao administracao){
        System.out.println("AÇÕES PARA O " + Main.TRIMESTRE_DESEJADO + "º Trimestre:\n\n".toLowerCase());
        administracao.findByTrimestre(Main.TRIMESTRE_DESEJADO);
    }

    public static void imprimirAcoesPorAno(Administracao administracao){
        System.out.println("AÇÕES PARA O " + Main.ANO_DESEJADO + "º Ano?\n\n".toLowerCase());
        administracao.findByAno(Main.ANO_DESEJADO);
    }


}
