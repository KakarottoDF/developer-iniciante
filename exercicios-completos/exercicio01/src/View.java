public class View {
    public static Carro cadastrarCarro(Veiculo veiculo){

        String placa;
        do {
            placa = Reader.lerString("Informe a placa deste carro: ");
            if(veiculo.placaExiste(placa)){
                System.out.println("A placa já existe, digite outra.");
            }
        }while(veiculo.placaExiste(placa));

        return new Carro(
                Reader.lerString("Informe o nome deste carro: "),
                Reader.lerString("Informe a marca deste carro: "),
                Reader.lerInt("Informe a quantidade de cavalos deste carro: "),
                placa
        );
    }

    public static void cadastrar(Veiculo veiculo){
        boolean continuar = true;

        while(continuar){
            veiculo.adicionar(cadastrarCarro(veiculo));

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
