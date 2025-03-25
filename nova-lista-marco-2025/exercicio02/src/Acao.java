public class Acao {
    String descricao;
    int mes;
    int ano;

    //ação

    public boolean isAcaoPrioritaria(){
        return (ano == 2015 || ano == 2016);
    }

    public int getTrimestre(){
        // fazer o retorno com número
        //fazer um método
        return switch (this.mes) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> 0;
        };
    }

    public String getNomeTrimestre(){
        switch (getTrimestre()) {
            case 1:
                return "Primeiro";
            case 2:
                return "Segundo";
            case 3:
                return "Terceiro";
            case 4:
                return "Quarto";
            default:
                return "Trimestre não informado!";
            }
        }

    public String toString(){
        String acoes =
                "Descrição: " + this.descricao +
                        "\nPreço da franquia: " + this.mes +
                        "\nDia de expiração: " + this.ano +
                        "\nA ação é prioritária: " + (isAcaoPrioritaria() ? "Sim" : "Não") +
                        "\nTrimestre: " + getNomeTrimestre();

        return acoes;
    }
}
