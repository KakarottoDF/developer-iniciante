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
        System.out.println("Melhor atleta da competição: " + triatlo.melhorAtletaDaCompeticao());
    }
}
