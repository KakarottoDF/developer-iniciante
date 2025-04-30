public class Printer {
    public static void imprimirProfessores(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println(gerenciadorDePessoas);    }

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
}
