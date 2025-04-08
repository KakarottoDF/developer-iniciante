public class Acao {
    private String descricao;
    private int mes;
    private int ano;
    private boolean acaoPrioritaria;
    private String trimestre;

    public static String trimestreDaAcao(int mes){
        Acao acao = new Acao();
        mes = acao.getMes();

        return switch (mes) {
            case 1, 2, 3 -> "Primeiro";
            case 4, 5, 6 -> "Segundo";
            case 7, 8, 9 -> "Terceiro";
            case 10, 11, 12 -> "Quarto";
            default -> "ERRO";
        };
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

    public boolean isAcaoPrioritaria() {
        return acaoPrioritaria;
    }

    public void setAcaoPrioritaria(boolean acaoPrioritaria) {
        if(getAno() < 2017){
            this.acaoPrioritaria = false;
        }else {
            if (getAno() > 2014 && getAno() < 2017) {
                this.acaoPrioritaria = true;
            }else{
                this.acaoPrioritaria = acaoPrioritaria;
            }
        }
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "descricao='" + getDescricao() + '\'' +
                ", mes=" + getMes() +
                ", ano=" + getAno() +
                ", acaoPrioritaria=" + isAcaoPrioritaria() +
                ", trimestre='" + getTrimestre() + '\'' +
                '}';
    }
}
