public class View {

    public static Candidato cadastrarCandidato(){
        Candidato candidato = new Candidato();

        candidato.setNome(Reader.lerString("Insira o nome do candidato: "));
        candidato.setNumeroFiliacao(Reader.lerInt("Insira o número de filiação do candidato: "));
        candidato.setTipoCandidatura(Reader.lerInt("Informe o tipo de candidatura: \n[1]Deputado Federal\n[2]Deputado Distrital\n[3]Senador", "\nEscolha somente uma das opções.\n", 1, 3));
        candidato.setReeleito(Reader.lerBoolean("O candidato foi reeleito? (S/N): ", "Escolha somente [S]Sim ou [N]Não", "S", "N"));
        candidato.setVerba(Reader.lerDouble("Informe a verba do candidato: "));

        return candidato;
    }

    public static Eleicao cadastrar(Eleicao eleicao){
        boolean continuar = true;

        while(continuar){
            eleicao.adicionar(cadastrarCandidato());
            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não", "Digite somente [S]Sim [N]Não", "S", "N");
        }

        return eleicao;
    }
}
