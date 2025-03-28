public class Printer {
    public static void imprimirAtletas(GerenciarAtleta gerenciarAtletas){
        Atleta[] arrayAtletas = gerenciarAtletas.findAtletas();

        if(arrayAtletas == null || arrayAtletas.length == 0){
            System.out.println("Nenhum atleta cadastrado!");
        }else{
            System.out.println("Lista de atletas:\n");

            for(Atleta impressaoAtletas : arrayAtletas){
                if (impressaoAtletas != null) {
                    System.out.println(impressaoAtletas.toString());
                    System.out.println("-------------------------");
                }
            }
        }
    }
}
