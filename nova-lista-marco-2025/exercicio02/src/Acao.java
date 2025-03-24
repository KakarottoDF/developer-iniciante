public class Acao {
    String descricao;
    int mes;
    int ano;
    boolean acaoPrioritaria;

    //ação

    public boolean isAcaoPrioritaria(){
        return (ano == 2015 || ano == 2016);
    }

    public String getTrimestre(){
        // fazer o retorno com número
        //fazer um método
        switch(mes){
            case 1, 2, 3:
                return "Primeiro";
            case 4, 5, 6:
                return "Segundo";
            case 7, 8, 9:
                return "Terceiro";
            case 10, 11, 12:
                return "Quarto";
        }
        return "";
    }


    public String toString(){
        String acoes =
                "Descrição: " + this.descricao +
                "\nPreço da franquia: " + this.mes +
                "\nDia de expiração: " + this.ano +
                "\nA ação é prioritária: " + (isAcaoPrioritaria() ? "Sim" : "Não") +
                "\nTrimestre: " + getTrimestre();

        return acoes;
    }


}
