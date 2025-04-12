public class View {
    public static Placa cadastrarPlaca(Arduino arduino) {

        String codigo;
        do {
            codigo = Reader.lerString("Informe o código do fabricante: ");

            if (Placa.codigoEhInvalido(codigo)) {
                System.out.println("Você tem que digitar o código do fabricante!");
                continue;
            }

            if (arduino.placasRepetidas(codigo)) {
                System.out.println("Placa já cadastrada.");
                codigo = null;
            }

        } while (codigo == null);

        Placa placas = new Placa(codigo);

        placas.setQuantidadeDePinosDigitais(Reader.lerInt("Informe a quantidade de pinos digitais: "));
        placas.setSinalMLP(Reader.lerBoolean("Essa placa tem sinal MLP? [S]Sim [N]Não: ", "Digite somente [S]Sim ou [N]Não", "S", "N"));
        placas.setQuantidadeDeEntradasAnalogicas(Reader.lerInt("Informe a quantidade de entradas analógicas: "));
        placas.setPrecoBase(Reader.lerDouble("Informe o preço base desta placa R$ "));

        return placas;
    }

    public static void cadastrar(Arduino arduino){
        boolean continuar = true;

        while(continuar){
            arduino.adicionar(cadastrarPlaca(arduino));
            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }

    public static int menu(){
        int entrada;

        System.out.println("""
                Escolha uma opção\
                
                [1]Cadastrar Placas\
                
                [2]Apresentar todas as placas\
                
                [3]Custo total com as placas\
                
                [4]Todas as placas que produzem sinal MLP\
                
                [5]Custo das placas que não produzem sinal MLP""");
        entrada = Reader.lerInt("Faça a sua escolha: ", "Opção inválida! Escolha um número entre 1 e 5", 1, 5);

        return entrada;
    }
}
