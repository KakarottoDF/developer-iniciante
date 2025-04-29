//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean escolha;
        int opcao;

        Veiculo veiculo = new Veiculo();


        do {
            Printer.menu(veiculo);
            opcao = Reader.lerInt("Escolha uma das opções:", "Digite um número somente de 1 a 5", 1, 5);

            switch(opcao){
                case 1:
                    View.cadastrar(veiculo);
                    break;
                case 2:
                    if(veiculo.getCarros().isEmpty()){
                        System.out.println("Não existe veículo cadastrado.");
                    }else {
                        Printer.imprimirVeiculos(veiculo);
                    }
                    break;
                case 3:
                    if(veiculo.getCarros().isEmpty() || veiculo.getMarcaDeCarros().isEmpty()){
                        System.out.println("Não existe veículo cadastrado ou não tem nenhum veículo da " + veiculo.getMARCA_CARRO());
                    }else{
                        Printer.imprimirVeiculosGM(veiculo);
                    }
                    break;
                case 4:
                    if(veiculo.getCarros().isEmpty() || veiculo.getCarrosAcimaDe100Cavalos().isEmpty()) {
                        System.out.println("Não existe veículo cadastrado ou não existem carros acima de " + veiculo.getQTD_CAVALOS() + " cavalos.");
                    }else {
                        Printer.imprimirVeiculosComMaisDeCemCavalos(veiculo);
                    }
                    break;
                case 5:
                    if(veiculo.getCarros().isEmpty() || veiculo.getQtdCarrosComPlacaEspecifica() == 0) {
                        System.out.println("Não existe veículo cadastrado ou não existem carros com a placa de início " + veiculo.getINICIO_PLACA() + ".");
                    }else {
                        Printer.imprimirQuantidadeDePlacas(veiculo);
                    }
                    break;
                default:
                    System.out.println("ERRO INESPERADO.");
                    break;
            }
            escolha = Reader.lerBoolean("Deseja encerrar o programa? [S]Sim [N]Não: ", "Escolha somente [S]Sim [N]Não: ", "S", "N");
        }while(!escolha);

    }
}