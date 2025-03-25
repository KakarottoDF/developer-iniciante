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

    public Acao preencherAcoes(){
        Acao acoes = new Acao();
        acoes.descricao = setString("Informe a descrição desta ação: ");
        acoes.mes = setInt("Informe o mês desta ação em números: ", "O mês tem que ser entre 1 até 12", 1, 12);
        acoes.ano = setInt("Informe o ano desta ação: ", "O ano não pode ser menor que 2015 e nem maior que 2020", 2015, 2020);

        return acoes;
    }

    public UnidadeAdministrativa preencherUnidadeAdministrativa(){
        UnidadeAdministrativa unidade = new UnidadeAdministrativa();

        unidade.nome = setString("Informe o nome da unidade administrativa: ");

        return preencherUnidadeAdministrativa(unidade);
    }

    public UnidadeAdministrativa preencherUnidadeAdministrativa
            (UnidadeAdministrativa unidade){
        int quantidadeDeAcoes = setInt("Quantas ações tem essa unidade administrativa? ");

        unidade.acoes = new Acao[quantidadeDeAcoes];

        for (int i = 0; i < unidade.acoes.length; i++) {
            unidade.acoes[i] = preencherAcoes();
        }

        return unidade;
    }
}
