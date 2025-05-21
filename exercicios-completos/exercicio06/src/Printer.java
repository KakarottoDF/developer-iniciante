public class Printer {

    private static final int GRAU_PERICULOSIDADE = 50;
    private static final String NOME = "MOHAMED";
    private static final int QTD_EXPLOSIVOS = 10;

    public static void imprimirListaTodosTerroristas(Governo governo){
        System.out.println(governo);
    }

    public static void imprimirListaGrauPericulosidade(Governo governo){
        for (Terrorista terrorista : governo.getListaDeTerroristas()){
            if(terrorista.grauDePericulosidade() > GRAU_PERICULOSIDADE){
                System.out.println(terrorista);
            }
        }
    }

    public static void imprimirTerroristasComNomeEspecifico(Governo governo){
        for(Terrorista terrorista : governo.getListaDeTerroristas()){
            if(terrorista.getNome().contains(NOME)){
                System.out.println(terrorista);
            }
        }
    }

    public static void imprimirQuantidadeTerroristasComExplosivos(Governo governo) {
        int contador = 0;
        for (Terrorista t : governo.getListaDeTerroristas()) {
            if (t.getQuantidadeDeExplosivos() > QTD_EXPLOSIVOS) {
                contador++;
            }
        }
        System.out.println("A QUANTIDADE DE TERRORISTAS COM MAIS DE 10 EXPLOSIVOS É DE " + contador);
    }

    public static void menu(){
        System.out.println("[1] CADASTRAR TERRORISTA SUICIDA");
        System.out.println("[2] CADASTRAR TERRORISTA NÃO SUICIDA");
        System.out.println("[3] LISTAR TODOS OS TERRORISTAS CADASTRADOS");
        System.out.println("[4] LISTAR TERRORISTAS COM GRAU DE PERICULOSIDADE MAIOR QUE " + GRAU_PERICULOSIDADE);
        System.out.println("[5] LISTAR TERRORISTAS QUE POSSUEM " + NOME + " NO NOME");
        System.out.println("[6] QUANTIDADE DE TERRORISTAS COM MAIS DE " + QTD_EXPLOSIVOS + " EXPLOSIVOS");
        System.out.println("[8] SAIR");
    }
}
