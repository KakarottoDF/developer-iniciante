public class Printer {

    public static void imprimirListaTodosTerroristas(Governo governo){
        System.out.println(governo);
    }

    public static void menu(){
        System.out.println("[1] CADASTRAR TERRORISTA SUICIDA");
        System.out.println("[2] CADASTRAR TERRORISTA NÃO SUICIDA");
        System.out.println("[3] LISTAR ARQUIVOS ORDENADOS EM FORMA DECRESCENTE POR TEMPO DE COMPILAÇÃO");
        System.out.println("[4] LISTAR ARQUIVO QUE MAIS DEMORA PARA SER COMPILADO");
        System.out.println("[7] SAIR");
    }
}
