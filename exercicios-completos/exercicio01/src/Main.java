//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean escolha;
        int opcao;

        Veiculo veiculo = new Veiculo();


        do {
            System.out.println("[1]Cadastro");
            System.out.println("[2]Imprimir todos os carros");
            System.out.println("[3]Imprimir carros da GM");
            System.out.println("[4]Imprimir carros com mais de 100 cavalos");
            System.out.println("[5]Imprimir quantidade de carros que começam com JIB");
            opcao = Reader.lerInt("Escolha uma das opções:", "Digite um número somente de 1 a 5", 1, 5);

            switch(opcao){
                case 1:
                    View.cadastrar(veiculo);
                    break;
                case 2:
                    Printer.imprimirVeiculos(veiculo);
                    break;
                case 3:
                    Printer.imprimirVeiculosGM(veiculo);
                    break;
                case 4:
                    Printer.imprimirVeiculosComMaisDeCemCavalos(veiculo);
                    break;
                case 5:
                    Printer.imprimirQuantidadeDePlacas(veiculo);
                    break;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }
            escolha = Reader.lerBoolean("Deseja encerrar o programa? [S]Sim [N]Não", "Escolha somente [S]Sim [N]Não", "S", "N");
        }while(escolha);

    }
}