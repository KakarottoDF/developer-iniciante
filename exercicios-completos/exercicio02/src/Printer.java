public class Printer {
    public static void imprimirProfessores(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println(gerenciadorDePessoas);    }

    public static void imprimirNomeComPalavraEspecifica(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println("-------- LISTA DOS NOME QUE TEM " + gerenciadorDePessoas.getPALAVRA() + " NO NOME --------");
        gerenciadorDePessoas.acharPalavraEspecificaNoNome();
    }
}
