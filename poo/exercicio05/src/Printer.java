public class Printer{
    public static void imprimirAtletas(Triatlo triatlo){
        System.out.println(triatlo.getAtleta());
    }

    public static void imprimirAtletaDeElite(Triatlo triatlo){
        System.out.println("------- LISTA ATLETAS DE ELITE -------");
        for(Atleta atleta : triatlo.getAtleta()){
            if(atleta.isElite()){
                System.out.println("NOME: " + atleta.getNome());
            }
        }
    }

    public static void imprimirMelhorAtletaDaCompeticao(Triatlo triatlo){
        System.out.println("\nMELHOR ATLETA DA COMPETIÇÃO: " + triatlo.melhorAtletaDaCompeticao());
    }

    public static void imprimirAtltasDaCategoria(Triatlo triatlo){
        System.out.println("\nATLETAS DA CATEGORIA DE 30 A 34 ANOS:");
        triatlo.procurarAtletasDeCategoriaDeBase();
    }

    public static void imprimirMediaDeTempoDosAtletas(Triatlo triatlo){
        System.out.println("A média de tempo de todos os atletas é de " + triatlo.mediaTempoDosAtletas());
    }
}
