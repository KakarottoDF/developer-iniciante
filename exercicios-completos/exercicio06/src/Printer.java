public class Printer {

    private static final int GRAU_PERICULOSIDADE = 50;

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

    public static void menu(){
        System.out.println("[1] CADASTRAR TERRORISTA SUICIDA");
        System.out.println("[2] CADASTRAR TERRORISTA NÃO SUICIDA");
        System.out.println("[3] LISTAR TODOS OS TERRORISTAS CADASTRADOS");
        System.out.println("[4] LISTAR TERRORISTAS COM GRAU DE PERICULOSIDADE MAIOR QUE " + GRAU_PERICULOSIDADE);
        System.out.println("[8] SAIR");
    }
}
