public class Printer {
    public static void imprimirAcoes(Administracao administracao){
        System.out.println(administracao);
    }

    public static void imprimirAcoesPorTrimestre(Administracao administracao){
        System.out.println("AÇÕES PARA O " + Main.TRIMESTRE_DESEJADO + "º Trimestre:\n\n");
        administracao.findByTrimestre(Main.TRIMESTRE_DESEJADO);
    }

    public static void imprimirAcoesPorAno(Administracao administracao){
        System.out.println("AÇÕES PARA O " + Main.ANO_DESEJADO + "º Ano?\n\n");
        administracao.findByAno(Main.ANO_DESEJADO);
    }


}
