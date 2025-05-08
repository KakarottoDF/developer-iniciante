public class Printer {
    public static void imprimirProfessores(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println(gerenciadorDePessoas);
    }

    public static void imprimirNomeComPalavraEspecifica(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println("-------- LISTA DOS NOME QUE TEM " + gerenciadorDePessoas.getPALAVRA() + " NO NOME --------");
        gerenciadorDePessoas.acharProfessores(gerenciadorDePessoas.getPALAVRA());
    }

    public static void imprimirDoutores(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println("-------- LISTA DOS DOUTORES --------");
        gerenciadorDePessoas.acharProfessores(Titulacao.DOUTORADO);
    }

    public static void imprimirProfessoresComSalarioEspecifico(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println("-------- LISTA DOS PROFESSORES COM SALÁRIO ACIMA DE " + gerenciadorDePessoas.getSALARIO() + " --------");
        gerenciadorDePessoas.acharProfessores(gerenciadorDePessoas.getSALARIO());
    }

    public static void menu(){
        System.out.println("[1]CADASTRO");
        System.out.println("[2]IMPRIMIR TODOS OS PROFESSORES");
        System.out.println("[3]IMPRIMIR TODOS OS PROFESSORES QUE TEM SILVA NO NOME");
        System.out.println("[4]IMPRIMIR TODOS OS DOUTORES");
        System.out.println("[5]IMPRIMIR PROFESSORES QUE RECEBEM MAIS DE R$ 12.000");
    }
}
