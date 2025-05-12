import java.util.ArrayList;

public class Printer {

    public static void imprimirTodasAsPessoas(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println(gerenciadorDePessoas.getPessoas());
    }

    public static void imprimirProfessores(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println(gerenciadorDePessoas.getProfessores());
        if (!gerenciadorDePessoas.existeProfessorCadastrado()) {
            System.out.println("NÃO EXISTE PROFESSOR CADASTRADO.");
        }else {
            System.out.println("----- LISTA DE PROFESSORES -----");
            for (Professor p : gerenciadorDePessoas.getProfessores()) {
                System.out.println(p);
            }
        }
    }

    public static void imprimirAlunos(GerenciadorDePessoas gerenciador) {
        if (!gerenciador.existeAlunoCadastrado()) {
            System.out.println("NÃO HÁ ALUNOS CADASTRADOS.");
        }else {
            System.out.println("------ LISTA DE ALUNOS ------");
            for (Aluno a : gerenciador.getAlunos()) {
                System.out.println(a);
            }
        }
    }

    public static void imprimirNomeComPalavraEspecifica(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println("-------- LISTA DOS NOME QUE TEM " + gerenciadorDePessoas.getPALAVRA() + " NO NOME --------");
        gerenciadorDePessoas.acharProfessores(gerenciadorDePessoas.getPALAVRA());
    }

    public static void imprimirDoutores(GerenciadorDePessoas gerenciadorDePessoas){
        if (gerenciadorDePessoas.getProfessores().isEmpty()) {
            System.out.println("NÃO EXISTE PROFESSOR CADASTRADO.");
        } else {
            System.out.println("-------- LISTA DOS DOUTORES --------");
            gerenciadorDePessoas.acharProfessores(Titulacao.DOUTORADO);
        }
    }

    public static void imprimirProfessoresComSalarioEspecifico(GerenciadorDePessoas gerenciadorDePessoas){
        System.out.println("-------- LISTA DOS PROFESSORES COM SALÁRIO ACIMA DE " + gerenciadorDePessoas.getSALARIO() + " --------");
        gerenciadorDePessoas.acharProfessores(gerenciadorDePessoas.getSALARIO());
    }

    public static void menu(){
        System.out.println("[1] CADASTRAR PROFESSOR");
        System.out.println("[2] LISTAR PROFESSORES");
        System.out.println("[3] CADASTRAR ALUNO");
        System.out.println("[4] LISTAR ALUNOS");
        System.out.println("[5]IMPRIMIR TODOS OS PROFESSORES QUE TEM SILVA NO NOME");
        System.out.println("[6]IMPRIMIR TODOS OS DOUTORES");
        System.out.println("[7]IMPRIMIR PROFESSORES QUE RECEBEM MAIS DE R$ 12.000");
        System.out.println("[8] SAIR");
    }
}
