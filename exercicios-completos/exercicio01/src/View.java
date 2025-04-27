public class View {
    public static Carro cadastrarCarro(){

        return new Carro(
                Reader.lerString("Informe o nome deste carro: "),
                Reader.lerString("Informe a marca deste carro: "),
                Reader.lerInt("Informe a quantidade de cavalos deste carro: "),
                Reader.lerString("Informe a placa deste carro: ")
        );
    }

    public static void cadastrar(Veiculo veiculo){
        boolean continuar = true;

        while(continuar){
            veiculo.adicionar(cadastrarCarro());

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
