public class View{
    public static Atleta cadastrarAtleta(Triatlo triatlo){
        int numeroInscricao;
        String nome;

        do{
            numeroInscricao = Reader.lerInt("Informe o número de inscrição do atleta: ");
            if(Triatlo.informacaoInvalida(numeroInscricao)){
                System.out.println("Você tem que digitar um número de inscrição.");
                numeroInscricao = 0;
            }
            if (triatlo.informacaoRepetida(numeroInscricao)) {
                System.out.println("Inscrição já cadastrado.");
                numeroInscricao = 0;
            }
        }while(numeroInscricao == 0);

        do{
            nome = Reader.lerString("Informe o nome deste atleta: ");

            if (Triatlo.informacaoInvalida(nome)) {
                System.out.println("Você tem que digitar um nome válido para o atleta.");
                nome = null;
            }

            if (triatlo.informacaoRepetida(nome)) {
                System.out.println("Nome já cadastrado.");
                nome = null;
            }
        }while(nome == null);


        Atleta atleta = new Atleta(numeroInscricao, nome);

        atleta.setTempoDeProva(Reader.lerInt("Informe o tempo de prova deste atleta: "));
        atleta.isElite();
        atleta.setIdade(Reader.lerInt("Informe a idade deste atleta: "));

        return atleta;
    }

    public static void cadastrar(Triatlo triatlo){
        boolean continuar = true;

        while(continuar){
            triatlo.adicionar(cadastrarAtleta(triatlo));

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
