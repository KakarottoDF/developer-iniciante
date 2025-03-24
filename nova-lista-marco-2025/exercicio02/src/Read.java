import java.lang.module.FindException;
import java.util.Scanner;

public class Read {

    public String getString(){
        return new Scanner(System.in).nextLine().trim().toLowerCase();
    }

    public String getString(String msg){
        System.out.print(msg);
        return getString();
    }

    public int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public int getInt(String msg){
        System.out.print(msg);
        return getInt();
    }

    public int getInt(String msg, String msgError, int min, int max){
        int valor;
        do {
            valor = getInt(msg);
            if(valor < min || valor > max){
                System.out.println(msgError);
            }
        }while (valor < min || valor > max);
        return valor;
    }

    public boolean getBoolean(){
        return new Scanner(System.in).nextBoolean();
    }

    public boolean getBoolean(String msg){
        System.out.print(msg);
        return getBoolean();
    }

    public boolean getBoolean(String msg, String msgError, String sim, String nao){
        String escolha;
        boolean retornoEscolha = true;
        do {
            escolha = getString(msg);
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

    public Acoes setAcoes(){
        Acoes acoes = new Acoes();
        acoes.descricao = getString("Informe a descrição desta ação: ");
        acoes.mes = getInt("Informe o mês desta ação em números: ", "O mês tem que ser entre 1 até 12", 1, 12);
        setTrimestre(acoes, acoes.mes);
        acoes.ano = getInt("Informe o ano desta ação: ", "O ano não pode ser menor que 2015 e nem maior que 2020", 2015, 2020);
        acoes.acaoPrioritaria = getBoolean("Esta é uma ação prioritária? [S]Sim [N]Não: ", "Digite somente [S]SIm ou [N]Não", "S", "N");

        return acoes;
    }

    public Acoes setTrimestre(Acoes acoes, int mes){
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
            default:
                System.out.println("Erro inesperado!");
                break;
        }
        return acoes;
    }

    public UnidadeAdministrativa setUnidadeAdministrativa(){
        UnidadeAdministrativa unidade = new UnidadeAdministrativa();

        unidade.nome = getString("Informe o nome da unidade administrativa: ");

        return setUnidadeAdministrativa(unidade);
    }

    public UnidadeAdministrativa setUnidadeAdministrativa
            (UnidadeAdministrativa unidade){
        int quantidadeDeAcoes = getInt("Quantas ações tem essa unidade administrativa? ");

        unidade.quantidadeDeAcoes = quantidadeDeAcoes;
        unidade.acoes = new Acoes[quantidadeDeAcoes];

        for (int i = 0; i < unidade.acoes.length; i++) {
            unidade.acoes[i] = setAcoes();
        }

        return unidade;
    }
}
