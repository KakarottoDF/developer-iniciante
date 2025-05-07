public class View {
    public static Olimpico cadastrarOlimpico(){
        return new Olimpico(
                Reader.lerString("Informe o nome do atleta olímpico: "),
                Reader.lerChar("Sexo: [M]Masculino [F]Feminino: ", "Digite somente [M]Masculino [F]Feminino: ", 'M', 'F'),
                Reader.lerInt("Informe a idade do atleta: "),
                Reader.lerInt("Inform o número do atleta: "),
                Reader.lerInt("Informe a quantidade de títulos mundiais do atleta: ")
        );
    }

    public static Paraolimpico cadastrarParaolimpico(){
        return new Paraolimpico(
                Reader.lerString("Informe o nome do atleta olímpico: "),
                Reader.lerChar("Sexo: [M]Masculino [F]Feminino: ", "Digite somente [M]Masculino [F]Feminino: ", 'M', 'F'),
                Reader.lerInt("Informe a idade do atleta: "),
                Reader.lerInt("Inform o número do atleta: "),
                Reader.lerString("Informe o nome do responsável do atleta: ")
        );
    }

    public static void cadastrar(Atleta atleta){
        boolean continuar = true;
        while(continuar) {
            int escolha = Reader.lerInt("Digite 1 para cadastrar um atleta Olímpico\nDigite 2 para cadastrar um atleta Paraolímpico: ", "Digite somente 1 ou 2: ", 1, 2);

            switch (escolha) {
                case 1:
                    boolean continuarOlimpico = true;

                    while (continuarOlimpico) {
                        atleta.adicionar(cadastrarOlimpico());

                        continuarOlimpico = Reader.lerBoolean("Deseja continuar com o cadastro de outro atleta Olímpico? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
                    }
                    break;
                case 2:
                    boolean continuarParaolimpico = true;
                    while (continuarParaolimpico) {
                        atleta.adicionar(cadastrarParaolimpico());

                        continuarParaolimpico = Reader.lerBoolean("Deseja continuar com o cadastro de outro atleta Paraolímpico? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
                    }
                    break;
                default:
                    System.out.println("Erro inesperado!");
            }
            continuar = Reader.lerBoolean("Deseja continuar com o cadastro de outro atleta? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
