public class Main {
    public static void main(String[] args) {
        Arduino arduino = new Arduino();
        boolean flag;
        do{
            switch (View.menu()){
                case 1:
                    View.cadastrar(arduino);
                    break;
                case 2:
                    Printer.imprimirPlacas(arduino);
                    break;
                default:
                    System.out.println("Erro inesperado.");
            }
            flag = Reader.lerBoolean("\nVoltar para o menu principal? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }while(flag);





    }
}