public class Acoes{
    String descricao;
    int mes;
    int ano;
    boolean acaoPrioritaria;
    String trimestre;

    public String toString(){
        String acoes =
                "Descrição: " + this.descricao +
                "\nPreço da franquia: " + this.mes +
                "\nDia de expiração: " + this.ano +
                "\nA ação é prioritária: " + (this.acaoPrioritaria ? "Sim" : "Não") +
                "\nTrimestre: " + this.trimestre;

        return acoes;
    }

    public int contarAcoes2017(UnidadeAdministrativa unidade) {
        int contador = 0;

        for (Acoes acao : unidade.acoes) {
            if (acao.ano == 2017) {
                contador++;
            }
        }

        return contador;
    }
}
