public class Acao{
    private String descricao;
    private int mes;
    private int ano;

    public static boolean isPrioritaria(int ano){
        if(ano == 2015 || ano == 2016){
            return true;
        }else{
            return false;
        }
    }

    public static String findQuarterAction(int mes){
        return switch (mes) {
            case 1, 2, 3 -> "Primeiro";
            case 4, 5, 6 -> "Segundo";
            case 7, 8, 9 -> "Terceiro";
            case 10, 11, 12 -> "Quarto";
            default -> "Trimestre inválido";
        };
    }

    public static int quantidadeAcoes(UnidadeAdministrativa unidade) {
        int qtdAcoes = 0;

        for (Acao acao : unidade.acoes) {
            if (acao.getAno() == 2017) {
                qtdAcoes++;
            }
        }

        return qtdAcoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  "\nDescrição:" + getDescricao() +
                "\nMês: " + getMes() +
                "\nAno: " + getAno() +
                "\nÉ prioritária? " + (isPrioritaria(getAno()) ? "Sim" : "Não") +
                "\nTrimestre da Ação: " + findQuarterAction(getMes());
    }
}
