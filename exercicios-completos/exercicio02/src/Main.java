//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean escolha;
        int opcao;

        GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

        do {
            Printer.menu();
            opcao = Reader.lerInt("ESCOLHA UMA DAS OPÇÕES: ", "DIGITE SOMENTE UM NÚMERO ENTRE 1 A 5", 1, 5);

            switch(opcao) {
                case 1:
                    View.cadastrar(gerenciadorDePessoas);
                    break;
                case 2:
                    if (gerenciadorDePessoas.getProfessores().isEmpty()) {
                        System.out.println("NÃO EXISTE PROFESSOR CADASTRADO.");
                    } else {
                        Printer.imprimirProfessores(gerenciadorDePessoas);
                    }
                    break;
                case 3:
                    if (gerenciadorDePessoas.getProfessores().isEmpty()) {
                        System.out.println("NÃO EXISTE PROFESSOR CADASTRADO.");
                    } else {
                        Printer.imprimirNomeComPalavraEspecifica(gerenciadorDePessoas);
                    }
                    break;
                case 4:
                    if(gerenciadorDePessoas.getProfessores().isEmpty()){
                        System.out.println("NÃO EXISTE PROFESSOR CADASTRADO.");
                    } else {
                        Printer.imprimirDoutores(gerenciadorDePessoas);
                    }
                    break;
                case 5:
                    if(gerenciadorDePessoas.getProfessores().isEmpty()){
                        System.out.println("NÃO EXISTE PROFESSOR CADASTRADO.");
                    }else {
                        Printer.imprimirProfessoresComSalarioEspecifico(gerenciadorDePessoas);
                    }
                    break;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }
            escolha = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ", "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");
        }while(!escolha);
    }
}