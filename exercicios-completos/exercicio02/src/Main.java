public class Main {
    public static void main(String[] args) {
        boolean escolha;
        int opcao;

        GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

        do {
            Printer.menu();
            opcao = Reader.lerInt("ESCOLHA UMA DAS OPÇÕES: ", "DIGITE SOMENTE UM NÚMERO ENTRE 1 A 8", 1, 8);

            switch(opcao) {
                case 1:
                    View.cadastrarProfessores(gerenciadorDePessoas);
                    break;
                case 2:
                    Printer.imprimirProfessores(gerenciadorDePessoas);
                    break;
                case 3:
                    View.cadastrarAlunos(gerenciadorDePessoas);
                    break;
                case 4:
                    Printer.imprimirAlunos(gerenciadorDePessoas);
                    break;
                case 5:
                    Printer.imprimirNomeComPalavraEspecifica(gerenciadorDePessoas);
                    break;
                case 6:
                    Printer.imprimirDoutores(gerenciadorDePessoas);
                    break;
                case 7:
                    Printer.imprimirProfessoresComSalarioEspecifico(gerenciadorDePessoas);
                    break;
                case 8:
                    escolha = true;
                    continue;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }

            escolha = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO: ", "ESCOLHA SOMENTE [S]SIM [N]NÃO: ", "S", "N");

        } while (!escolha);

        Printer.imprimirTodasAsPessoas(gerenciadorDePessoas);
    }
}