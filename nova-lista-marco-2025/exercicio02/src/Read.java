import java.util.Scanner;

public class Read {

    public String setString(){
        return new Scanner(System.in).nextLine().trim().toLowerCase();
    }

    public String setString(String msg){
        System.out.print(msg);
        return setString();
    }

    public int setInt(){
        return new Scanner(System.in).nextInt();
    }

    public int setInt(String msg){
        System.out.print(msg);
        return setInt();
    }

    public int setInt(String msg, String msgError, int min, int max){
        int valor;
        do {
            valor = setInt(msg);
            if(valor < min || valor > max){
                System.out.println(msgError);
            }
        }while (valor < min || valor > max);
        return valor;
    }

    public boolean setBoolean(){
        return new Scanner(System.in).nextBoolean();
    }

    public boolean setBoolean(String msg){
        System.out.print(msg);
        return setBoolean();
    }

    public boolean setBoolean(String msg, String msgError, String sim, String nao){
        String escolha;
        boolean retornoEscolha = true;
        do {
            escolha = setString(msg);
            if(!escolha.equalsIgnoreCase(sim) && !escolha.equalsIgnoreCase(nao)){
                System.out.println(msgError);
            } else {
                if(escolha.equalsIgnoreCase(sim)){
                    retornoEscolha = true;
                } else {
                    retornoEscolha = false;
                }
            }
        } while (!escolha.equalsIgnoreCase(sim) && !escolha.equalsIgnoreCase(nao));
        return retornoEscolha;
    }

    public Acao setAcoes(){
        Acao acoes = new Acao();
        acoes.descricao = setString("Informe a descrição desta ação: ");
        acoes.mes = setInt("Informe o mês desta ação em números: ", "O mês tem que ser entre 1 até 12", 1, 12);
        setTrimestre(acoes, acoes.mes);
        acoes.ano = setInt("Informe o ano desta ação: ", "O ano não pode ser menor que 2015 e nem maior que 2020", 2015, 2020);
        acoes.acaoPrioritaria = setBoolean("Esta é uma ação prioritária? [S]Sim [N]Não: ", "Digite somente [S]SIm ou [N]Não", "S", "N");

        return acoes;
    }

    public Acao setTrimestre(Acao acoes, int mes){
        switch(mes){
            case 1, 2, 3:
                acoes.trimestre = "Primeiro";
                break;
            case 4, 5, 6:
                acoes.trimestre = "Segundo";
                break;
            case 7, 8, 9:
                acoes.trimestre = "Terceiro";
                break;
            case 10, 11, 12:
                acoes.trimestre = "Quarto";
                break;
        }
        return acoes;
    }

    public UnidadeAdministrativa setUnidadeAdministrativa(){
        UnidadeAdministrativa unidade = new UnidadeAdministrativa();

        unidade.nome = setString("Informe o nome da unidade administrativa: ");

        return setUnidadeAdministrativa(unidade);
    }

    public UnidadeAdministrativa setUnidadeAdministrativa
            (UnidadeAdministrativa unidade){
        int quantidadeDeAcoes = setInt("Quantas ações tem essa unidade administrativa? ");

        unidade.quantidadeDeAcoes = quantidadeDeAcoes;
        unidade.acoes = new Acao[quantidadeDeAcoes];

        for (int i = 0; i < unidade.acoes.length; i++) {
            unidade.acoes[i] = setAcoes();
        }

        return unidade;
    }
}
