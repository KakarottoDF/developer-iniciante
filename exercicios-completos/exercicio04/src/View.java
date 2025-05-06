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

        while (continuar) {
            atleta.adicionar(cadastrarOlimpico());

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro de Sistema Administrativo? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }

        continuar = true;
        while (continuar) {
            atleta.adicionar(cadastrarParaolimpico());

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro de Sistema Corporativo? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
