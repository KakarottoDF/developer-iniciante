//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean escolha;
        int opcao;

        GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

        do {
            Printer.menu();
            opcao = Reader.lerInt("Escolha uma das opções:", "Digite um número somente de 1 a 5", 1, 5);

            switch(opcao) {
                case 1:
                    View.cadastrar(gerenciadorDePessoas);
                    break;
                case 2:
                    if (gerenciadorDePessoas.getProfessores().isEmpty()) {
                        System.out.println("Não existe professor cadastrado.");
                    } else {
                        Printer.imprimirDoutores(gerenciadorDePessoas);
                    }
                    break;
                case 3:
                    if (gerenciadorDePessoas.getProfessores().isEmpty()) {
                        System.out.println("Não existe professor cadastrado.");
                    } else {
                        Printer.imprimirNomeComPalavraEspecifica(gerenciadorDePessoas);
                    }
                    break;
                case 4:
                    if(gerenciadorDePessoas.getProfessores().isEmpty()){
                        System.out.println("Não existe professor cadastrado.");
                    } else {
                        Printer.imprimirDoutores(gerenciadorDePessoas);
                    }
                    break;
                case 5:
                    if(gerenciadorDePessoas.getProfessores().isEmpty()){
                        System.out.println("Não existe professor cadastrado.");
                    }else {
                        Printer.imprimirProfessoresComSalarioEspecifico(gerenciadorDePessoas);
                    }
                    break;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }
            escolha = Reader.lerBoolean("Deseja encerrar o programa? [S]Sim [N]Não: ", "Escolha somente [S]Sim [N]Não: ", "S", "N");
        }while(!escolha);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}